package com.edu.pk.gulehri.meraallah.model;

public class CountriesList {

    private final String Country;
    private final String Currency;

    public CountriesList(String country, String currency) {
        Country = country;
        Currency = currency;
    }

    public static final CountriesList[] COUNTRY_CURRENCY ={
            new CountriesList("Afghanistan","AFN"),
            new CountriesList("Albania","ALL"),
            new CountriesList("Algeria","DZD"),
            new CountriesList("Argentina","ARS"),
            new CountriesList("Australia","AUD"),
            new CountriesList("Bahrain", "BHD"),
            new CountriesList("Bangladesh", "BDT"),
            new CountriesList("Brazil", "BRL"),
            new CountriesList("Canada", "CAD"),
            new CountriesList("Chile", "CLP"),
            new CountriesList("China", "CNY"),
            new CountriesList("Colombia", "COP"),
            new CountriesList("Denmark", "DKK"),
            new CountriesList("Egypt", "EGP"),
            new CountriesList("Hong Kong", "HKD"),
            new CountriesList("Hungary", "HUF"),
            new CountriesList("Iceland", "ISK"),
            new CountriesList("India", "INR"),
            new CountriesList("Indonesia", "IDR"),
            new CountriesList("Iran", "IRR"),
            new CountriesList("Iraq", "IQD"),
            new CountriesList("Ireland", "EUR"),
            new CountriesList("Israel", "ILS"),
            new CountriesList("Japan", "JPY"),
            new CountriesList("Kenya", "KES"),
            new CountriesList("Kuwait", "KWD"),
            new CountriesList("Lebanon", "LBP"),
            new CountriesList("Malaysia", "MYR"),
            new CountriesList("Mexico", "MXN"),
            new CountriesList("Morocco", "MAD"),
            new CountriesList("New Zealand", "NZD"),
            new CountriesList("Norway", "NOK"),
            new CountriesList("Oman", "OMR"),
            new CountriesList("Pakistan", "PKR"),
            new CountriesList("Philippines", "PHP"),
            new CountriesList("Poland", "PLN"),
            new CountriesList("Qatar", "QAR"),
            new CountriesList("Romania", "RON"),
            new CountriesList("Russia", "RUB"),
            new CountriesList("Saudi Arabia", "SAR"),
            new CountriesList("Singapore", "SGD"),
            new CountriesList("South Africa", "ZAR"),
            new CountriesList("South Korea", "KRW"),
            new CountriesList("Sri Lanka", "LKR"),
            new CountriesList("Sweden", "SEK"),
            new CountriesList("Switzerland", "CHF"),
            new CountriesList("Thailand", "THB"),
            new CountriesList("Trinidad and Tobago", "TTD"),
            new CountriesList("Tunisia", "TND"),
            new CountriesList("Turkey", "TRY"),
            new CountriesList("UAE", "AED"),
            new CountriesList("UK", "GBP"),
            new CountriesList("USA", "USD"),
            new CountriesList("Venezuela", "VES"),
            new CountriesList("Vietnam", "VND"),
            new CountriesList("Zambia", "ZMK"),
    };


    public String getCountry() {
        return Country;
    }

    public String getCurrency() {
        return Currency;
    }
}
