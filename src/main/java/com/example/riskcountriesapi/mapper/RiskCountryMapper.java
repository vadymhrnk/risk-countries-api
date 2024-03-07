package com.example.riskcountriesapi.mapper;

import com.example.riskcountriesapi.config.MapperConfig;
import com.example.riskcountriesapi.dto.external.RiskCountryResponseDto;
import com.example.riskcountriesapi.dto.internal.RiskCountryDto;
import com.example.riskcountriesapi.model.RiskCountry;
import java.util.List;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface RiskCountryMapper {
    RiskCountry toModel(RiskCountryResponseDto responseDto);

    RiskCountryDto toDto(RiskCountry riskCountry);

    @IterableMapping(elementTargetType = RiskCountryDto.class)
    List<RiskCountryDto> toDtoList(List<RiskCountry> riskCountries);
}
