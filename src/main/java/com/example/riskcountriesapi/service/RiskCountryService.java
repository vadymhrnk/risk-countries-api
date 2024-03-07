package com.example.riskcountriesapi.service;

import com.example.riskcountriesapi.dto.internal.RiskCountryDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface RiskCountryService {
    List<RiskCountryDto> findCountriesByName(String name, Pageable pageable);

    RiskCountryDto findCountryByCode(int code);
}
