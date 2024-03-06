package com.example.riskcountriesapi.service;

import com.example.riskcountriesapi.dto.external.RiskCountryResponseDto;
import com.example.riskcountriesapi.mapper.RiskCountryMapper;
import com.example.riskcountriesapi.model.RiskCountry;
import com.example.riskcountriesapi.repository.RiskCountryRepository;
import jakarta.annotation.PostConstruct;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseInit {
    private final RiskCountryClient riskCountryClient;
    private final RiskCountryMapper riskCountryMapper;
    private final RiskCountryRepository riskCountryRepository;

    @PostConstruct
    private void init() {
        List<RiskCountryResponseDto> countries = riskCountryClient.getCountries();

        List<RiskCountry> riskCountries = countries.stream()
                .map(riskCountryMapper::toModel)
                .toList();
        riskCountryRepository.saveAll(riskCountries);
    }
}
