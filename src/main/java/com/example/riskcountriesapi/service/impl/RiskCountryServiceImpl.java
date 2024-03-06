package com.example.riskcountriesapi.service.impl;

import com.example.riskcountriesapi.dto.internal.RiskCountryDto;
import com.example.riskcountriesapi.exception.EntityNotFoundException;
import com.example.riskcountriesapi.mapper.RiskCountryMapper;
import com.example.riskcountriesapi.model.RiskCountry;
import com.example.riskcountriesapi.repository.RiskCountryRepository;
import com.example.riskcountriesapi.service.RiskCountryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RiskCountryServiceImpl implements RiskCountryService {
    private final RiskCountryRepository riskCountryRepository;
    private final RiskCountryMapper riskCountryMapper;

    @Override
    public List<RiskCountryDto> findCountriesByName(String name, Pageable pageable) {
        List<RiskCountry> riskCountries = riskCountryRepository
                .findAllByCountryName(name, pageable);
        return riskCountries.stream()
                .map(riskCountryMapper::toDto)
                .toList();
    }

    @Override
    public RiskCountryDto findCountryByCode(int code) {
        RiskCountry riskCountry = riskCountryRepository.findByCodecountr(code).orElseThrow(
                () -> new EntityNotFoundException("Can't find country by code: " + code)
        );
        return riskCountryMapper.toDto(riskCountry);
    }
}
