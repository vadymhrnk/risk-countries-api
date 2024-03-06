package com.example.riskcountriesapi.mapper;

import com.example.riskcountriesapi.config.MapperConfig;
import com.example.riskcountriesapi.dto.external.RiskCountryResponseDto;
import com.example.riskcountriesapi.dto.internal.RiskCountryDto;
import com.example.riskcountriesapi.model.RiskCountry;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface RiskCountryMapper {
    RiskCountry toModel(RiskCountryResponseDto responseDto);

    RiskCountryDto toDto(RiskCountry riskCountry);
}
