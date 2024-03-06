package com.example.riskcountriesapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "countries_info")
public class CountryInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int ccn3;
    private String official;
    private String common;
    @Column(length = 2048)
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
    private String flagPng;
    private String flagSvg;
    @Column(length = 2048)
    private String flagAlt;
    private String format;
    private String regex;
    private String coaPng;
    private String coaSvg;
    private String iddRoot;
    @Column(length = 2048)
    private String iddSuffixes;
    private String languages;
    @Column(length = 3056)
    private String translations;
    private String tld;
    private String capital;
    private String altSpellings;
    private String latlng;
    private String borders;
    private String timezones;
    private String continents;
}
