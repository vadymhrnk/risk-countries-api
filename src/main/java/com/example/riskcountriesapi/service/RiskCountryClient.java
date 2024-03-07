package com.example.riskcountriesapi.service;

import com.example.riskcountriesapi.dto.external.RiskCountryResponseDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RiskCountryClient {
    private static final String URL = "http://analityk1.com.ua:9111/api/reference/RiskCountries";

    private final ObjectMapper objectMapper;

    public List<RiskCountryResponseDto> getCountries() {
        HttpClient httpClient = HttpClient.newHttpClient();

        try {
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(URL))
                    .build();

            HttpResponse<String> response = httpClient.send(
                    httpRequest,
                    HttpResponse.BodyHandlers.ofString()
            );

            return objectMapper.readValue(
                    response.body(),
                    new TypeReference<>() {
                    }
            );
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
