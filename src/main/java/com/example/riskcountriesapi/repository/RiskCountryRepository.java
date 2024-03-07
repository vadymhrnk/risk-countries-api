package com.example.riskcountriesapi.repository;

import com.example.riskcountriesapi.model.RiskCountry;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskCountryRepository extends JpaRepository<RiskCountry, Long> {
    @Query("""
            SELECT DISTINCT r
            FROM RiskCountry r
            LEFT JOIN FETCH r.countryInfo
            WHERE
                LOWER(r.namecountr) LIKE CONCAT('%', LOWER(:name), '%')
                OR LOWER(r.namecountrfull) LIKE CONCAT('%', LOWER(:name), '%')
                OR LOWER(r.namecountrlat) LIKE CONCAT('%', LOWER(:name), '%')
                OR LOWER(r.namealt) LIKE CONCAT('%', LOWER(:name), '%')
            """)
    List<RiskCountry> findAllByCountryName(String name, Pageable pageable);

    @Query("""
            SELECT r
            FROM RiskCountry r
            LEFT JOIN FETCH r.countryInfo
            WHERE r.codecountr = :countryCode
            """)
    Optional<RiskCountry> findByCountryCode(int countryCode);
}
