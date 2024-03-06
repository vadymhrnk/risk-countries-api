package com.example.riskcountriesapi.dto.external;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class RiskCountryResponseDto {
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
    private CountryInfoDto countryInfo;
}
