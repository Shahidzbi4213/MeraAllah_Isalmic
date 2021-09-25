package com.edu.pk.gulehri.meraallah.model;

public class SurahList {

    private String name;
    private String englishName;
    private String englishNameTranslation;
    private String numberOfAyahs;
    private String type;

    public SurahList(String name, String englishName, String englishNameTranslation, String numberOfAyahs, String type) {
        this.name = name;
        this.englishName = englishName;
        this.englishNameTranslation = englishNameTranslation;
        this.numberOfAyahs = numberOfAyahs;
        this.type = type;
    }

    public SurahList() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishNameTranslation() {
        return englishNameTranslation;
    }

    public void setEnglishNameTranslation(String englishNameTranslation) {
        this.englishNameTranslation = englishNameTranslation;
    }

    public String getNumberOfAyahs() {
        return numberOfAyahs;
    }

    public void setNumberOfAyahs(String numberOfAyahs) {
        this.numberOfAyahs = numberOfAyahs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
