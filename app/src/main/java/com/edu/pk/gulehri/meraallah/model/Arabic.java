package com.edu.pk.gulehri.meraallah.model;

public class Arabic {

    private String verseNumber;
    private String quranArabic;
    private String quranUrdu;
    private String quranEnglish;
    private int a;
    private double b;


    public Arabic(String verseNumber, String quranArabic) {
        this.verseNumber = verseNumber;
        this.quranArabic = quranArabic;
    }


    public Arabic(String verseNumber, String quranUrdu, int a) {
        this.verseNumber = verseNumber;
        this.quranUrdu = quranUrdu;
        this.a = a;
    }

    public Arabic(String verseNumber, String quranEnglish, double b) {
        this.verseNumber = verseNumber;
        this.quranEnglish = quranEnglish;
        this.b = b;
    }


    public String getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(String verseNumber) {
        this.verseNumber = verseNumber;
    }

    public String getQuranArabic() {
        return quranArabic;
    }

    public void setQuranArabic(String quranArabic) {
        this.quranArabic = quranArabic;
    }

    public String getQuranUrdu() {
        return quranUrdu;
    }

    public void setQuranUrdu(String quranUrdu) {
        this.quranUrdu = quranUrdu;
    }

    public String getQuranEnglish() {
        return quranEnglish;
    }

    public void setQuranEnglish(String quranEnglish) {
        this.quranEnglish = quranEnglish;
    }
}
