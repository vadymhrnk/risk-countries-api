package com.example.riskcountriesapi.controller;

import com.example.riskcountriesapi.dto.internal.RiskCountryDto;
import com.example.riskcountriesapi.service.RiskCountryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Countries selector", description = "Endpoint for viewing countries")
@RestController
@RequiredArgsConstructor
@RequestMapping("/countries")
public class RiskCountryController {
    private final RiskCountryService riskCountryService;

    @GetMapping("/name")
    @Operation(
            summary = "Get countries by name",
            description = "Get a list of countries by name"
    )
    public List<RiskCountryDto> getRiskCountriesByName(
            @RequestParam String name,
            Pageable pageable
    ) {
        return riskCountryService.findCountriesByName(name, pageable);
    }

    @GetMapping("/code")
    @Operation(
            summary = "Get a country by code",
            description = "Get a country by code"
    )
    public RiskCountryDto getRiskCountriesByCode(@RequestParam int code) {
        return riskCountryService.findCountryByCode(code);
    }
}
