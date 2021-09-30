package com.edu.pk.gulehri.meraallah.model;

public class Arabic {

    private String verseNumber;
    private String quranArabic;


    public Arabic(String verseNumber, String quranArabic) {
        this.verseNumber = verseNumber;
        this.quranArabic = quranArabic;
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
}
