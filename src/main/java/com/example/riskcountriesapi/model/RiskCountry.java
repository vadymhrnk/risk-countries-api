package com.example.riskcountriesapi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

@Entity
@Data
@Table(name = "risk_countries")
public class RiskCountry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int codecountr;
    private String alpha3countr;
    private String alpha2countr;
    private String namecountr;
    private String namecountrfull;
    private String namecountrlat;
    private String flagcountr;
    private String namealt;
    private boolean eublack;
    private boolean eugray;
    private boolean fatfblack;
    private boolean fatfgray;
    private boolean oecdblack;
    private boolean oecdgray;
    private boolean kmu1045;
    private boolean kmu143;
    private boolean terrorism;
    private int coruption;
    private int haven;
    private BigDecimal global;
    private boolean doubletax;
    private boolean thirdcountries;
    private BigDecimal moneylaundering;
    private BigDecimal terrorismindex;
    private boolean sectoral;
    private boolean dangerous;
    private boolean eresident;
    private boolean processed;
    private boolean cyrillicnamed;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "country_info_id")
    private CountryInfo countryInfo;
}
