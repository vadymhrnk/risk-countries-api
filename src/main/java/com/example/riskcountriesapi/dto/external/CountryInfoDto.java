package com.example.riskcountriesapi.dto.external;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CountryInfoDto {
    private int ccn3;
    private String official;
    private String common;
    private String nativename;
    private String currencies;
    private String cca2;
    private String cca3;
    private boolean independent;
    private String status;
    private boolean unmember;
    private String region;
    private String subregion;
    private boolean landlocked;
    private int area;
    private String flag;
    private int population;
    private String startofweek;
    private String googlemaps;
    private String openstreetmaps;
    @JsonProperty("flag_png")
    private String flagPng;
    @JsonProperty("flag_svg")
    private String flagSvg;
    @JsonProperty("flag_alt")
    private String flagAlt;
    private String format;
    private String regex;
    @JsonProperty("coa_png")
    private String coaPng;
    @JsonProperty("coa_svg")
    private String coaSvg;
    @JsonProperty("idd_root")
    private String iddRoot;
    @JsonProperty("idd_suffixes")
    private String iddSuffixes;
    private String languages;
    private String translations;
    private String tld;
    private String capital;
    private String altSpellings;
    private String latlng;
    private String borders;
    private String timezones;
    private String continents;
}
