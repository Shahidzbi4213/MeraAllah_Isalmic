package com.edu.pk.gulehri.meraallah.model;

import com.edu.pk.gulehri.meraallah.R;

import static com.edu.pk.gulehri.meraallah.R.drawable.calender;
import static com.edu.pk.gulehri.meraallah.R.drawable.charity;
import static com.edu.pk.gulehri.meraallah.R.drawable.child;
import static com.edu.pk.gulehri.meraallah.R.drawable.clock;
import static com.edu.pk.gulehri.meraallah.R.drawable.graveyard;
import static com.edu.pk.gulehri.meraallah.R.drawable.hadith;
import static com.edu.pk.gulehri.meraallah.R.drawable.hajj;
import static com.edu.pk.gulehri.meraallah.R.drawable.kalimas;
import static com.edu.pk.gulehri.meraallah.R.drawable.khaba;
import static com.edu.pk.gulehri.meraallah.R.drawable.madina;
import static com.edu.pk.gulehri.meraallah.R.drawable.namaz;
import static com.edu.pk.gulehri.meraallah.R.drawable.qaida;
import static com.edu.pk.gulehri.meraallah.R.drawable.qibla_compass;
import static com.edu.pk.gulehri.meraallah.R.drawable.quiz_icon;
import static com.edu.pk.gulehri.meraallah.R.drawable.quran;
import static com.edu.pk.gulehri.meraallah.R.drawable.quranfifteen;
import static com.edu.pk.gulehri.meraallah.R.drawable.ramadan;
import static com.edu.pk.gulehri.meraallah.R.drawable.shahada;
import static com.edu.pk.gulehri.meraallah.R.drawable.supplications;
import static com.edu.pk.gulehri.meraallah.R.drawable.tasbeeh;
import static com.edu.pk.gulehri.meraallah.R.drawable.vibrate;
import static com.edu.pk.gulehri.meraallah.R.drawable.video;
import static com.edu.pk.gulehri.meraallah.R.drawable.waddu;

public class Model {

    public static final Model[] ALLAH = {
            new Model("اَللَّهُ", "ALLAH", "The Greatest Name, GOD", "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "In the name of Allah , the Entirely Merciful, the Especially Merciful. [1:1]"),
            new Model("اَلرَّحْمَنُ", "AR-RAHMAAN", "The Most Beneficent", "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "In the name of Allah , the Entirely Merciful, the Especially Merciful. [1:1]"),
            new Model("اَلرَّحِیمُ", "AR-RAHEEM", "The Ever-Merciful", "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "In the name of Allah , the Entirely Merciful, the Especially Merciful. [1:1]"),
            new Model("اَلْمَلِكُ", "AL-MALIK", "The King", "فَتَعَـٰلَى ٱللَّهُ ٱلْمَلِكُ ٱلْحَقُّ ۖ لَآ إِلَـٰهَ إِلَّا هُوَ رَبُّ ٱلْعَرْشِ ٱلْكَرِيمِ", "Exalted is Allah, the True King! There is no god ˹worthy of worship˺ except Him, the Lord of the Honourable Throne. [23:116]"),
            new Model("اَلْقُدُّوسُ", "AL-QUDDUS", "The All-Pure", "يُسَبِّحُ لِلَّهِ مَا فِى ٱلسَّمَـٰوَٰتِ وَمَا فِى ٱلْأَرْضِ ٱلْمَلِكِ ٱلْقُدُّوسِ ٱلْعَزِيزِ ٱلْحَكِيمِ", "Whatever is in the heavens and whatever is on the earth ˹constantly˺ glorifies Allah—the King, the Most Holy, the Almighty, the All-Wise. [62:1]"),
            new Model("اَلسَّلاَمُ", "AS-SALAM", "The Giver of Peace", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer, the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْمُؤْمِنُ", "AL-MUMIN", "The Granter of Security and The Giver of Belief (Emaan)", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer, the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْمُھَیْمِنُ", "AL-MUHAYMIN", " The Absolute Guardian Over All", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer, the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْعَزِیزُ", "AL-AZEEZ", "The Almighty", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer, the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْجَبَّارُ", "AL-JABBAR", "The Supreme Power", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer (dominant), the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْمُتَكَبِّرُ", "AL-MUTAKABBIR", "The Possessor of Greatness", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer (dominant), the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْخَالِقُ", "AL-KHAALIQ", "The Creator", "هُوَ اللَّهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ...", "He is Allah , the Creator, the Inventor, the Fashioner... [59:24]"),
            new Model("اَلْبَارِئُ", "AL-BAARI", "The Evolver", "هُوَ اللَّهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ...", "He is Allah , the Creator, the Inventor (originator), the Fashioner... [59:24]"),
            new Model("اَلْمُصَوِّرُ", "AL-MUSAWWIR", "The Artist", "هُوَ اللَّهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ...", "He is Allah: the Creator, the Inventor, the Shaper.... [59:24]"),
            new Model("اَلْغَفَّارُ", "AL-GHAFFAR", "The Absolute Forgiver", "فَقُلْتُ ٱسْتَغْفِرُوا۟ رَبَّكُمْ إِنَّهُۥ كَانَ غَفَّارًۭا", "Saying, ‘Seek your Lord’s forgiveness, ˹for˺ He is truly Most Forgiving. [71:10]"),
            new Model("اَلْقَهَّارُ", "AL-QAHHAR", "The All-Prevailing One", "هُوَ اللَّهُ الْوَاحِدُ الْقَهَّارُ", "He is Allah , the One, the Prevailing. [39:4]"),
            new Model("اَلْوَهَّابُ", "AL-WAHHAAB", "The Absolute Bestower", "أَمْ عِندَهُمْ خَزَآئِنُ رَحْمَةِ رَبِّكَ ٱلْعَزِيزِ ٱلْوَهَّابِ", "Or ˹is it because˺ they possess the treasuries of the mercy of your Lord—the Almighty, the Giver ˹of all bounties˺. [38:9]"),
            new Model("اَلْرَّزَّاقُ", "AR-RAZZAAQ", "The All-Provider", "إِنَّ اللَّهَ هُوَ الرَّزَّاقُ ذُو الْقُوَّةِ الْمَتِينُ", "Indeed, it is Allah who is the Provider, the firm possessor of strength. [51:58]"),
            new Model("اَلْفَتَّاحُ", "AL-FATTAAH", "The Opener of the Gates of Profits", "...وَهُوَ الْفَتَّاحُ الْعَلِيمُ", "...And He is the Knowing Judge (Arbiter). [34:26]"),
            new Model("اَلْعَلِيمُ", "AL-ALEEM", "The Possessor of Knowing Much of Ever Thing", "إِنَّ رَبَّكَ هُوَ ٱلْخَلَّـٰقُ ٱلْعَلِيمُ", "Surely your Lord is the Master Creator, All-Knowing. [15:86]"),
            new Model("اَلْقَابِضُ", "AL-QAABID", "The Withholder", "مَّن ذَا ٱلَّذِى يُقْرِضُ ٱللَّهَ قَرْضًا حَسَنًۭا فَيُضَـٰعِفَهُۥ لَهُۥٓ أَضْعَافًۭا كَثِيرَةًۭ ۚ وَٱللَّهُ يَقْبِضُ وَيَبْصُۜطُ وَإِلَيْهِ تُرْجَعُونَ", "Who will lend to Allah a good loan which Allah will multiply many times over? It is Allah ˹alone˺ who decreases and increases ˹wealth˺. And to Him you will ˹all˺ be returned. [2:245]"),
            new Model("اَلْبَاسِطُ", "AL-BAASIT", "The Generous Provider", "مَّن ذَا ٱلَّذِى يُقْرِضُ ٱللَّهَ قَرْضًا حَسَنًۭا فَيُضَـٰعِفَهُۥ لَهُۥٓ أَضْعَافًۭا كَثِيرَةًۭ ۚ وَٱللَّهُ يَقْبِضُ وَيَبْصُۜطُ وَإِلَيْهِ تُرْجَعُونَ", "Who will lend to Allah a good loan which Allah will multiply many times over? It is Allah ˹alone˺ who decreases and increases ˹wealth˺. And to Him you will ˹all˺ be returned. [2:245]"),
            new Model("اَلْخَافِضُ", "AL-KHAAFIDH", "The Humiliator", "خَافِضَةٌۭ رَّافِعَةٌ", "It will debase ˹some˺ and elevate ˹others˺. [56:3]"),
            new Model("اَلْرَّافِعُ", "AR-RAAFI", "The Upgrader", "... نَرْفَعُ دَرَجَـٰتٍۢ مَّن نَّشَآءُ ۗ... ", "...We elevate in rank whoever We please... [6:83]"),
            new Model("اَلْمُعِزُ", "AL-MUIZZ", "The Bestower of Honor", "قُلِ ٱللَّهُمَّ مَـٰلِكَ ٱلْمُلْكِ تُؤْتِى ٱلْمُلْكَ مَن تَشَآءُ وَتَنزِعُ ٱلْمُلْكَ مِمَّن تَشَآءُ وَتُعِزُّ مَن تَشَآءُ وَتُذِلُّ مَن تَشَآءُ ۖ...", "Say, ˹O Prophet,˺ “O Allah! Lord over all authorities! You give authority to whoever You please and remove it from who You please; You honour whoever You please and disgrace who You please... [3:26]"),
            new Model("اَلْمُذِلُّ", "AL-MUZIL", "The Giver of Disgrace", "قُلِ ٱللَّهُمَّ مَـٰلِكَ ٱلْمُلْكِ تُؤْتِى ٱلْمُلْكَ مَن تَشَآءُ وَتَنزِعُ ٱلْمُلْكَ مِمَّن تَشَآءُ وَتُعِزُّ مَن تَشَآءُ وَتُذِلُّ مَن تَشَآءُ ۖ...", "Say, ˹O Prophet,˺ “O Allah! Lord over all authorities! You give authority to whoever You please and remove it from who You please; You honour whoever You please and disgrace who You please... [3:26]"),
            new Model("اَلْسَّمِيعُ", "AS-SAMEE", "The All-Hearing", "...إِنَّ ٱللَّهَ سَمِيعٌ عَلِيمٌۭ", "...surely Allah is All-Hearing, All-Knowing. [2:127]"),
            new Model("اَلْبَصِيرُ", "AL-BASEER", "The All-Seeing", "...إِنَّهُ هُوَ السَّمِيعُ البَصِيرُ", "…Indeed, He is the Hearing, the Seeing. [17:1]"),
            new Model("اَلْحَكَمُ", "AL-HAKAM", "The Judge", " إِنَّ اللَّهَ هُوَ الْحَكَمُ وَإِلَيْهِ الْحُكْمُ...", "Allah is Al-Hakam (the Judge) and judgment is His… [Nasa’i 5387]"),
            new Model("اَلْعَدْلُ", "AL-ADL", "THE EMBODIMENT OF JUSTICE", "لم يرد ذكرها في القرآن.", "Not Quranic, see al-Kafʿamī (1992:40)"),
            new Model("اَلْلَّطِيفُ", "AL-LATEEF", "The All-Subtle", "أَلَمْ تَرَ أَنَّ ٱللَّهَ أَنزَلَ مِنَ ٱلسَّمَآءِ مَآءًۭ فَتُصْبِحُ ٱلْأَرْضُ مُخْضَرَّةً ۗ إِنَّ ٱللَّهَ لَطِيفٌ خَبِيرٌۭ", "Do you not see that Allah sends down rain from the sky, then the earth becomes green? Surely Allah is Most Subtle, All-Aware. [26:63]"),
            new Model("اَلْخَبِيرُ", "AL-KHABEER", "The All-Aware", "...إِنَّ اللَّهَ لَطِيفٌ خَبِيرٌ", "…Indeed, Allah is Subtle and Acquainted. [22:63]"),
            new Model("اَلْحَلِيمُ", "AL-HALEEM", "The Most Forbearing", "إِنَّ اللّهَ غَفُورٌ حَلِيمٌ", "…Indeed, Allah is Forgiving and Forbearing.” [3:155] "),
            new Model("اَلْعَظِيمُ", "AL-AZHEEM", "The Most Great, The Ever-Magnificent", "لَهُۥ مَا فِى ٱلسَّمَـٰوَٰتِ وَمَا فِى ٱلْأَرْضِ ۖ وَهُوَ ٱلْعَلِىُّ ٱلْعَظِيمُ", "To Him belongs whatever is in the heavens and whatever is on the earth. And He is the Most High, the Greatest. [42:4]"),
            new Model("اَلْغَفُورُ", "AL-GHAFOOR", "The Great Forgiver", "نُزُلًۭا مِّنْ غَفُورٍۢ رَّحِيمٍۢ", "an accommodation from the All-Forgiving, Most Merciful ˹Lord˺. [41:32]"),
            new Model("اَلْشَّكُورُ", "ASH-SHAKOOR", "The Most Appreciative", "لِيُوَفِّيَهُمْ أُجُورَهُمْ وَيَزِيدَهُم مِّن فَضْلِهِۦٓ ۚ إِنَّهُۥ غَفُورٌۭ شَكُورٌۭ", "so that He will reward them in full and increase them out of His grace. He is truly All-Forgiving, Most Appreciative. [35:30]"),
            new Model("اَلْعَلِيُّ", "AL-ALEE", "The Most High", "...وَلَا يَئُودُهُ حِفْظُهُمَا ۚ وَهُوَ الْعَلِيُّ الْعَظِيمُ", "....and their preservation tires Him not. And He is the Most High, the Most Great. [2:255]"),
            new Model("اَلْكَبِيرُ", "AL-KABEER", "The All-Heedful and All-Protecting", "عَـٰلِمُ ٱلْغَيْبِ وَٱلشَّهَـٰدَةِ ٱلْكَبِيرُ ٱلْمُتَعَالِ", "˹He is the˺ Knower of the seen and the unseen—the All-Great, Most Exalted. [13:9]"),
            new Model("اَلْحَفِيظُ", "AL-HAFEEDH", "The All-Watching", "...فَاللّهُ خَيْرٌ حَافِظًا وَهُوَ أَرْحَمُ الرَّاحِمِينَ", "…But Allah is the best guardian… [12:64]"),
            new Model("اَلْمُقِيتُ", "AL-MUQEET", "The Sustainer", "...وَكَانَ اللّهُ عَلَى كُلِّ شَيْءٍ مُّقِيتًا", "...And Allah is Watchful over all things. [4:85]"),
            new Model("اَلْحَسِيبُ", "AL-HASEEB", "The Ever-Reckoner", "....إِنَّ اللّهَ كَانَ عَلَى كُلِّ شَيْءٍ حَسِيبًا", "…Indeed, Allah is ever, over all things, an Accountant (Ever-Reckoner). [4:86]"),
            new Model("اَلْجَلِيلُ", "AL-JALEEL", "The Majestic", "وَيَبْقَىٰ وَجْهُ رَبِّكَ ذُو ٱلْجَلَـٰلِ وَٱلْإِكْرَامِ", "Only your Lord Himself, full of Majesty and Honour, will remain ˹forever˺. [55:27]"),
            new Model("اَلْكَرِيمُ", "AL-KAREEM", "The Most Generous", "يَـٰٓأَيُّهَا ٱلْإِنسَـٰنُ مَا غَرَّكَ بِرَبِّكَ ٱلْكَرِيمِ", "O humanity! What has emboldened you against your Lord, the Most Generous, [82:6]"),
            new Model("اَلْرَّقِيبُ", "AR-RAQEEB", "The Ever-Watchful", "...إِنَّ رَبِّي قَرِيبٌ مُّجِيبٌ", "…Indeed, my Lord is near and responsive. [11:61]"),
            new Model("اَلْمُجِيبُ", "AL-MUJEEB", "The Supreme Answerer", "...إِنَّ رَبِّي قَرِيبٌ مُّجِيبٌ", "…Indeed, my Lord is near and responsive. [11:61]"),
            new Model("اَلْوَاسِعُ", "AL-WAASI", "The All-Encompassing", "...وَٱللَّهُ وَٰسِعٌ عَلِيمٌۭ", "...And Allah is All-Bountiful, All-Knowing. [2:268]"),
            new Model("اَلْحَكِيمُ", "AL-HAKEEM", "The Ever-Wise", "تَنزِيلُ ٱلْكِتَـٰبِ مِنَ ٱللَّهِ ٱلْعَزِيزِ ٱلْحَكِيمِ", "The revelation of this Book is from Allah—the Almighty, All-Wise. [46:2]"),
            new Model("اَلْوَدُودُ", "AL-WADOOD", "The Most Loving", "وَهُوَ ٱلْغَفُورُ ٱلْوَدُودُ", "And He is the All-Forgiving, All-Loving— [85:14]"),
            new Model("اَلْمَجِيدُ", "AL-MAJEED", "The Most Honorable", "...رَحْمَتُ ٱللَّهِ وَبَرَكَـٰتُهُۥ عَلَيْكُمْ أَهْلَ ٱلْبَيْتِ ۚ إِنَّهُۥ حَمِيدٌۭ مَّجِيدٌۭ", "...May Allah’s mercy and blessings be upon you, O people of this house. Indeed, He is Praiseworthy, All-Glorious. [11:73]"),
            new Model("اَلْبَاعِثُ", "AL-BAITH", "The Infuser of New Life", "وَأَنَّ ٱلسَّاعَةَ ءَاتِيَةٌۭ لَّا رَيْبَ فِيهَا وَأَنَّ ٱللَّهَ يَبْعَثُ مَن فِى ٱلْقُبُورِ", "And certainly the Hour is coming, there is no doubt about it. And Allah will surely resurrect those in the graves. [22:7]"),
            new Model("اَلْشَّهِيدُ", "ASH-SHAHEED", "The All Observing Witnessing", " وَأَنتَ عَلَى كُلِّ شَيْءٍ شَهِيدٌ", "…and You are, over all things, Witness. [5:117]"),
            new Model("اَلْحَقُّ", "AL-HAQQ", "The Truth Absolute", "أَنَّ اللَّهَ هُوَ الْحَقُّ الْمُبِينُ ", "… it is Allah who is the perfect in justice. [24:25]"),
            new Model("اَلْوَكِيلُ", "AL-WAKEEL", "The Disposer of Affairs", "رَّبُّ ٱلْمَشْرِقِ وَٱلْمَغْرِبِ لَآ إِلَـٰهَ إِلَّا هُوَ فَٱتَّخِذْهُ وَكِيلًۭا", "˹He is the˺ Lord of the east and the west. There is no god ˹worthy of worship˺ except Him, so take Him ˹alone˺ as a Trustee of Affairs. [73:9]"),
            new Model("اَلْقَوِيُّ", "AL-QAWIYY", "The All-Strong", "مَا قَدَرُوا۟ ٱللَّهَ حَقَّ قَدْرِهِۦٓ ۗ إِنَّ ٱللَّهَ لَقَوِىٌّ عَزِيزٌ", "They have not shown Allah the reverence He deserves. Surely Allah is All-Powerful, Almighty. [22:74]"),
            new Model("اَلْمَتِينُ", "AL-MATEEN", "The Firm", "إِنَّ ٱللَّهَ هُوَ ٱلرَّزَّاقُ ذُو ٱلْقُوَّةِ ٱلْمَتِينُ", "Indeed, Allah ˹alone˺ is the Supreme Provider—Lord of all Power, Ever Mighty. [51:58]"),
            new Model("اَلْوَليُّ", "AL-WALIYY", "The Protecting Associate", "إِنَّ وَلِـِّۧىَ ٱللَّهُ ٱلَّذِى نَزَّلَ ٱلْكِتَـٰبَ ۖ وَهُوَ يَتَوَلَّى ٱلصَّـٰلِحِينَ", "“Indeed, my Protector is Allah Who has revealed this Book. For He ˹alone˺ protects the righteous. [7:196]"),
            new Model("اَلْحَمِيدُ", "AL-HAMEED", "The All-Praiseworthy", "فَإِنَّ اللَّهَ هُوَ الْغَنِيُّ الْحَمِيدُ", "…indeed, Allah is the Free of need, the Praiseworthy. [57:24]"),
            new Model("اَلْمُحْصِيُ", "AL-MUHSEE", "The All-Enumerating", "وَكُلَّ شَىْءٍ أَحْصَيْنَـٰهُ كِتَـٰبًۭا", "And We have everything recorded precisely. [78:29]"),
            new Model("اَلْمُبْدِئُ", "AL-MUBDI", "The Originator", "إِنَّهُۥ هُوَ يُبْدِئُ وَيُعِيدُ", "˹For˺ He is certainly the One Who originates and resurrects ˹all˺. [85:13]"),
            new Model("اَلْمُعِيدُ", "AL-MUID", "The Reinstater Who Brings Back All", "إِنَّهُۥ هُوَ يُبْدِئُ وَيُعِيدُ", "˹For˺ He is certainly the One Who originates and resurrects ˹all˺. [85:13]"),
            new Model("اَلْمُحْيِى", "AL-MUHYEE", "The Giver of Life", "لَهُۥ مُلْكُ ٱلسَّمَـٰوَٰتِ وَٱلْأَرْضِ ۖ يُحْىِۦ وَيُمِيتُ ۖ وَهُوَ عَلَىٰ كُلِّ شَىْءٍۢ قَدِيرٌ", "To Him belongs the kingdom of the heavens and the earth. He gives life and causes death. And He is Most Capable of everything. [57:2]"),
            new Model("اَلْمُمِيت", "AL-MUMEET", "The Bringer of Death", "لَهُۥ مُلْكُ ٱلسَّمَـٰوَٰتِ وَٱلْأَرْضِ ۖ يُحْىِۦ وَيُمِيتُ ۖ وَهُوَ عَلَىٰ كُلِّ شَىْءٍۢ قَدِيرٌ", "To Him belongs the kingdom of the heavens and the earth. He gives life and causes death. And He is Most Capable of everything. [57:2]"),
            new Model("اَلْحَىُّ", "AL-HAYY", "The Ever-Living", "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ ", "Allah – there is no deity except Him, the Ever-Living, the Sustainer of existence… [2:255] "),
            new Model("اَلْقَيُّومُ", "AL-QAYYOOM", "The Self-Subsisting", "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ ", "Allah – there is no deity except Him, the Ever-Living, the Sustainer of existence… [2:255] "),
            new Model("اَلْوَاجِدُ", "AL-WAAJID", "The Finder", "...إِنَّا وَجَدْنَـٰهُ صَابِرًۭا ۚ نِّعْمَ ٱلْعَبْدُ ۖ إِنَّهُۥٓ أَوَّابٌۭ", "We truly found him patient. What an excellent servant ˹he was˺! Indeed, he ˹constantly˺ turned ˹to Allah˺. [38:44]"),
            new Model("اَلْمَاجِدُ", "AL-MAAJID", "The Magnificent", "ذُو ٱلْعَرْشِ ٱلْمَجِيدُ", "Lord of the Throne, the All-Glorious. [85:15]"),
            new Model("اَلْوَاحِدُ", "AL-WAAHID", "The Unique", "قُلْ إِنَّمَآ أَنَا۠ مُنذِرٌۭ ۖ وَمَا مِنْ إِلَـٰهٍ إِلَّا ٱللَّهُ ٱلْوَٰحِدُ ٱلْقَهَّارُ", "Say, ˹O Prophet,˺ “I am only a warner. And there is no god ˹worthy of worship˺ except Allah—the One, the Supreme. [38:65]"),
            new Model("اَلْأَحَد", "AL-AHAD", "The Only One", "قُلْ هُوَ ٱللَّهُ أَحَدٌ...", "Say, ˹O Prophet,˺ “He is Allah—One ˹and Indivisible˺; [112:1]"),
            new Model("اَلْصَّمَدُ", "AS-SAMAD", "The Self-Sufficient", "ٱللَّهُ ٱلصَّمَدُ", "Allah—the Sustainer ˹needed by all˺. [112:2]"),
            new Model("اَلْقَادِرُ", "AL-QADIR", "He Who is able to do Everything", "أَلَيْسَ ذَٰلِكَ بِقَـٰدِرٍ عَلَىٰٓ أَن يُحْـِۧىَ ٱلْمَوْتَىٰ", "Is such ˹a Creator˺ unable to bring the dead back to life? [75:40]"),
            new Model("اَلْمُقْتَدِرُ", "AL-MUQTADIR", "The All-Powerful", "فِى مَقْعَدِ صِدْقٍ عِندَ مَلِيكٍۢ مُّقْتَدِرٍۭ", "at the Seat of Honour in the presence of the Most Powerful Sovereign. [54:55]"),
            new Model("اَلْمُقَدِّمُ", "AL-MUQADDIM", "He Who Brings Forward", "...فَإِذَا جَآءَ أَجَلُهُمْ لَا يَسْتَـْٔخِرُونَ سَاعَةًۭ ۖ وَلَا يَسْتَقْدِمُونَ", "nd when their time arrives, they cannot delay it for a moment, nor could they advance it. [16:61]"),
            new Model("اَلْمُؤَخِّرُ", "AL-MUAKHKHIR", "He Who Puts Far Away", "يَغْفِرْ لَكُم مِّن ذُنُوبِكُمْ وَيُؤَخِّرْكُمْ إِلَىٰٓ أَجَلٍۢ مُّسَمًّى ۚ إِنَّ أَجَلَ ٱللَّهِ إِذَا جَآءَ لَا يُؤَخَّرُ ۖ لَوْ كُنتُمْ تَعْلَمُونَ", "He will forgive your sins, and delay your end until the appointed time. Indeed, when the time set by Allah comes, it cannot be delayed, if only you knew! [71:4]"),
            new Model("اَلأَوَّلُ", "AL-AWWAL", "The First", " هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ", "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing. [57:3]"),
            new Model("اَلْآخِرُ", "AL-AAKHIR", "The Last", "هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ ", "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing. [57:3]"),
            new Model("اَلْظَّاهِرُ", "AZ-DHAAHIR", "The Manifest", "هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ ", "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing. [57:3]"),
            new Model("اَلْبَاطِنُ", "AL-BAATIN", "Knower of the Hidden", "هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ ", "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing. [57:3]"),
            new Model("اَلْوَالِي", "AL-WAALI", "The Governor", "...وَمَا لَهُم مِّن دُونِهِۦ مِن وَالٍ", "...nor can they find a protector other than Him. [13:11]"),
            new Model("اَلْمُتَعَالِي", "AL-MUTAALI", "The Supremely Exalted", "عَـٰلِمُ ٱلْغَيْبِ وَٱلشَّهَـٰدَةِ ٱلْكَبِيرُ ٱلْمُتَعَالِ", "˹He is the˺ Knower of the seen and the unseen—the All-Great, Most Exalted."),
            new Model("اَلْبَرُّ", "AL-BARR", "The Source of All Goodness", "...إِنَّهُ هُوَ الْبَرُّ الرَّحِيمُ", "...He is truly the Most Kind, Most Merciful. [52:28]"),
            new Model("اَلْتّوَّاْبُ", "AT-TAWWAB", "The Acceptor of Repentance", "...إِنَّهُ هُوَ التَّوَّابُ الرَّحِيمُ", "…Indeed, it is He who is the Accepting of repentance, the Merciful. [2:37]"),
            new Model("اَلْمُنْتَقِمُ", "AL-MUNTAQIM", "The Avenger", "فَإِمَّا نَذْهَبَنَّ بِكَ فَإِنَّا مِنْهُم مُّنتَقِمُونَ", "Even if We take you away ˹from this world˺, We will surely inflict punishment upon them. [43:41]"),
            new Model("اَلْعَفُوُّ", "AL-AFUWW", "The Forgiver", "...فَإِنَّ اللّهَ كَانَ عَفُوًّا قَدِيرًا", "...indeed, Allah is ever Pardoning and Competent. [4:149]"),
            new Model("اَلْرَّؤُفُ", "AR-RAOOF", "The Most Kind", "...إِنَّهُۥ بِهِمْ رَءُوفٌۭ رَّحِيمٌۭ", "...Surely He is Ever Gracious and Most Merciful to them. [9:117]"),
            new Model("مَالِكُ الْمُلكِ", "MAALIK-UL-MULK", "The Owner of all Sovereignty", "قُلِ ٱللَّهُمَّ مَـٰلِكَ ٱلْمُلْكِ تُؤْتِى ٱلْمُلْكَ مَن تَشَآءُ وَتَنزِعُ ٱلْمُلْكَ مِمَّن تَشَآء...", "Say, ˹O Prophet,˺ “O Allah! Lord over all authorities! You give authority to whoever You please and remove it from who You please... [3:26]"),
            new Model("ذُو ٱلْجَلَالِ وَٱلْإِكْرَامُ", "DHUL-JALAALI WAL-IKRAAM", "Lord of Majesty and Generosity", "تَبَـٰرَكَ ٱسْمُ رَبِّكَ ذِى ٱلْجَلَـٰلِ وَٱلْإِكْرَامِ", "Blessed is the Name of your Lord, full of Majesty and Honour. [55:78]"),
            new Model("اَلْمُقْسِطُ", "AL-MUQSIT", "The Equitable", "شَهِدَ ٱللَّهُ أَنَّهُۥ لَآ إِلَـٰهَ إِلَّا هُوَ وَٱلْمَلَـٰٓئِكَةُ وَأُو۟لُوا۟ ٱلْعِلْمِ قَآئِمًۢا بِٱلْقِسْطِ ۚ...", "Allah ˹Himself˺ is a Witness that there is no god ˹worthy of worship˺ except Him—and so are the angels and people of knowledge... [3:18]"),
            new Model("اَلْجَامِعُ", "AL-JAAMI", "The Gatherer", "رَبَّنَآ إِنَّكَ جَامِعُ ٱلنَّاسِ لِيَوْمٍۢ لَّا رَيْبَ فِيهِ ۚ...", "Our Lord! You will certainly gather all humanity for the ˹promised˺ Day—about which there is no doubt... [3:9]"),
            new Model("اَلْغَنيُّ", "AL-GHANIYY", "The Self-Sufficient", "...فَإِنَّ اللَّهَ هُوَ الْغَنِيُّ الْحَمِيدُ", "…indeed, Allah is the Free of need (Self Sufficient), the Praiseworthy. [57:24]"),
            new Model("اَلْمُغْنِيُّ", "AL-MUGHNI", "The Enricher", "...وَإِنْ خِفْتُمْ عَيْلَةًۭ فَسَوْفَ يُغْنِيكُمُ ٱللَّهُ مِن فَضْلِهِۦٓ...", "....If you fear poverty, Allah will enrich you out of His bounty... [9:28]"),
            new Model("اَلْمَانِعُ", "AL-MANI", "The Withholder", "لم يرد ذكرها في القرآن.", "Not Mentioned in Quran"),
            new Model("اَلْضَّارُ", "AD-DHARR", "The Distressor", "وَإِن يَمْسَسْكَ ٱللَّهُ بِضُرٍّۢ فَلَا كَاشِفَ لَهُۥٓ إِلَّا هُوَ ۖ...", "If Allah touches you with harm, none can undo it except Him... [6:17]"),
            new Model("اَلْنَّافِعُ", "AN-NAFI", "The Benefactor", "أَوَلَمْ يَرَوْا۟ أَنَّ ٱللَّهَ يَبْسُطُ ٱلرِّزْقَ لِمَن يَشَآءُ وَيَقْدِرُ ۚ إِنَّ فِى ذَٰلِكَ لَـَٔايَـٰتٍۢ لِّقَوْمٍۢ يُؤْمِنُونَ", "Have they not seen that Allah gives abundant or limited provisions to whoever He wills? Surely in this are signs for people who believe. [30:37]"),
            new Model("اَلْنُّورُ", "AN-NUR", "The Light", "ٱللَّهُ نُورُ ٱلسَّمَـٰوَٰتِ وَٱلْأَرْضِ ۚ مَثَلُ نُورِهِۦ كَمِشْكَوٰةٍۢ فِيهَا مِصْبَاحٌ ۖ ٱلْمِصْبَاحُ فِى زُجَاجَةٍ ۖ...", "Allah is the Light of the heavens and the earth. His light is like a niche in which there is a lamp, the lamp is in a crystal... [24:35]"),
            new Model("اَلْهَادِي", "AL-HAADI", "The Guide", "...وَإِنَّ ٱللَّهَ لَهَادِ ٱلَّذِينَ ءَامَنُوٓا۟ إِلَىٰ صِرَٰطٍۢ مُّسْتَقِيمٍۢ", "...And Allah surely guides the believers to the Straight Path. [22:54]"),
            new Model("اَلْبَدِيعُ", "AL-BADEE", "The Originator", "بَدِيعُ ٱلسَّمَـٰوَٰتِ وَٱلْأَرْضِ ۖ...", "˹He is˺ the Originator of the heavens and the earth!... [2:117]"),
            new Model("اَلْبَاقِي", "AL-BAAQI", "The Everlasting", "وَيَبْقَىٰ وَجْهُ رَبِّكَ ذُو ٱلْجَلَـٰلِ وَٱلْإِكْرَامِ", "Only your Lord Himself, full of Majesty and Honour, will remain ˹forever˺. [55:27]"),
            new Model("اَلْوَارِثُ", "AL-WAARITH", "The Inheritor of All", "وَإِنَّا لَنَحْنُ نُحْىِۦ وَنُمِيتُ وَنَحْنُ ٱلْوَٰرِثُونَ", "Surely it is We Who give life and cause death. And We are the ˹Eternal˺ Successor... [15:23]"),
            new Model("اَلْرَّشِيدُ", "AR-RASHEED", "The Guide to the Right Path", "لم يرد ذكرها في القرآن.", "Not mentioned in the Quran."),
            new Model("اَلْصَّبُورُ", "AS-SABOOR", "The Patient", "...إِنَّ ٱللَّهَ مَعَ ٱلصَّـٰبِرِينَ", "...Allah is truly with those who are patient. [2:153]"),
    };
    public static final Model[] MUHAMMAD = {
            new Model("مُحَمَّدٌ", "Muhammad", "The Praised One", "", "Muḥammad is not the father of any of your men, but is the Messenger of Allah and the seal of the prophets. [33:40]", 0),
            new Model("١َحمَدٌ", "Ahmed", "The Most Praised", "", " confirming the Torah which came before me, and giving good news of a messenger after me whose name will be Aḥmad. [61:6]", 0),
            new Model("حَامِدٌ", "Hamid", "The Praiser", "", "", 0),
            new Model("مَحمُودٌ", "Mahmood", "The Most Highly Praised", "", "", 0),
            new Model("قَاسِمٌ", "Qasim", "The Distributor", "", "If Allah wants to do good to a person, He makes him comprehend the religion. I am just a distributor, but the grant is from Allah. (And remember) ", 0),
            new Model("عَاقِبٌ", "Aaqib", "The Last in Succession", "", "", 0),
            new Model("فَاتِحٌ", "Faateh", "The Victorious", "", "", 0),
            new Model("شَاهِدٌ", "Shahid", "The Witness", "", "", 0),
            new Model("حَاشِرٌ", "Hashir", "The Gatherer", "", "", 0),
            new Model("رَشِيدٌ", "Rasheed", "The Well Guided", "", "", 0),
            new Model("مَشهُودٌ", "Mashhood", "He who is witnessed", "", "", 0),
            new Model("بَشِيرٌ", "Basheer", "The Messenger of Good News", "", "We have surely sent you with the truth ˹O Prophet˺ as a deliverer of good news and a warner. And you will not be accountable for the residents of the Hellfire. [2:119]", 0),
            new Model("نَزِيرٌ", "Nazir", "The Warner", "", "We have surely sent you with the truth ˹O Prophet˺ as a deliverer of good news and a warner. And you will not be accountable for the residents of the Hellfire. [2:119]", 0),
            new Model("دَاعٍ", "Dai", "The One Who Calls (unto God)", "", "Say, ˹O Prophet,˺ “This is my way. I invite to Allah with insight—I and those who follow me. Glory be to Allah, and I am not one of the polytheists. [12:108]", 0),
            new Model("شَافٍ", "Shafi", "The Healer", "", "", 0),
            new Model("هَادٍ", "Hadi", "He Who Guides Right", "", "", 0),
            new Model("مَهدٍ", "Mahdi", "The Guided One", "", "", 0),
            new Model("مَاحٍ", "Mahi", "The Remover (of Disbelief)", "", "Allah's Apostle ﷺ said, \"I have five names: I am Muhammad and Ahmad;I am Al-Mahi through whom Allah will eliminate infidelity;I am Al-Hashir who will be the first to be resurrected, the people being resurrected there after; and I am also Al-'Aqib (i.e. There will be no prophet after me).\" [Sahih al-Bukhari, Vol. 4, Book of Virtues, Hadith 732]", 0),
            new Model("مُنجٍ", "Munji", "He Who Saves Delivers", "", "", 0),
            new Model("نَاهٍ", "Nahi", "He Who Stops (from bad things)", "", "", 0),
            new Model("رَسُولٌ", "Rasool", "The Messenger", "", "How can they be reminded when a messenger has already come to them, making things clear, [44:13]", 0),
            new Model("نَبِىٌ", "Nabi", "The Prophet", "", "Inform My servants ˹O Prophet˺ that I am truly the All-Forgiving, Most Merciful, [15:]", 0),
            new Model("اُمِّيىٌ", "Ummi", "The Unlettered and Illiterate", "", "“˹They are˺ the ones who follow the Messenger, the unlettered Prophet, whose description they find in their Torah and the Gospel.1 He commands them to do good and forbids them from evil... [7:157]", 0),
            new Model("تِهَامِىٌ", "Tihami", "From Tihama", "", "", 0),
            new Model("هَاشَمِىٌ", "Hashmi", "Family Name ,Caste", "", "", 0),
            new Model("اَبطَحِىٌ", "Abtahi", "Citizen of Batha", "", "", 0),
            new Model("عَزِيزٌ", "Aziz", "The Nobel", "لَقَدْ جَآءَكُمْ رَسُولٌۭ مِّنْ أَنفُسِكُمْ عَزِيزٌ عَلَيْهِ مَا عَنِتُّمْ حَرِيصٌ عَلَيْكُم بِٱلْمُؤْمِنِينَ رَءُوفٌۭ رَّحِيمٌۭ", "There certainly has come to you a messenger from among yourselves. He is concerned by your suffering, anxious for your well-being, and gracious and merciful to the believers. [9:128]", 0),
            new Model("حَرِيصٌ عَلَيكُم", "Haris Alaikum", "Full of Concern for You", "لَقَدْ جَآءَكُمْ رَسُولٌۭ مِّنْ أَنفُسِكُمْ عَزِيزٌ عَلَيْهِ مَا عَنِتُّمْ حَرِيصٌ عَلَيْكُم بِٱلْمُؤْمِنِينَ رَءُوفٌۭ رَّحِيمٌۭ", "There certainly has come to you a messenger from among yourselves. He is concerned by your suffering, anxious for your well-being, and gracious and merciful to the believers. [9:128]", 0),
            new Model("رَءُوفٌ", "Rauf", "The Compassionate", "لَقَدْ جَآءَكُمْ رَسُولٌۭ مِّنْ أَنفُسِكُمْ عَزِيزٌ عَلَيْهِ مَا عَنِتُّمْ حَرِيصٌ عَلَيْكُم بِٱلْمُؤْمِنِينَ رَءُوفٌۭ رَّحِيمٌۭ", "There certainly has come to you a messenger from among yourselves. He is concerned by your suffering, anxious for your well-being, and gracious and merciful to the believers. [9:128]", 0),
            new Model("رَحِيمٌ", "Raheem", "The Mercy-giving", "لَقَدْ جَآءَكُمْ رَسُولٌۭ مِّنْ أَنفُسِكُمْ عَزِيزٌ عَلَيْهِ مَا عَنِتُّمْ حَرِيصٌ عَلَيْكُم بِٱلْمُؤْمِنِينَ رَءُوفٌۭ رَّحِيمٌۭ", "There certainly has come to you a messenger from among yourselves. He is concerned by your suffering, anxious for your well-being, and gracious and merciful to the believers. [9:128]", 0),
            new Model("طٰهٰ", "Taha", "Taha", "(حروف مقطعات) طه", " Taha (Here is a comment in the form of an address to the Holy Prophet ﷺ) [Surah Taha 20:7]", 0),
            new Model("مُجتَبٰى", "Mujtaba", "The Chosen One", "مجتبى هو اسم قرآني غير مباشر للأولاد يعني \"المختار\" ، \"المختار من بين العديد\". وهو من أسماء النبي محمد المستخدمة في الأدب الإسلامي مشتق من جذر JBY الذي يستخدم في عدد من الأماكن في القرآن.", "Mujtaba is an indirect Quranic name for boys that means “chosen”, “selected among many”. It is one of the names of Prophet Muhammad used in Islamic literature. It is derived from the J-B-Y root which is used in a number of places in the Quran.", 0),
            new Model("طٰسٓ", "Taseen", "Tasin (27:1)", "", "", 0),
            new Model("مُرتَضٰى", "Murtada", "The Pure (Paak)", "", "", 0),
            new Model("حٰمٓ", "Ha-Mim", "Ha-mim (Surah: 40-46)", "", "", 0),
            new Model("مُصطَفٰى", "Mustafa", "The Chosen/ Appointed", "ٱللَّهُ يَصْطَفِى مِنَ ٱلْمَلَـٰٓئِكَةِ رُسُلًۭا وَمِنَ ٱلنَّاسِ ۚ إِنَّ ٱللَّهَ سَمِيعٌۢ بَصِيرٌۭ", "Allah selects messengers from both angels and people, for Allah is truly All-Hearing, All-Seeing. [22:75]", 0),
            new Model("یٰسٓ", "Yasin", "Yasin (36:1)", "", "", 0),
            new Model("اَولىٰ", "Aula", "Most Worthy", "", "", 0),
            new Model("مُزّمِّلٌ", "Muzammil", "The Enwrapped", "يَـٰٓأَيُّهَا ٱلْمُزَّمِّلُ", "O you wrapped ˹in your clothes˺! [73:1]", 0),
            new Model("وَلِىٌ", "Wali", "The Friend", "", "", 0),
            new Model("مُدَّثِّرٌ", "Muddathir", "One who covers himself with mantle", "يَـٰٓأَيُّهَا ٱلْمُدَّثِّرُ", "O you covered up ˹in your clothes˺! [74:1]", 0),
            new Model("مَتِينٌ", "Mateen", "The Firm", "", "", 0),
            new Model("مُصَدِّقٌ", "Mussadiq", "The Confirmer", "", "", 0),
            new Model("طَيِّبٌ", "Tayyib", "The Pious", "", "", 0),
            new Model("نَاصِرٌ", "Nasir", "The Helper", "", "", 0),
            new Model("مَنصُورٌ", "Mansur", "The Victorious One", "", "", 0),
            new Model("مِصبَاحٌ", "Misbah", "The Lamp (Bringer of Light)", "", "", 0),
            new Model("اٰمِرٌ", "Aamir", "One who commands", "", "", 0),
            new Model("حِجَازِىٌ", "Hijazi", "One who belongs to Hijaz", "", "", 0),
            new Model("نَزَارِىٌ", "Nazari", "Nazari", "", "", 0),
            new Model("قُريِشِىٌ", "Quraishi", "From the Clan Quraish", "", "", 0),
            new Model("مُضَرِىٌ", "Muzarr", "Muzzar", "", "", 0),
            new Model("نَبِىُّ التَّوبَة", "Nabi At-Tuba", "The Prophet of Penitence", "حَدَّثَنَا مُحَمَّدُ بْنُ طَرِيفٍ الْكُوفِيُّ، قَالَ: حَدَّثَنَا أَبُو بَكْرِ بْنُ عَيَّاشٍ، عَنْ عَاصِمٍ، عَنْ أَبِي وَائِلٍ، عَنْ حُذَيْفَةَ، قَالَ: لَقِيتُ النَّبِيَّ صلى الله عليه وسلم، فِي بَعْضِ طُرُقِ الْمَدِينَةِ، فَقَالَ: أَنَا مُحَمَّدٌ، وَأَنَا أَحْمَدُ، وَأَنَا نَبِيُّ الرَّحْمَةِ، وَنَبِيُّ التَّوْبَةِ، وَأَنَا الْمُقَفَّى، وَأَنَا الْحَاشِرُ، وَنَبِيُّ الْمَلاحِم.", "I encountered the Prophet (Allah bless him and give him peace) in one of the streets of Medina, and he said: “I am Muhammad; I am Ahmad; I am the Prophet of Mercy and the Prophet of Repentance; I am the Follower [of the earlier Prophets]; I am the Gatherer and the Prophet of the Fierce Battles. [Ash-Shama'il Al-Muhammadiyah 366]", 0),
            new Model("حَافِظٌ", "Hafiz", "The preserver", "", "", 0),
            new Model("كَامِلٌ", "Kamil", "The Completed", "", "", 0),
            new Model("صَادِقٌ", "Sadiq", "The Honest", "", "", 0),
            new Model("اَمِينٌ", "Amin", "The Trustworthy", "إِنِّى لَكُمْ رَسُولٌ أَمِينٌۭ", "I am truly a trustworthy messenger to you. [26:125]", 0),
            new Model("عَبدُاللَّهِ", "Abdullah", "Servant of Allah", "تَبَارَكَ ٱلَّذِى نَزَّلَ ٱلْفُرْقَانَ عَلَىٰ عَبْدِهِۦ لِيَكُونَ لِلْعَـٰلَمِينَ نَذِيرًا", "Blessed is the One Who sent down the Standard to His servant, so that he may be a warner to the whole world. [25:1]", 0),
            new Model("كَلِيمُ اللَّهِ", "Kalimullah", "He to Whom Allah has Talked", "", "", 0),
            new Model("حَبِيبُ اللَّهِ", "Habibullah", "The Beloved of Allah", "", "", 0),
            new Model("نَجِىُّ اللَّه", "Najiyullah", "The Confidant of Allah", "", "", 0),
            new Model("صَفِىُّ اللَّه", "Safiyullah", "The Intimate of Allah", "", "", 0),
            new Model("خَاتِمُ الاَنبِيَآء", "Khatimul Anbiya", "The Last Seal/ End of Seal of All Prophets", "مَّا كَانَ مُحَمَّدٌ أَبَآ أَحَدٍۢ مِّن رِّجَالِكُمْ وَلَـٰكِن رَّسُولَ ٱللَّهِ وَخَاتَمَ ٱلنَّبِيِّـۧنَ ۗ...", "Muḥammad is not the father of any of your men,1 but is the Messenger of Allah and the seal of the prophets. [33:40]", 0),
            new Model("حَسِيبٌ", "Haseeb", "The Respected", "", "", 0),
            new Model("مُجِيبٌ", "Mujeeb", "The one who accepts", "", "", 0),
            new Model("شَكُورٌ", "Shakoor", "The Most grateful", "", "", 0),
            new Model("مُقتَصِدٌ", "Muqtasid", "Adopting a middle course", "", "", 0),
            new Model("رَسُولُ الرَّحمَةِ", "Rasool ur Rahmat", "The messenger of mercy", "", "", 0),
            new Model("قَوِىٌ", "Qawi", "The Strong", "", "", 0),
            new Model("حَفِىٌ", "Hafi", "The Well-informed", "", "", 0),
            new Model("مَامُونٌ", "Mamoon", "The peaceful", "", "", 0),
            new Model("مَعلُومٌ", "Maloom", "One who has knowledge", "", "", 0),
            new Model("حَقٌ", "Haqq", "The true man", "", "", 0),
            new Model("مُبِينٌ", "Mubeen", "One who clarify", "", "", 0),
            new Model("مُطِيعٌ", "Mutee", "The Obedient", "", "", 0),
            new Model("اَوَّلٌ", "Awwal", "The First", "", "", 0),
            new Model("اٰخِرٌ", "Akhir", "The Last", "", "", 0),
            new Model("ظَاهِرٌ", "Zahir", "The manifest", "", "", 0),
            new Model("بَاطِنٌ", "Batin", "One who have knowledge of Inner", "", "", 0),
            new Model("يَتِيمٌ", "Yateem", "The orphan", "", "", 0),
            new Model("كَريِمٌ", "Karim", "The Gracious", "", "", 0),
            new Model("حَكِيمٌ", "Hakeem", "The Wise", "", "", 0),
            new Model("سَيِّدٌ", "Sayyid", "The Chief", "", "", 0),
            new Model("سِرَاجٌ", "Siraj", "One Who has splendour", "", "", 0),
            new Model("مُنِيرٌ", "Munir", "One Who Enlightens", "", "", 0),
            new Model("مُحَرَّمٌ", "Muharram", "Capable of respect", "", "", 0),
            new Model("مُكَرَّمٌ", "Mukarram", "The Honorable", "", "", 0),
            new Model("مُبَشِّرٌ", "Mubahsir", "The Bringer of good news", "", "", 0),
            new Model("مُزَكِّرٌ", "Mudakir", "The Reminder", "", "", 0),
            new Model("مُطَهَّرٌ", "Mutahir", "The Purifier", "", "", 0),
            new Model("قَريِبٌ", "Qarib", "The Near", "", "", 0),
            new Model("خَلِيلٌ", "Khalil", "The Good friend", "", "", 0),
            new Model("مَدعُوٌ", "Maddu", "The Called One", "", "", 0),
            new Model("جَوَّادٌ", "Jawwad", "The Generous", "", "", 0),
            new Model("خَاتِمٌ", "Khatim", "The Seal (Final Prophet)", "", "", 0),
            new Model("عَادِلٌ", "Aadil", "One who gives verdict", "", "", 0),
            new Model("شَهِيرٌ", "Shahir", "The Famous", "", "", 0),
            new Model("شَهِيدٌ", "Shaheed", "The Witnesser", "", "", 0),
            new Model("رَسُولُ المَلاَحِمِ", "Rasool Al Malahim", "The Messenger of Fierce Battles", "حَدَّثَنَا مُحَمَّدُ بْنُ طَرِيفٍ الْكُوفِيُّ، قَالَ: حَدَّثَنَا أَبُو بَكْرِ بْنُ عَيَّاشٍ، عَنْ عَاصِمٍ، عَنْ أَبِي وَائِلٍ، عَنْ حُذَيْفَةَ، قَالَ: لَقِيتُ النَّبِيَّ صلى الله عليه وسلم، فِي بَعْضِ طُرُقِ الْمَدِينَةِ، فَقَالَ: أَنَا مُحَمَّدٌ، وَأَنَا أَحْمَدُ، وَأَنَا نَبِيُّ الرَّحْمَةِ، وَنَبِيُّ التَّوْبَةِ، وَأَنَا الْمُقَفَّى، وَأَنَا الْحَاشِرُ، وَنَبِيُّ الْمَلاحِم.", "I encountered the Prophet (Allah bless him and give him peace) in one of the streets of Medina, and he said: “I am Muhammad; I am Ahmad; I am the Prophet of Mercy and the Prophet of Repentance; I am the Follower [of the earlier Prophets]; I am the Gatherer and the Prophet of the Fierce Battles. [Ash-Shama'il Al-Muhammadiyah 366]", 0),
    };


    public static final Model[] MENU = {
            new Model(khaba, "Asma Ul Husna"),
            new Model(madina, "Asma Ul Rasool"),
            new Model(tasbeeh, "Tasbeeh"),
            new Model(supplications, "Supplications"),
            new Model(waddu, "Ablution"),
            new Model(namaz, "Salah"),
            new Model(ramadan, "Fasting"),
            new Model(charity, "Zakat"),
            new Model(vibrate, "Silent Phone"),
            new Model(shahada, "Shahada"),
            new Model(hajj, "Hajj"),
            new Model(quiz_icon, "Quiz"),
            new Model(qibla_compass, "Find Qibla"),
            new Model(clock, "Salah Times"),
            new Model(quran, "Quran Verse"),
            new Model(hadith, "Today's Hadith"),
            new Model(calender, "Hijri Calender"),
            new Model(quranfifteen, "Al Quran"),
            new Model(graveyard, "Janaza"),
            new Model(kalimas, "Six Kalimas"),
            new Model(qaida, "Qaida"),
            new Model(child, "Newborn Child"),
            new Model(video, "Islamic Videos"),
    };
    public static final Model[] SUPPLICATIONS = {

            new Model("کھانے سے پہلے کی دعا", "Dua Before Meals", "بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ", "میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا۔", "In the name of Allah and with the blessings of Allah I begin (eating).", "(Mustadrak)"),
            new Model("کھانے کے بعد کی دعا", "Dua After Meals", "الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِينَ", "اللہ عزوجل کا شکر ہے جس نے ہمیں کھلایا پلایا اور مسلمانوں میں سے بنایا۔", "All praise belongs to Allah, who fed us and quenched our thirst and made us Muslims", "(Ibn Al Sunni)"),
            new Model("سوتے وقت کی دعا", "Dua Before Sleeping", "اَللّٰھُمَّ بِاسْمِكَ أَمُوتُ وَأَحْيَا", "الٰہی عزوجل میں تیرے نام پر مرتا ہوں اور جیتا ہوں۔", "In Your name O Allah, I live and die.", "(Al-Bukhari 11:113, Muslim 4:2083)"),
            new Model("نیند سے بیدار ہونے پر کی دعا", "Dua On awakening from sleep ", "الحَمْدُ لِلهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ", "تمام تعریفیں اللہ عزوجل کے لئے جس نے ہمیں موت (نیند) کے بعد حیات (بیداری) عطا فرمائی اور ہمیں اسی طرف لوٹنا ہے۔", "All praise is for Allah who gave us life after causing us to die, and unto Him is the resurrection.", "(Bukhari: 6312)"),
            new Model("گھر میں داخل ہوتے وقت کی دعا", "Dua When Entering The Home", "اَللّٰھُمَّ اِنِّیْ اَسْئَلُكَ خَیْرَالْمَوْلَجِ وَخَیْرَالْمَخْرَجِ", "اے اللہ عَزَّ وَجَلَّ ! میں تجھ سے داخل ہونے اور نکلنے کی جگہوں کی بھلائی طلب کرتا ہوں ۔", "O Allah(عَزَّ وَجَلَّ)! I ask you for the goodness of the places of entering and exiting.", "(Sunan Abi Dawood: Hadith: 209, Part 2)"),
            new Model("گھر سے نکلتے وقت کی دعا", "Dua When Leaving The House", "بِسْمِ اللهِ ، تَوَكَّلْتُ عَلَى اللهِ وَلَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللهِ", "اللہ عزوجل کے نام سے (گھر سے نکلتا ہوں) میں نے اللہ عزوجل پر بھروسہ کیا اللہ عزوجل کے بغیر نہ طاقت ہے (گناہوں سے بچنےکی) اور نہ وقت ہے (نیکیاں کرنے کی)۔", "In the name of Allah Almighty (I comeout of my house) I trust Allah Almighty, there is no capability of saving oneself from sins and neither is there capability to do good deeds but from Allah Almighty.", "( Abu Dawud: 5095)"),
            new Model("مسجد میں داخل ہونے کی دعا", "Dua When Entering the Mosque", "اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِکَ", "اے اللہ! میرے لیے رحمت کے دروازے کھول دے۔", "Oh Allah! Open the doors for me of your Blessings.", "(Mishkat)"),
            new Model("مسجد سے نکلنے کی دعا", "Dua When Leaving the Mosque", "اَللّٰهُمَّ اِنِّيْ اَسْاَلُکَ مِنْ فَضْلِکَ وَرَحْمَتِکَ", "اے اللہ! میں تجھ سے تیرا فضل اور تیری رحمت مانگتا ہوں۔", "Oh Allah! I ask you of your Favour.", "( Abu Dawud: 465)"),
            new Model("سفر اور سواری کی دعا", "Dua for Traveling & Journey", "سُبْحَانَ الَّذِي سَخَّرَ لَنَا هَـٰذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ وَإِنَّا إِلَىٰ رَبِّنَا لَمُنقَلِبُونَ", "اللہ عزوجل کا شکر ہے، پاک ہے وہ جس نے ہمارے لئے اس(سواری کو) مسخر کیا اور ہم اس کو فرمانبردار نہیں بنا سکتے تھے۔", "Thanks to Allah Azzawajal. Pure is he who subdude this, other wise we could not make this obedient.", "(Surah Az-Zukhruf 43:13)"),
            new Model("بازار میں داخل ہوتے وقت کی دعا", "Dua When Entering the Market (Bazaar)", "لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ يُحْيِي وَيُمِيتُ وَهُوَ حَيٌّ لَا يَمُوتُ بِيَدِهِ الْخُيْرُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٍ", "اللہ عزوجل کے سوا کوئی معبود نہین، وہ یکتا ہے، اس کا کوئی شریک نہیں، اس کی بادشاہت ہے اور اسی کے لئے حمد ہے وہی جلاتا اور مارتا ہےوہ (ایسا) زندہ ہے جسے موت نہیں، تمام بھلائیاں اسی کے دست قدرت میں ہیں اور وہ ہر چیز پر قادر ہے۔", "There is no deity except Allah Azzawajal he is unique, He has no partner, His is the kingship, and for him is praise, he brings to lie and he kills, He is alive(as such death will not come to him. All virtues are in his hand of power, He can do what ever he wants.", "(At-Tirmidhi 5:291, Al-Hakim 1:538)"),
            new Model("چھینک آنے کے وقت کی دعا", "Dua upon Sneezing", "الْحَمْدُ لِلَّهِ", "تمام تعریفیں اللہ عزوجل کےلئے ہیں", "All praise onto Allah Almighty.", "(Surah Al-Fatihah 1:2)"),
            new Model("چھینک آنے پر الحمد للہ کہنے والے کے لئے دعا", "Dua When Hearing Someone Sneeze", "يَرْحَمُكَ اللَّهُ", "اللہ عزوجل تجھ پر رحم کرے۔", "May Allah Almighty Have Mercy on you.", "(Al-Bukhar 7:126)"),
            new Model("مصیبت و پریشانی کے وقت کی دعا", "Dua When Facing Trouble or Difficulties", "إِنَّا لِلهِ وَ إِنَّا إِلَيْهِ رَاجِعُوْن. اَللّٰهُمَّ أْجُرْنِيْ فِيْ مُصِيبَتِيْ وَاخْلُفْ لِيْ خَيْرا مِنْهَا", "يقینا ہم اللہ ہى كى ملكيت ہیں اور اسى كى طرف لوٹ كر جانے والے ہیں۔اے اللہ مجھے ميرے اس صدمے یا تكليف كا اجر دے اور بدلے ميں مجھے اس سے زيادہ بہتر دے۔", "To Allaah we belong and unto Him is our return. O Allaah, recompense me for my affliction and replace it for me with something better", "(Sahih Muslim 918 Chapter 11)"),
            new Model("عیادت کرتے وقت کی دعا", "Dua When Visiting the Sick", "لَا بَأْسَ طَهُورٌ إِنْ شَآءَ اللّٰہُ", "کوئی حرج کی بات نہیں انشاء اللہ عزوجل یہ مرض گناہوں سے پاک کرنے والا ہے", "This is not a thing of harm In Sha Allah Azzawajal this illness purifies from sins.", "(Fathul-Bari 10:118)"),
            new Model("وضو سے پہلے کی دعا", "Dua Before Wudhu (Ablution)", "بِسْمِ اللّٰہِ الرَّحْمٰنِ الرَّحِیْمِ۔", "شروع کرتا ہوں اللہ کے نام سے جو بڑا مہربان، نہایت رحم والا ہے ۔", "In the name of Allah, the most merciful, the most kind", "(Mishkat)"),
            new Model("وضو کے درمیان پڑھنے کی دعا", "Dua While Performing Wudhu (Ablution)", "اللَّهُمَّ اغْفِرْ لِي ذَنْبِي وَوَسِّعْ لِي فِي دَارِي وَبَارِكْ لِي فِي رِزْقِي", "اے اللہ! میرے گناہ بخش دے اور میرے گھر میں وسعت عطاء فرما،اور میری روزی میں برکت عطاء فرمادیجئے۔", "O Allah Azzawajal forgive me and give me abundance and blessing in my house and grant me abundance in my livelihood.", "(Hisnul Hasin)"),
            new Model("بیت الخلاء میں داخل ہونے سے پہلے کی دعا", "Dua Before Entering Toilet", "اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ", "اے اللہ عزوجل میں ناپاک جنوں سے تیری پناہ مانگتا ہوں۔", "O Allah, I seek refuge with you from all evil and evil-doers.", "( Muslim: 375)"),
            new Model("بیت الخلاء سے باہر آنے کے بعد کی دعا", "Dua After Leaving Toilet", "الْحَمْدُ لِلَّهِ الَّذِي أَذْهَبَ عَنِّي الْأَذَى وَعَافَانِي", "اللہ عزوجل کا شکر ہے جس نے مجھ سے اذیت دور کی اور مجھے عافیت دی۔", "All Praise be to Allah, who removed the difficulty from me and gave me ease (relief)", "(Mishkat)"),
            new Model("جب بھی چاند پر نظر پڑھے کی دعا", "Dua When Sighting The Moon", "اللَّهُمَّ أَهِلَّهُ عَلَيْنَا بِالْيُمْنِ وَالْإِيمَانِ وَالسَّلَامَةِ وَالْإِسْلَامِ وَالتَّوْفِيقِ لِمَا تُحِبُّ وَتَرْضَى رَبِّي وَرَبُّكَ اللَّهُ", "اے اللہ ، یہ چاند (مہینہ) برکتوں ، ایمان ، حفاظت ، اور اسلام کے اعتقاد کے ساتھ ہم پر گزرے۔ ہمیں ان اعمال پر عمل کرنے کی صلاحیت عطا کریں جو آپ پسند کرتے ہیں اور آپ کو خوش کرتے ہیں۔ (اے چاند) میرا رب اور تمہارا رب اللہ ہے", "O Allah, let this moon (month) pass over us with blessings, Iman, safety, and in the belief of Islam. Grant us the ability to act on the actions that You love and Pleases You. (O moon) My Lord and Your Lord is Allah", "( At-Tirmidhi: 3451)"),
            new Model("قبرستان میں داخل ہوتے وقت کی دعا", "Dua When Entering the Graveyard", "اَلسَّلَامُ عَلَیْکُمْ اَھْلَ الدِّیَارِ مِنَ الْمُؤْمِنِیْنَ وَالْمُسْلِمِیْنَ ،وَاِنَّااِنْ شَآئَ اللّٰہُ بِکُمْ لَلاَحِقُوْنَ أَسْأَلُ اللّٰہَ لَنَا وَلَکُمُ الْعَافِیَةَ۔", "اے مؤمنو !تم پر سلام ہو ،ہم آپ کے پاس جلد آنے والے ہیں ، اپنے لئے اور آپ کے لئے اللہ تعالیٰ سے عافیت وخیریت مانگتے ہیں۔", "Peace be upon you O inhabitants of the abodes, believers and Muslims, we will join you if Allah wills, we ask Allah for our and your well being.", "(Muslim 2:671)"),
            new Model("شبِ قدر کی دعا", "Dua Shab e Qadr (Laylat ul Qadr)", "اللَّهُمَّ إِنَّكَ عَفُوٌّ تُحِبُّ الْعَفْوَ فَاعْفُ عَنِّي", "الٰہی عزوجل تو بہت معاف فرمانے والا ہے، معاف کرنے کو پسند فرماتا ہے پس مجھے معاف فرمادے۔", "Oh Allah you are forgiving, and you love forgiveness, so forgive me", "(Tirmidhi)"),
            new Model("نیا چاند دیکھتے وقت کی دعا", "Dua When Sighting The New Moon", "اللَّهُمَّ أَهِلَّهُ عَلَيْنَا بِالأَمْنِ وَالإِيمَانِ ، والسَّلامَةِ والإِسْلامِ ، وَالتَّوْفِيقِ لِمَا تُحِبُّ وَتَرْضَى ، رَبُّنَا وَرَبُّكَ اللهُ", "یا الٰہی عزوجل اس چاند کو ہم پر برکت کے ساتھ اور ایمان و سلامتی اور اسلام اور اس چیز کی توفیق کے ساتھ نکال جس سے تو راضی ہوتا ہے اور پسند کرتا ہے، (اے پہلی رات کے چاند) میرا اور تیرا رب اللہ عزوجل ہے۔", "O Allah, let the crescent loom above us in peace and faith, safety and Islam, and in agreement with all that You love and pleases You. Our Lord and your Lord is Allah.", "(Tirmidhi: 3451)"),
            new Model("روزہ رکھنے کی نیت", "Dua of Sehri", "وَبِصَوْمِ غَدٍ نَّوَيْتُ مِنْ شَهْرِ رَمَضَانَ", "اورمیں نے ماہ رمضان کے کل کے روزے کی نیت کی.", "I Intend to keep the fast for month of Ramadan.", "(Abu Dawud)"),
            new Model("روزہ افطار کرنے کے بعد کی دعا", "Dua for Iftar", "اَللّٰهُمَّ اِنِّی لَکَ صُمْتُ وَبِکَ اٰمَنْتُ وَعَلَيْکَ تَوَکَّلْتُ وَعَلٰی رِزْقِکَ اَفْطَرْتُ", "اے اللہ!میں نے تیری خاطر روزہ رکھا اور تیرے اوپر ایمان لایا اور تجھ پر بھروسہ کیا اورتیرے رزق سے اسے کھول رہا ہوں۔", "O Allah! I fasted for you and I believe in you and I put my trust in You and I break my fast with your sustenance.", "(Abu Dawud)"),
            new Model("بارش طلب کرنے کی دعا", "Dua For Rain", "اللَّهُمَّ أَغِثْنَا", "اے اللہ ہمیں بارش دے", "O Allah, listen to our plea (request)", "(Muslim: 897)"),
            new Model("بارش کے وقت کی دعا", "Dua At The Time Of Rain", "اللَّهُمَّ صَيِّبَاً نَافِعَاً", "اے اللہ اسے نفع دینے والی بارش بنا دے", "O Allah, may it be a beneficial rain.", "(Bukhari: 1032)"),
            new Model("جب غصے میں ہواس کے لئے دعا", "When In Anger", "اَعُوْذُ بِاللهِ مِنَ الشَّيْطَانِ الرَّجِيْمًِ", "میں لعنتی شیطان سے اللہ کی پناہ مانگتا ہوں", " “I seek refuge in Al’laah from Shaitaan the cursed”", "[Tirmizi Shareef Vol.2 Pg.183]"),
            new Model("جب دباؤ محسوس ہواس کے لئے دعا", "When Feeling Stressed", "آَ اِلَهَ اِلاَّ اللهُ الْحَلِيْمُ الْحَكِيْمُ لآَ اِلَهَ اِلاَّ اللهُ رَبُّ الْعَرْشِ الْعَظِيْم لآَ اِلَهَ اِلاَّ اللهُ رَبُّ السَّمَاوَاتَ وَاْلاَرْضِ وَرَبُّ الْعَرْشِ الْكَرِيْمِ ً", "اللہ کے سوا کوئی عبادت کے لائق نہیں ہے ، اللہ ہمیشہ رہنے والا اور تمام حکمت والا ہے۔ اللہ کے سوا کوئی عبادت کے لائق نہیں ہے ، آسمانوں کا مالک اور زمین کا مالک اور ممتاز عرش کا مالک ہے", "There is none worthy of worship except Al’laah, The Fore-bearing, The All Wise. There is none worthy of worship except Al’laah, The Lord of the Exalted Throne. There is none worthy of worship except Al’laah, The Lord of the Skies and The Lord of the Earth and the Lord of the distinguished Throne", "[Tirmidhi Vol.2 Pg. 181]"),
            new Model("علم میں اضافہ کے لئے دعا", "Dua  for Increase in Knowledge", "رَّبِّ زِدۡنِي عِلۡمٗاً", "اے میرے رب مجھے علم میں اضافہ فرمائیں", "O my Lord increase me in knowledge", "(Sura Ta’ha, S.20/V.114)"),
            new Model(" وضو ختم کرنے کے بعد کی دعا ", "Dua when finishing Wudhu", "أَشْهَدُ أَنْ لَا إِلَـهَ إِلاَّ اللّهُ وَحْدَهُ لَا شَريـكَ لَـهُ وَأَشْهَدُ أَنَّ مُحَمَّـداً عَبْـدُهُ وَرَسُـولُـهُ.ً", "میں گواہی دیتا ہوں کہ اللہ کے سوا کوئی عبادت کے لائق نہیں ہے ، اور میں گواہی دیتا ہوں کہ محمد اس کا غلام اور رسول ہیں۔", "I bear witness that none has the right to be worshipped except Allah, alone without partner, and I bear witness that Muhammad is His slave and Messenger.", "Muslim 1:209"),
            new Model("اذان سننے کی دعا ", "Dua upon hearing the Call to Prayer (Adhan)", "ًاللَّهُمَّ رَبَّ هَذِهِ الدَّعْوَةِ التَّامَّةِ، وَالصَّلَاةِ الْقَائِمَةِ، آتِ مُحَمَّداً الْوَسِيلَةَ وَالْفَضِيلَةَ، وَابْعَثْهُ مَقَاماً مَحْمُوداً الَّذِي وَعَدْتَهُ ", "اے اللہ ، اس کامل اذان اور اس قائم نماز کے مالک ، عطا فرما محمد (صلی اللہ علیہ وآلہ وسلم) کو '' وصیلہ '' اور اس کی تعظیم و تکریم کی اور جو قابل ستائش مقام کی آپ نے اس سے وعدہ کیا ہے", "O Allah, Lord of this perfect call and of this established prayer, grant Muhammad (pbuh) the ‘Wasilah’ and honour and raise him to the praiseworthy position which You have promised him.", "Al-Bukhari 1/152,"),
            new Model(" اگر کھانے سے پہلے اللہ کا نام پڑھنا بھول جائے اس کے لئے دعا", "Dua if one forgets to recite the name of Allah (SWT) before eating", "ًبِسمِ اللهِ أَوَّلَهُ وَآخِرَه", "اللہ کے نام سے شروع  اور آخر میں", "In the Name of Allah at the beginning and at the end", "(Abi Da’ud)"),
            new Model("دعوت کھانے کے بعد کی دعا", "Dua when invited to and dining at someone’s invitation", "اَللّٰھُمَّ اَطْعِمْ مَنْ اَطْعَمَنِیْ وَاسْقِ مَنْ سَقَانِیًْ", "یااللہ ! کھلا اس کو جس نے مجھے کھلایا اور پلااس کو جس نے مجھے پلایا", "O Allah  feed him who fed me and give him to drink who gave to drink.", "(Muslim)"),
            new Model(" دودھ پینے کی دعا", "Dua when drinking Milk", "ًاللَّهُمَّ بَارِكْ لَنَا فِيهِ وَزِدْنَا مِنْهُ", "اے اللہ! ہمیں اس میں برکت دے اور اس میں اضافہ فرما۔", "O Allah! Bless us in it and give us increase of it.", "At-Tirmidhi 5:506"),
            new Model("زمزم پینے کی دعا", "Dua when drinking Zamzam", "ًاللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمَاً نَافِعَاًً وَرِزْقَاً وَاسِعَاًَ وَشِفَاءً مِنْ كُلِّ دَاءٍ", "الٰہی عزوجل میں تجھ سے علم نافع کا اور رزق کی کشادگی کا اور بیماری سے شفایابی کا سوال کرتا ہوں۔", "O Allah, I seek of You, beneficial knowledge, plentiful provision, and cure from all diseases.", "(Hisnul Hasin)"),
            new Model("نئے لباس پہننے کی دعا", "Dua When Wearing New Clothing", "ًالْحَمْدُ لِلَّهِ الَّذِي كَسَانِي هَذَا الثَوْبَ وَ رَزَقَنِيْهِ مِنْ غَيْرِ حَوْلِ مِنِّيْ وَلاَ قُوَّةِ", "تمام تعریفیں اللہ کے لئے ہیں جنہوں نے مجھے لباس پہنایا اور میری طرف سے کسی طاقت اور قابلیت کے بغیر مجھے عطا کیا", "All praises are for Allah who dressed me with this garment and gave it to me without any strength and ability on my part", "(Tirmidhi)"),
            new Model("لباس پہننے کی دعا", "Dua when wearing clothes", "الْحَمْدُ لِلَّهِ الَّذِي كَسَانِي مَا أُوَارِي بِهِ عَوْرَتِي وَأَتَجَمَّلُ بِهِ فِي حَيَاتِيً", "ساری تعریفیں اللہ کی ہیں جنہوں نے مجھے ایسے لباس سے آراستہ کیا جس کے ذریعے میں اپنے خفیہ حصوں کو چھپاتا ہوں اور جس کے ذریعہ میں اپنی زندگی میں خوبصورتی حاصل کرتا ہوں", "All praise belongs to Allah who adorned me with clothing by which I cover (hide) my private areas and by which I obtain beauty in my life", "(Tirmidhi)"),
            new Model("سونے کے وقت کپڑے تبدیل کرنے کی دعا ", "Dua when removing clothes at the time of sleeping, changing etc.", "ًبِسْمِ اللَّهِ الَّذِي لَا إِلَهَ إِلَّا هُوَ", "اللہ کے نام پر ، اس کے علاوہ کوئی رب نہیں ہے", "In the name of Allah, apart from whom there is no Lord", "(al-Nasai)"),
            new Model(" کسی کو نئے کپڑے پہنتے ہوئے دیکھنے کے بعد کی دعا", "Dua when observing someone wearing new clothes", "الْبَسْ جَدِيداً، وَعِشْ حَمِيداً، وَمُتْ شَهِيداًً", "نئے کپڑے پہنیں ، قابل تعریف زندگی بسر کریں اور شہید کی حیثیت سے مریں۔", "Put on new clothes, live a praise-worthy life and die as a martyr.", "Ibn Majah 2/1178"),
            new Model("آئینے میں دیکھنے کی دعا", "Dua when looking in the Mirror", "اللَّهُمَّ أَنْتَ حَسَّنْتَ خَلْقِي فَحَسِّنْ خُلُقِيً", "اے اللہ جس طرح تو نے میری خارجی خصوصیات کو خوبصورت بنایا ہے اسی طرح میرے کردار کو بھی خوبصورت بنا دو", "O Allah, just as You have made my external features beautiful, make my character beautiful as well", "(Hisnul Hasin :Pg 206)"),
            new Model("سفر سے واپسی کی دعا ", "Dua when returning from a Journey", "ًآيِبُونَ تَائِبُونَ عَابِدُونَ لِرَبِّنَا حَامِدُونَ", "ہم لوٹتے ہیں ، توبہ کرتے ہیں ، عبادت کرتے ہیں اور اپنے رب کی تعریف کرتے ہیں۔", "We return, repent, worship and praise our Lord.", "(Bukhari)"),
            new Model("کسی کا شکریہ ادا کرنے کی دعا", "Dua when Thanking someone", "ًجَزاكَ اللهُ خَـيْراً", "اللہ آپ کو جزائے خیر عطا کرے", "May Allah reward you with good", "At-Tirmidhi: 2035"),
            new Model("مسلمان کو خوش دیکھنے کے بعد کی دعا ", "Dua when seeing a Muslim happy", "أَضْحَكَ اللَّهُ سِنَّكًَ", "اللہ تعالٰی آپ کو خوش رکھے", "May Allah Ta’ala keep you happy", "Sahih Bukhari, Hadith: 3683 and 6085"),
            new Model(" آگ دیکھنے کی دعا", "Dua When Seeing a Fire", "اللَّهُ أَكْبَرًُ", "الله سب سے بڑا ہے", "Allah is the Greatest.", "Al Nasa)"),
            new Model("جسم میں کہیں بھی درد محسوس ہو اس کے لئے دعا", "Dua when feeling pain anywhere in the body", "أَعُوذُ باللهِ وَقُدْرَتِهِ مَنْ شَرِّ مَا أَجِدُ وَأُحَاذِرًُ", "میں اللہ کے قدرت پر پناہ مانگتا ہوں اس شر سے جو میں محسوس کرتا ہوں اور جس سے میں محتاط ہوں", "I seek refuge in Allah and in His Power from the evil of what I find and of what I guard against.", "Muslim 4/1728."),
            new Model("جب کچھ برا ہوجاتا ہے اس کے لئے دعا", "Dua when something bad or unfortunate happens", "الْحَمْـدُ للهِ على كُـلِّ حَالًٍ", "جب کچھ برا ہوجاتا ہے", "Praise is to Allah in all circumstances", "Ibn Majah: 3803, 3804"),
            new Model("تھنڈر(گرج) سننے کی دعا", "Dua when hearing Thunder", "سُبْـحانَ الّذي يُسَبِّـحُ الـرَّعْدُ بِحَمْـدِهِ، وَالملائِكـةُ مِنْ خيـفَتهً", "پاک ہے اسی کی ذات جس کی گرج اور فرشتے اس کے خوف سے تسبیح کرتے ہیں", "Glory is to Him Whom thunder and angels glorify due to fear of Him.", "Al-Muwatta' 2:992"),
            new Model("جماع کے وقت کی دعا", "Dua at the time of Sexual Intercourse", "ًبِسْمِ اللهِ اللَّهُمَّ جَنِّبْنَا الشَّيْطَانَ ، وَجَنِّبِ الشَّيْطَانَ مَا رَزَقْـتَنَا", "اللہ کے نام پر۔ اے اللہ شیطان کو ہم سے دور رکھے اور شیطان کو اس سے دور رکھے جو تو نے ہمیں عطا کیا ہے۔", "In the Name of Allah. O Allah, keep the shaytaan away from us and keep the shaytaan away from what You have blessed us with. ", " Bukhari No# 141, 3271, 6388, 7396"),
            new Model(" جہنم کی آگ سے حفاظت کے لئے دعا", "Dua for Protection from Hell", "رَبَّنا ءاتِنا فِى الدُّنيا حَسَنَةً وَفِى الءاخِرَةِ حَسَنَةً وَقِنا عَذابَ النّارًِ", "ہمارے رب! ہمیں دنیا میں بھلائی اور آخرت میں بھلائی عطا فرما اور ہمیں آگ کی عذاب سے بچا", "Our Lord ! grant us good in this world and good in the hereafter and save us from the torment of the Fire'' AMEEN", "SURAH AL-BAQARAH ,VERSE 201"),
            new Model("اللہ کی محبت کے  لئے دعا", "Duas for seeking the love of Allah", "ًاللَّهُمَّ إِنِّي أَسْأَلُكَ حُبَّكَ، وَحُبَّ مَنْ يُحِبُّكَ، وَالعَمَلَ الَّذِي يُبَلِّغُنِي حُبَّكَ، اللَّهُمَّ اجْعَلْ حُبَّكَ أَحَبَّ إِلَيَّ مِنْ نَفْسِي وَأَهْلِي، وَمِنَ المَاءِ البَارِدِ", "اے اللہ ، میں آپ سے آپ کی محبت اور ان لوگوں کی محبت کے لئے دعا گو ہوں جو آپ سے محبت کرتے ہیں اور اس عمل سے محبت کرتے ہیں جو آپ کی محبت کو پہنچا دے گا۔ اے اللہ اپنی محبت کو ، اپنے گھر والوں اور ٹھنڈے پانی سے زیادہ مجھ کو محبوب بنائے", "O Allah, I ask You for Your love and the love of those who love You and love of the action which will make me reach Your love. O Allah make Your love more beloved to me than myself, my family and cold water", "(Tirmidhi)"),
    };
    public static final Model[] NAMAZ = {
            new Model("تکبیر تحریمہ", "Takbeer e Tahreema", "کھڑے ہوکر قبلہ کا سامنا کریں (مکہ مکرمہ میں کعبہ کی سمت).\n اپنی نیت کو اپنے دل میں پہچانا۔ نماز شروع کرنے سے پہلے ، یہ ضروری ہے کہ آپ نماز پڑھنے کا ارادہ رکھیں۔\nمردوں کے لئے اپنے ایارلوباس کو اپنے ہاتھ بلند کرو ، اور عورتوں کے لئے کندھوں ، جب یہ کہتے ہیں\n", "Stand and face the Qiblah (direction towards the Ka‘bah in Makkah).\nMake your intention known in your heart. Before initiating the salat, it is important that you have the intention to pray.\nRaise your hands up to your earlobes for men, and shoulders for women, whilst saying:", "الله أَكْبَر", "ترجمہ: الله سب سے بڑا ہے.", "Allah is the Greatest", "Allahu Akbar", R.drawable.first),
            new Model("ثناء", "Sana", "اپنے ہاتھوں کو یا تو اپنی ناف پر ، اپنے سینے پر ، یا دونوں کے درمیان رکھیں۔ اسلامی مکاتب فکر کے مابین اس میں اختلاف ہے۔ اپنی آنکھیں زمین پر مرکوز رکھیں۔ اس سے آپ کی نگاہ کو مستحکم رکھنے میں مدد ملتی ہے جب بعد میں سجدہ کرتے وقت آپ کا سر کہاں آرام کرے گا۔ اپنی آنکھوں کو بھٹکنے نہ دیں۔\n افتتاحی دعا کی تلاوت کریں۔", "Place your hands either on your navel, on your chest, or between the two; there's a difference of opinion between Islamic schools of thoughts. Keep your eyes focused on the ground. It helps to keep your sight fixed on where your head will rest when prostrating later. Do not let your eyes wander.\n Recite the opening Dua.", "سُبْحَانَكَ اللَّهُمَّ وَبِحَمْدِكَ وَتَبَارَكَ اسْمُكَ وَتَعَالَى جَدُّكَ وَلاَ إِلَهَ غَيْرُكَ", "اے اللہ ، تمھارے لئے شان و شوکت ہے ، اور تیرا نام مبارک ہے ، اور تیرا عظمت ہے اور تیرے سوا کوئی معبود نہیں۔", " ‘O Allah, glory and praise are for You, and blessed is Your Name, and exalted is Your Majesty and there is no god but You", "SubhanaK-Allahumma wa bihamdiKa, wa tabaarak-asmuKa, wa ta-‘aala jadduKa, wa la ilaaha illa ghayruK", R.drawable.second),
            new Model("تعوُّذ", "Ta`Awwudh", "مندرجہ بالا وضاحت کے بعد تعوُّذ کی بھی پیروی کی گئی ہے ، جو خاموشی کے ساتھ بھی تلاوت کی جاتی ہے۔", "The above glorification is followed by Ta‘awwudh, which is also recited silently:", "أَعُوذُ بِاللهِ مِنَ الشَّيْطَانِ الرَّجِيمِ", "میں ملعون شیطان سے اللہ کی پناہ مانگتا ہوں.", "I seek refuge with Allah from Satan, the accursed.", "A‘udhu billahi minash-shaitanir-rajim.", R.drawable.second),
            new Model("تسمیہ", "Tasmiyah", "بسم اللہ امام کے ذریعہ یا تو خاموشی سے یا بلند آواز میں تلاوت کی جاتی ہے۔ جماعت اس کے باوجود خاموشی سے تلاوت کرتی ہے۔ تسمیہ درج ذیل ہے۔", "Bismillah is recited either silently or loudly, by the Imam. The congregation, however, recites it silently. Tasmiyah is as follows:", "بِسۡمِ ٱللَّهِ ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ", "شروع کرتا ہوں اللہ تعالیٰ کے نام سے جو بڑا مہربان نہایت رحم واﻻ ہے۔", "In the Name of Allah—the Most Compassionate, Most Merciful.", "Bismillahir-Rahmanir-Rahim.", R.drawable.second),
            new Model("سورة فاتحہ", "Suratul Fatihah", "اگر آپ اکیلے نماز پڑھیں تو آپ کو نماز کے ہر اکائی (رکعت) میں سورة فاتحہ پڑھنا چاہئے۔ تاہم ، اگر کسی امام کے پیچھے نماز پڑھ رہا ہو اور وہ بلند آواز سے تلاوت کرے ، تو پھر آپ کو اس کی تلاوت کرنا ضروری نہیں ہے۔", "You must recite Sura Al-Fatihah in each unit (Rakah) of the prayer, if you pray alone.  However, if praying behind an Imam and he recites loudly, then it is not necessary for you to recite it.At the end of Surah Al-Fatihah, the worshippers say Amin(أمين) which means 'O Allah! Accept our supplications.'", "اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِیْنَۙ(۱) الرَّحْمٰنِ الرَّحِیْمِۙ(۲) مٰلِكِ یَوْمِ الدِّیْنِؕ(۳) اِیَّاكَ نَعْبُدُ وَ اِیَّاكَ نَسْتَعِیْنُؕ(۴) اِهْدِنَا الصِّرَاطَ الْمُسْتَقِیْمَۙ(۵) صِرَاطَ الَّذِیْنَ اَنْعَمْتَ عَلَیْهِمْ غَیْرِ الْمَغْضُوْبِ عَلَیْهِمْ وَ لَا الضَّآلِّیْنَ۠(۷)", "سب تعریفیں اللہ ہی کے لئے ہیں جو تمام جہانوں کی پرورش فرمانے والا ہےo نہایت مہربان بہت رحم فرمانے والا ہےo روزِ جزا کا مالک ہےo (اے اللہ!) ہم تیری ہی عبادت کرتے ہیں اور ہم تجھ ہی سے مدد چاہتے ہیں o  ہمیں سیدھا راستہ دکھاo ان لوگوں کا راستہ جن پر تو نے انعام فرمایاo  ان لوگوں کا نہیں جن پر غضب کیا گیا ہے اور نہ (ہی) گمراہوں کاo", "All praise belongs to Allah, Lord of all the worlds, The Gracious, the Merciful, Master of the Day of Judgment. Thee alone do we worship and Thee alone do we implore for help. Guide us in the right path— The path of those on whom Thou hast bestowed Thy blessings, those who have not incurred Thy displeasure, and those who have not gone astray.", "Al-hamdu lillahi Rabbil ‘alamin. Ar-rahmanir-Rahim. Maliki yaumiddin. Iyyaka na‘budu wa iyyaka nasta‘in. Ihdinas-sirat al-mustaqim. Siratalladhina an‘amta ‘alai-him, ghairil maghdubi ‘alaihim wa lad-dallin.", R.drawable.second),
            new Model("قرآن مجید کی عبارت کی تلاوت", "Recite Passage from the Noble Quran", "اس کے بعد ، پھر ایک اور سورة کی تلاوت کریں۔ کم از کم تلاوت تین آیات ، یا ایک لمبی آیت ہے جو لمبائی میں تین مختصر آیات کے برابر ہے۔ البتہ بہتر ہے کہ ایک مکمل سورة کی تلاوت کی جائے۔", "Thereafter, Then recite another Surah. The minimum recitation is three verses, or one long verse which is equal in length to three short verses. However, it is better to recite a complete Surah.", "بِسۡمِ ٱللَّهِ ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ\nقُلۡ هُوَ اللّٰهُ اَحَدٌ﴿1﴾للّٰهُ الصَّمَدُ﴿2﴾لَمْ يَلِدْ وَلَمْ يُولَدْ﴿3﴾وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ﴿4﴾", "(اے نبئ مکرّم!) آپ فرما دیجئے: وہ اللہ ہے جو یکتا ہےo اللہ سب سے بے نیاز، سب کی پناہ اور سب پر فائق ہےo نہ اس سے کوئی پیدا ہوا ہے اور نہ ہی وہ پیدا کیا گیا ہےo اور نہ ہی اس کا کوئی ہمسر ہےo", "In the name of Allah, the Gracious, the Merciful. Say, He is Allah, the One; Allah, the Independent and Besought of all. He begets not, nor is He begotten; And there is none like unto Him.", "Bismillahir-Rahmanir-Rahim. Qul huwallahu Ahad. Allahus-Samad. Lam yalid, walam yulad. Walam yakullahu kufuwan ahad.", R.drawable.second),
            new Model("ركوع", "Rukku", "\"تلاوت کے اختتام پر ،\" اللہ اکبر \"کہو اور اپنے جسم کو موڑو تاکہ آپ کی پیٹھ اور گردن جتنا ممکن ہو سیدھے اور زمین کے ساتھ سطح ہو ، اپنی آنکھیں زمین پر مرکوز رکھیں اور اپنی انگلیوں اور ہتھیلیوں کو گھٹنوں پر رکھیں۔ آپ کی پیٹھ اور سر آپ کی ٹانگوں کے ساتھ 90 ° زاویہ پر ہونا چاہئے آپ کو کامل زاویہ بنانے کی ضرورت نہیں ہے۔ آپ کے جسم کو آرام دہ ہونا چاہئے۔ اس مقام کو رکوع کہتے ہیں۔رکوع کی پوزیشن میں درج ذیل تسبیح کو تاک تعداد میں خاموشی سے تین بار یا اس سے زیادہ تلاوت کرنا پڑتا ہے۔", "At the end of the recitation,say \"Allahu Akbar\" and bend your body so that your back and neck are as straight as possible and level with the ground, keeping your eyes focused on the ground and keep your fingers and palm on the knees. Your back and head should be at a 90° angle with your legs. You don't need to make a perfect angle; your body should be relaxed. This position is called ruku.In the Bowing position the following Tasbih is recited silently three times or more in odd numbers:", "سُبْحانَ رَبّيَ العَظِيم", "پاک ہے میرا رب، عظمت والا ہےـ", "Holy is my Lord, the Most Great.", "Subhana Rabbiyal ‘Azim.", R.drawable.third),
            new Model("رکوع سےاٹھنے کے بعد", "After getting up from Rukku", "پھر جب آپ بازوؤں کے ساتھ پوری طرح سیدھے کھڑے ہو جائیں اور پھر (ا) اور پھر \n(ب) کہیں۔", "Then as you stand up fully straight  again with arms by sides and say, (a) and Then say (b)", "(ا)سَمِعَ اللَّهُ لِمَنْ حَمِدَهُ\n(ب)رَبَّنَا لَكَ الْحَمْدُ", "(ا)اللہ سنتا ہے جو اس کی حمد کرتا ہے۔\n(ب)اے ہمارے رب ، تمام تعریفیں تیرے ہی ہیں۔", "(a)Allah listens to him who praises Him.\n(b)O our Lord, all praise belongs to You.", "(a)Sami‘allahu liman hamidah\n(b)Rabbana laKal hamd", R.drawable.fourth),
            new Model("سجده", "Sajjda", "اللہ اکبر کہو اور سجدہ کرو۔ اپنا سر ، گھٹنوں اور ہاتھوں کو فرش پر رکھیں۔ جبکہ \"سجد\" (سجدہ ریز) اس بات کو یقینی بنائے کہ آپ کی پیشانی اور ناک زمین کو چھوئے۔ آپ کی بازو فرش پر نہیں ہونی چاہئے۔ آپ کی انگلیاں ایک ساتھ ہونی چاہئیں۔ اسی پوزیشن کو \"سجدہ\" کہتے ہیں۔جب آپ پوری طرح سے پوزیشن میں ہوں تو ، مندرجہ ذیل دعا تین بار پڑھیں۔", "Say Allahu Akbar and prostrate. Place your head, knees and hands on the floor. While \"sujood\" (prostration) make sure that your forehead and nose touch the ground.Your forearms should not be on the floor.Your fingers should be together. This is the position called \"sajdah.\"When you are positioned fully, recite the following dua  three times.", "سُبْحَانَ رَبِّيَ الأَعْلَى", "پاک میرے پروردگار کی ذات پاک ہے", "Glory to my Lord, the Most High.", "Subhana Rabbiyal-a‘la.", R.drawable.fifth),
            new Model("جلسہ", "Jalsa", "پھر سر اٹھائیں اور اپنے ہاتھوں کو زمین سے رکھیں اور بیٹھے ہوئے مقام پر جائیں جس کو جلسہ کہتے ہیں۔ جب اس مقام پر بیٹھا ہوا تو نمازی اپنے بائیں پاؤں کو زمین پر افقی طور پر پھیلاتا ہے اور اس پر ٹکا جاتا ہے جبکہ اس کا دایاں پاؤں زمین پر کھڑا ہوتا ہے جس کی انگلیوں کا رخ کعبہ ہوتا ہے۔ ہاتھوں کو رانوں پر انگلیوں نے کعبہ کی طرف اشارہ کرتے ہوئے گھٹنوں کے بہت قریب رکھا ہے۔ اس پوزیشن میں ، درج ذیل دعائیں خاموشی کے ساتھ تلاوت کی جاتی ہیں۔", "Then raise the head and place your hands from the ground and go into the Sitting position called Jilsah. When sitting in this position, the worshipper spreads his left foot horizontally on the ground and rests on it while his right foot is placed on the ground in a perpendicular position, with the toes facing the Ka‘bah. The hands are placed on the thighs with the fingers pointing towards the Ka‘bah,very close to the knees. In this position, the following supplication is recited silently:", "اَللَّهُمَّ اغْفِرْلِيْ وَ ارْحَمْنِيْ وَ عَافِنِيْ وَ اجْبُرْنِيْ وَ ارْزُقْنِيْ", "پروردگار مجھے معاف فرما اور مجھ پر رحم فرما اور میری رہنمائی فرمائے اور مجھے سلامتی عطا فرمائے اور مجھے بلند کرے اور میری کوتاہیوں کو بہتر بنائے اور مجھے مہیا کرے۔", "Lord forgive me and have mercy on me and guide me and grant me security and raise me up and make good my shortcomings and provide for me.", "Allahum-maghfirli warhamni wahdini wa ‘afini warfa‘nii wajburni warzuqni.", R.drawable.sixth),
            new Model("تشهد", "Tashahhud", "دو سجدوں کے بعد اسی حالت میں جلسہ جیسے بیٹھے اور تشہد پڑھے۔ یہ خیال رہے کہ تشہد پڑھتے وقت ، جب نمازی اشھود اللہ الہ الا اللہ واللہ کے فقرے تک پہنچ جائے تو اسے اپنے دائیں ہاتھ کی ننگلی اٹھائے اور اسے نیچے گرادینا چاہئے جب تلاوت مكمل ہو جائے۔", "After two prostration sit in the same position like jalsa and recite tashahhud.It should be noted that while reciting Tashahhud, when the worshipper reaches the phrase Ashhadu alla ilaha illallahu, he should raise the forefinger of his right hand and should drop it down as he has recited it.", "ٱلتَّحِيَّاتُ لِلَّٰهِ وَٱلصَّلَوَاتُ وَٱلطَّيِّبَاتُ، ٱلسَّلَامُ عَلَيْكَ أَيُّهَا ٱلنَّبِيُّ وَرَحْمَةُ ٱللَّٰهِ وَبَرَكَاتُهُ، ٱلسَّلَامُ عَلَيْنَا وَعَلَىٰ عِبَادِ ٱللَّٰهُ ٱلصَّالِحِينَ، أَشْهَدُ أَنْ لَا إِلَٰهَ إِلَّا ٱللَّٰهُ، وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ.", "تمام سلام اللہ کی طرف سے ہے اور تمام نمازیں اور ہر چیز پاک ہے۔ نبی کریم صلی اللہ علیہ وآلہ وسلم ، آپ پر سلام ہو ، اور اللہ کی رحمت اور اس کی برکتیں۔ اور ہم پر اور اللہ کے نیک بندوں پر سلامتی ہو۔ میں گواہی دیتا ہوں کہ اللہ کے سوا عبادت کے لائق کوئی نہیں ، اور میں گواہی دیتا ہوں کہ محمد ﷺ اس کا بندہ اور رسول ہیں۔", "All Salutation is due to Allah and all Prayer and everything pure. Peace be upon thee, O Prophet, and the mercy of Allah and His blessings; and peace be on us and on all righteous servants of Allah. I bear witness that there is none worthy of worship except Allah, and I bear witness that Muhammad is His servant and Messenger.", "Attahiyyatu lillahi was-salawatu wat-tayyibatu, Assalamu ‘alaika ayyuhan-Nabiyyu wa Rahmatullahi wa Barakatuh, Assalamu ‘alaina wa ‘ala ibadillahis-Salihin. Ashhadu alla ilaha illallahu wa ashhadu anna Muhammadan ‘abduhu wa Rasuluh.", R.drawable.seventh),
            new Model("درود-ابراہیمی", "Darood -e- Ibraheemi", "تشہد کی تلاوت کے بعد ،  حضور صلی اللہ علیہ وآلہ وسلم پر رحمت کی دعا پڑھی جاتی ہے۔جس کو درود کہتے ہے۔", "After the recitation of Tashahhud, a prayer of blessing is recited on the Holy Prophet (SAW) which is called Durud.", "اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ. اللَّهُمَّ بَارِكْ عَلَى مُحَمَّدٍ، وَعَلَى آلِ مُحَمَّدٍ كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيم إِنَّكَ حَمِيدٌ مَجِيدٌ.", "اے اللہ پیغمبر اسلام (صلى الله عليه وسلم) پر اور پیغمبر اسلام (صلى الله عليه وسلم) کے گھر والوں پر سلامتی بھیجے جیسا کہ آپ نے حضرت ابراہیم (ع) اور حضرت ابراہیم (ع) کے اہل خانہ پر سلامتی بھیجی ہے ، بے شک آپ قابل ستائش اور بڑی شان والا  ہے۔ اے اللہ ، حضرت محمد مصطفی صلی اللہ علیہ وآلہ وسلم اور آل محمد صلی اللہ علیہ وآلہ وسلم کے گھر والوں کو بھی برکت عطا فرمائے جیسا کہ آپ نے حضرت ابراہیم (ع) اور حضرت ابراہیم (ع) کے اہل خانہ کو برکت دی ، بے شک آپ قابل ستائش اور بڑی شان والا  ہے۔", "O Allah send peace on Prophet Muhammad (P.B.U.H) and to the family of Prophet Muhammad (P.B.U.H) as you sent peace on Prophet Ibrahim (A.S) and the family of Prophet Ibrahim (A.S) Indeed, you are praiseworthy and glorious. O Allah, bless the Prophet Muhammad (P.B.U.H) and the family of Prophet Muhammad (Peace Be Upon Him) as you blessed Prophet Ibrahim (A.S) and the family of Prophet Ibrahim (A.S) Indeed, you are praiseworthy and glorious.", "Alla Huma Salli Ala Muhammadiw Wa Ala Aali Muhammadin Kamaa Sallaita Ala Ibrahima Wa Ala Aali Ibrahima Innaka Hamidum Majid. Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Innaka Hamidum Majid.", R.drawable.sixth),
            new Model("درود کے بعد کی دعا", "Dua after Darood", " درود کے بعد ایک مختصر دعا یا دعائیں ہوتی ہیں ، جن میں سے ایک ذیل میں دیا گیا ہے۔", "The invocation Durood is followed by a short prayer or prayers, one  of which is given below.", "ُرَبَّنَآ ءَاتِنَا فِى ٱلدُّنْيَا حَسَنَةًۭ وَفِى ٱلْـَٔاخِرَةِ حَسَنَةًۭ وَقِنَا عَذَابَ ٱلنَّارِ", "ہمارے رب! ہمیں دنیا اور آخرت کی بھلائی عطا فرما اور ہمیں عذاب دوزخ سے بچا۔", "Our Lord! Grant us the good of this world and the Hereafter, and protect us from the torment of the Fire.", "Rabbana atina fiddunya hasanatan wa fil akhirati hasanatan waqina adhabannar.", R.drawable.sixth),
            new Model("تسليم", "Taslim", "تشہد ، درود اور کسی بھی دعا کے بعد جس کی آپ تلاوت کرنا چاہتے ہو ، اس کے بعد نماز کا اختتام کریں:\nاپنے سر کو دائیں طرف مڑنا اور دی گئی دعا کہنا اور اس کے بعد اپنے سر کو بائیں طرف مڑیں اور نیچے دی گئی دعا کہیں۔ نماز ختم ہوگئیں۔", "After the tashahhud, durood, and any du'a you wish to recite, end the prayer by:\nTurning your head to the right and say the dua given and after that turn your head to the left and say the dua given below.  The prayers have ended.", "السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ", "اللہ کا سلامتی اور رحمت آپ کے ساتھ رہے.", "May the peace and the mercy of Allah be on you.", "Assalamu’alaikum warahmatullahi", R.drawable.eighth),
            new Model("نماز كى رکعتیں", "Salah Rakkats", "", "", "", "", "", "", 0),
    };

    public static final Model[] TASBEEHAT = {
            new Model("سُبْحاَنَ اللهِ", "Glory be to Allah", "Subhanallah"),
            new Model("اَلْحَمْدُ لِلهِ", "Praise be to Allah", "Alhamdulillah"),
            new Model("اَلّلَهُ اَكْبَرْ", " Allah is the Greatest", "Allahu Akbar"),
            new Model("لاَأِلَاهَ اِلاَّ اللّهُ وَحْدَهُ لاَ شَرِيكَ لَهُ لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلىَ كُلِّ شَيْءِِقَدِيرُ", "There is no god but Allah alone, He has no partners, to Him belongs dominion and to Him belongs praises, and He has power over all things.", "La-ilaha-ill’Allahu wahdahu-la-sharikalah, Lahul-mulku wa lahul-hamdu wa huwa ala-kulli-shay’in-Qadir, Subhana rabbiye’laliyyi’l-a’le’l-vehhâb"),
            new Model("لَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِٱللَّٰهِ", "There is no power nor strength except by Allah", "la hawla wala quwwata 'illa billah"),
            new Model("سُبْحَانَ اللَّهِ وَبِحَمْدِهِ، سُبْحَانَ اللَّهِ العَظِيم", "Glory be to Allah and all praise is due to him, glory be to Allah the great.", " Subhanallahi Wa Bihamdihi, Subhanallahil Azeem"),
            new Model("أَسْتَغْفِرُ اللَّهَ وَأَتُوبُ إِلَيْهِ", "I seek Allah forgiveness and I turn to Him in repentance.", "Astaghfirullaaha wa 'atoobu 'ilayhi."),
            new Model("أَعُوذُ بِكَلِمَاتِ اللَّهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ", "I take refuge in Allah perfect words from the evil He has created.", "'A'oothu bikalimaatil-laahit-taammaati min sharri maa khalaqa."),
            new Model("رَّبِّ زِدْنِي عِلْمًا", "O my Lord! advance me in knowledge.", "Rabbi zidnee AAilman"),
    };

    public static final Model[] ABLUTION = {
            new Model("Niyyah", "نیت", "First of all, make intention (Niyyah) in your heart that this act of making wudu is for offering namaz or reading quran just for sake of Allah then say:  “Bismillah” (in the name of Allah)", "سب سے پہلے اپنے دل میں یہ ارادہ کرلیں کہ وضو کرنے کا یہ فعل صرف اور صرف اللہ کی خاطر نماز پڑھنے یا قرآن پاک پڑھنے کے لئے ہے: پھر بسم اللہ کہو ", "بِسْمِ ٱللَّٰهِ ٱلرَّحْمَٰنِ ٱلرَّحِيمِ", "In the name of Allah, most gracious and most merciful", "خدا کے نام پر جو بہت ہی مہربان اور رحم کرنے والا ہے", "Bismillah Ar-Rahman Ar-Raheem", R.drawable.ablution_fifth, 0),
            new Model("Washing Hands", "ہاتھ دھونا", "Wash your both hands up to your wrists three times, make sure that water has reached among the fingers and thumb too.", "اپنے دونوں ہاتھوں کو تین بار اپنی کلائیوں تک دھوئے ، اس بات کو یقینی بنائیں کہ انگلیوں اور انگوٹھے میں بھی پانی آگیا ہے۔", "بِسْمِ اللّٰهِ وَبِاللّٰهِ اَللّٰهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ۔", "O Lord! Make me of those who repent and purify themselves.", "اے رب! مجھے توبہ کرنے والوں اور اپنے آپ کو پاک کرنے والوں میں سے بنادیں", "Alla hummaj alni minat tawwabina waj alni minal mutatah hirin.", R.drawable.ablution_first, 0),
            new Model("Rinse Your Mouth", "تین بار کلی کرنا", "Take water in your palm of right hand and put it into your mouth, keep on rinsing your mouth like this three times and make sure, there is no more food remaining in your mouth.", "اپنے دائیں ہاتھ کی ہتھیلی میں پانی لیں اور اسے اپنے منہ میں ڈالیں ، اس طرح تین بار اپنے منہ کو کللا دیتے رہیں اور اس بات کو یقینی بنائیں کہ آپ کے منہ میں مزید کھانے باقی نہیں ہیں۔", "اَللّٰهُمَّ لَقِّنِىْ حُجَّتِىْ يَوْمَ اَلْقَاكَ وَاَطْلِقْ لِسَانِىْ بِذِكْرَاكَ۔", "O Lord! Dictate to me the principles of faith on the Day I meet You, and make my tongue fluent with Your remembrance", "اے رب! جس دن میں تم سے ملتا ہوں اس دن مجھے ایمان کے اصولوں کی نشاندہی کرو ، اور میری زبان کو تمہارے یادوں سے روشناس کرو", "Alla Humma laq qini hujjati yawma alqaka wa atliq lisani bizikrika.", R.drawable.ablution_second, 0),
            new Model("Rinse Your Nose", "تین بار ناک میں پانی چڑھانا", "Take water in your palm of right hand and inhale it carefully into your nose three times. Use your left hand if necessary to help blowing it out", "دائیں ہاتھ کی ہتھیلی میں پانی لیں اور اسے تین بار بغور اپنی ناک میں داخل کریں۔ اگر ضروری ہو تو اپنے بائیں ہاتھ کو استعمال کرنے میں مدد کریں", "اَللّٰهُمَّ لَا تُحَرِّمْ عَلَىَّ رِيْحَ الْجَنَّةِ وَاجْعَلْنِىْ مِمَّنْ يَشَمُّ رِيْحَهَا وَرَوْحَهَا وَطِيْبَهَا۔", "O Lord! Do not deprive me of the fragrance of Paradise, and make me of those who smell its fragrance and per fume.", "اے رب! مجھے جنت کی خوشبو سے محروم نہ فرما ، اور مجھے ان لوگوں میں سے بنادے جو اس کی خوشبو اور ہر خوشبو کو مہکتے ہیں۔", "Alla humma la tuharrim 'alaya rihal jannati waj 'alni mim man yashummu riha ha wa rawha ha wa tiba ha", R.drawable.ablution_second, 0),
            new Model("Wash Your Face", "منہ دھونا", "wash your whole face three times while starting from your forehead to the bottom of the chin and from your right ear to the left ear properly.", "اپنے ماتھے سے ٹھوڑی کے نیچے تک اور اپنے دائیں کان سے بائیں کان کی طرف اچھے سے اپنے پورے چہرے کو تین بار دھوئیں۔", "اَللّٰهُمَّ بَيِّضْ وَجْهِىْ يَوْمَ تَسْوَدُّ الْوُجُوْهُ وَلَا تُسَوِّدْ وَجْهِىْ يَوْمَ تَبْيَضُّ الْوُجُوْهُ۔", "O Lord! Make my face bright on the Day when the faces will turn dark. Do not darken my face on the Day when the face s are bright.", "اے رب! اس دن میرے چہرے کو روشن کرو جب چہرے سیاہ ہوجائیں گے۔ اس دن میرے چہرے کو سیاہ نہ کرو جب چہرے روشن ہوں گے۔", "Alla humma bayyiz wajhi yawma taswaddufihil wujuh wala tusawwid waj hi yawma tabyazzul wujuh.", R.drawable.ablution_third, 0),
            new Model("Wash Your Right Arm", "دائیں بازو کو دھونا", "wash your right hand up to the elbow properly three times and make sure that no part of the arm has been left dry ", "اپنے داہنے ہاتھ کوہنیہ تک صحیح طور پر تین بار دھوئیں اور اس بات کو یقینی بنائیں کہ بازو کا کوئی حصہ خشک نہ رہا ہو", "اَللّٰهُمَّ اَعْطِنِىْ كِتَابِىْ بِيَمِيْنِىْ وَالْخُلْدَ فِى الْجِنَانِ بِيَسَارِىْ وَحَاسِبْنِىْ حِسَابًا يَسِيْرًا", "O Lord! Give my book of deeds in my right hand, and a permanent stay in Paradise on my left, and make my reckoning an easy one.", "اے رب! میرے اعمال کو میرے دائیں ہاتھ میں ، اور میرے بائیں طرف جنت میں مستقل قیام کرو ، اور میرا حساب کتاب آسان بنا دو۔", "Alla humma a'tini kitabi bi yamini wal khulda fil jinani bi yasari wa hasibni hisaban yasira", R.drawable.ablution_fourth, 0),
            new Model("Wash Your Left Arm.", "بائیں بازو کو دھونا", "wash your left hand up to the elbow properly three times and make sure that no part of the arm has been left dry", "اپنے بائیں ہاتھ کو کہنی تک مناسب طریقے سے تین بار دھوئیں اور اس بات کو یقینی بنائیں کہ بازو کا کوئی حصہ خشک نہ رہا ہو", "اَللّٰهُمَّ لَا تُعْطِنِىْ كِتَابِىْ بِشِمَالِىْ وَلَا مِنْ وَرَاۤءِ ظَهْرِىْ وَلَا تَجْعَلْهَا مَغْلُوْلَةً اِلٰى عُنُقِىْ وَاَعُوْذُ بِكَ مِنْ مُقَطَّعَاتِ النِّيْرَانِ۔", "O Lord! Do not give my book of deeds in my left hand, n or from behind my back, nor chain it to my neck. I seek refuge in You from the Hell-fire.", "اے رب! میرے اعمال کی کتاب کو میرے بائیں ہاتھ ، این یا میری پیٹھ کے پیچھے سے نہ دیں اور نہ ہی اسے میری گردن سے زنجیر بنائیں۔ میں جہنم کی آگ سے تیری پناہ مانگتا ہوں۔", "Alla humma la tutini kitabi bishimali wala min wara'i zahri wala taj alha maghlu latan ila unuqi wa a'uzu bika min muqat ta'atin niran.", R.drawable.ablution_fourth, 0),
            new Model("Perform Masah", "مسح ادا کرنا ", "wipe your both wet hands from forehead to back of your neck and then wipe back from your neck to forehead again, do it only one time.wipe the grooves and holes of ears with the wet index fingers of your both hands while also using your thumbs of both hands to clean your behind ears from the bottom upwards. do it only one time.", "اپنے دونوں گیلے ہاتھوں کو پیشانی سے اپنی گردن کے پچھلے حصے تک مسح کریں اور پھر اپنی گردن سے ماتھے تک دوبارہ مسح کریں ، صرف ایک بار کریں۔اپنے دونوں ہاتھوں کی گیلی انڈیکس انگلیوں سے کانوں کے نالیوں اور سوراخوں کو صاف کریں جبکہ اپنے انگوٹھے کو بھی استعمال کریں۔ نیچے سے اوپر کی طرف اپنے پیچھے کان صاف کرنے کے لئے دونوں ہاتھوں کا۔ صرف ایک بار کرو", "اَللّٰهُمَّ غَشِّنِىْ رَحْمَتَكَ وَبَرَكَاتِكَ۔", "O Lord! Cover me with Your Mercy, Blessings and Forgiveness. ", "اے رب! مجھے اپنی رحمت ، برکتوں اور بخششوں سے ڈھانپیں۔", "Alla humma ghashshini bi rahmatika wa barakatika wa 'afwika.", R.drawable.ablution_sixth, 0),
            new Model("Wash your both feet", "اپنے دونوں پاؤں کو دھونا", "starting from right foot, wash your both feet to the ankles three times, Use your pinky finger and go through each toe to get rid of anything between the toes and make sure that water has reached between the toes and covered the rest of the foot.", "دائیں پاؤں سے شروع کرتے ہوئے ، اپنے دونوں پاؤں ٹخنوں تک تین بار دھویں ، اپنی چھوٹی انگلی کا استعمال کریں اور پیر کے درمیان کسی بھی چیز سے چھٹکارا پانے کے لئے ہر پیر سے گزریں اور اس بات کو یقینی بنائیں کہ پانی انگلیوں کے درمیان پہنچ گیا ہے اور باقی پاؤں کو ڈھانپ دیں۔", "اَللّٰهُمَّ ثَبِّتْنِىْ عَلَى الصِّرَاطِ يَوْمَ تَزِلُّ الْاَقْدَامُ وَاجْعَلْ سَعْيِىْ فِيْمَا يُرْضِيْكَ عَنِّىْ يَا ذَاالْجَلَالِ وَالْاِكْرَامِ۔", "O Lord! Keep me firm on the Bridge (to Paradise) on the Day when the feet will slip, and help me in my efforts to do things which will please You, O' Glorious and Mighty!. ", "اے رب! مجھے اس دن پل (جنت میں) قائم رکھیں جب پیر پھسل جائیں ، اور میری کوششوں میں میری مدد کریں کہ وہ کام کریں جو آپ کو راضی کردے ، اے غالب اور غالب!", "Alla humma thabbitni alas sirati yawma tazillu fihil aqdam. Waj'al sa'yi fi ma yurzika 'anni ya zal jalali wal ikram.", R.drawable.ablution_seventh, 0),
    };

    public static final Model[] RAMADAN_HEADINGS = {
            new Model("Fasting from the Quran", "روزه قرآن سے"),
            new Model("Fasting from Hadiths", "روزه احادیث سے"),
            new Model("How to keep Fast", "روزه رکھنے کا طریقہ"),
            new Model("Fasting prayers", "روزے کی دعائیں"),
            new Model("The virtue of Taraweeh", "تراویح کی فضیلت"),
            new Model("How to Pray of Taraweeh", "تراویح پڑھنے کا طریقہ"),
    };

    public static final Model[] ZAKKAT_HEADINGS ={
            new Model("Zakkat from the Quran", "زکوة قرآن سے"),
            new Model("Zakkat from Hadiths", "زکوة احادیث سے"),
            new Model("Real deserving of Zakat", "زکوٰة کے حقیقی مستحق"),
            new Model("Calculate Zakkat", "زکوة کا حساب لگائیں"),
            new Model("Find Gold and Silver Rates", "سونے اور چاندی کی قیمتیں تلاش کریں"),
    };

    public static final Model[] RAMADAN_QURANIC_DETAIL = {
            new Model("يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ كُتِبَ عَلَيْكُمُ ٱلصِّيَامُ كَمَا كُتِبَ عَلَى ٱلَّذِينَ مِن قَبْلِكُمْ لَعَلَّكُمْ تَتَّقُونَ", "O you who have believed, decreed upon you is fasting as it was decreed upon those before you that you may become righteous", "اے ایمان والو! تم پر روزہ رکھنا اسی طرح روزہ رکھتا ہے جس طرح تم سے پہلے لوگوں پر یہ حکم دیا گیا تھا کہ تم نیک ہوجاؤ", "Surah Baqarah Ayah 183"),
            new Model("أَيَّامًا مَّعْدُودَٰتٍ ۚ فَمَن كَانَ مِنكُم مَّرِيضًا أَوْ عَلَىٰ سَفَرٍ فَعِدَّةٌ مِّنْ أَيَّامٍ أُخَرَ ۚ وَعَلَى ٱلَّذِينَ يُطِيقُونَهُۥ فِدْيَةٌ طَعَامُ مِسْكِينٍ ۖ فَمَن تَطَوَّعَ خَيْرًا فَهُوَ خَيْرٌ لَّهُۥ ۚ وَأَن تَصُومُوا۟ خَيْرٌ لَّكُمْ ۖ إِن كُنتُمْ تَعْلَمُونَ", "[Fasting for] a limited number of days. So whoever among you is ill or on a journey [during them] – then an equal number of days [are to be made up]. And upon those who are able [to fast, but with hardship] – a ransom [as substitute] of feeding a poor person [each day]. And whoever volunteers excess – it is better for him. But to fast is best for you, if you only knew.", "[روزہ رکھنا] محدود دن۔ تو جو بھی تم میں سے بیمار ہو یا سفر پر [ان کے دوران] - پھر برابر دن بنائے جائیں۔ اور ان لوگوں پر جو [روزہ رکھنے کی اہلیت رکھتے ہیں ، لیکن مشکلات کے ساتھ) - ایک غریب کو [ہر روز] کھانا کھلانے کے بدلے [تاوان] اور جو شخص رضاکارانہ طور پر کام کرتا ہے - اس کے لئے بہتر ہے۔ لیکن اگر آپ صرف جانتے ہی تو روزہ رکھنا آپ کے لئے بہترین ہے۔", "Surah Baqarah Ayah 184"),
            new Model("شَهْرُ رَمَضَانَ ٱلَّذِىٓ أُنزِلَ فِيهِ ٱلْقُرْءَانُ هُدًى لِّلنَّاسِ وَبَيِّنَٰتٍ مِّنَ ٱلْهُدَىٰ وَٱلْفُرْقَانِ ۚ فَمَن شَهِدَ مِنكُمُ ٱلشَّهْرَ فَلْيَصُمْهُ ۖ وَمَن كَانَ مَرِيضًا أَوْ عَلَىٰ سَفَرٍ فَعِدَّةٌ مِّنْ أَيَّامٍ أُخَرَ ۗ يُرِيدُ ٱللَّهُ بِكُمُ ٱلْيُسْرَ وَلَا يُرِيدُ بِكُمُ ٱلْعُسْرَ وَلِتُكْمِلُوا۟ ٱلْعِدَّةَ وَلِتُكَبِّرُوا۟ ٱللَّهَ عَلَىٰ مَا هَدَىٰكُمْ وَلَعَلَّكُمْ تَشْكُرُونَ", "The month of Ramadhan [is that] in which was revealed the Qur’an, a guidance for the people and clear proofs of guidance and criterion. So whoever sights [the new moon of] the month, let him fast it; and whoever is ill or on a journey – then an equal number of other days. Allah intends for you ease and does not intend for you hardship and [wants] for you to complete the period and to glorify Allah for that [to] which He has guided you; and perhaps you will be grateful.", "ماہ رمضان [وہ ہے] جس میں قرآن مجید نازل ہوا جو لوگوں کے لئے ہدایت اور ہدایت اور کسوٹی کے واضح ثبوت ہیں۔ لہذا جو شخص مہینے کا [نیا چاند] دیکھے وہ اسے روزہ رکھے؛ اور جو بیمار ہو یا سفر میں۔ پھر دوسرے دن کی برابر تعداد۔ اللہ آپ کا آسانی کا ارادہ رکھتا ہے اور آپ کی مشکلات کا ارادہ نہیں کرتا ہے اور چاہتا ہے کہ آپ مدت پوری کرے اور اس کی وجہ سے اللہ کی تمجید کرے جس نے اس نے آپ کی رہنمائی کی ہے۔ اور شاید آپ شکر گزار ہوں گے۔", "Surah Baqarah Ayah 185"),
            new Model("أُحِلَّ لَكُمْ لَيْلَةَ ٱلصِّيَامِ ٱلرَّفَثُ إِلَىٰ نِسَآئِكُمْ ۚ هُنَّ لِبَاسٌ لَّكُمْ وَأَنتُمْ لِبَاسٌ لَّهُنَّ ۗ عَلِمَ ٱللَّهُ أَنَّكُمْ كُنتُمْ تَخْتَانُونَ أَنفُسَكُمْ فَتَابَ عَلَيْكُمْ وَعَفَا عَنكُمْ ۖ فَٱلْـَٰٔنَ بَٰشِرُوهُنَّ وَٱبْتَغُوا۟ مَا كَتَبَ ٱللَّهُ لَكُمْ ۚ وَكُلُوا۟ وَٱشْرَبُوا۟ حَتَّىٰ يَتَبَيَّنَ لَكُمُ ٱلْخَيْطُ ٱلْأَبْيَضُ مِنَ ٱلْخَيْطِ ٱلْأَسْوَدِ مِنَ ٱلْفَجْرِ ۖ ثُمَّ أَتِمُّوا۟ ٱلصِّيَامَ إِلَى ٱلَّيْلِ ۚ وَلَا تُبَٰشِرُوهُنَّ وَأَنتُمْ عَٰكِفُونَ فِى ٱلْمَسَٰجِدِ ۗ تِلْكَ حُدُودُ ٱللَّهِ فَلَا تَقْرَبُوهَا ۗ كَذَٰلِكَ يُبَيِّنُ ٱللَّهُءَايَٰتِهِۦ لِلنَّاسِ لَعَلَّهُمْ يَتَّقُونَ ", "It has been made permissible for you the night preceding fasting to go to your wives [for sexual relations]. They are clothing for you and you are clothing for them. Allah knows that you used to deceive yourselves, so He accepted your repentance and forgave you. So now, have relations with them and seek that which Allah has decreed for you. And eat and drink until the white thread of dawn becomes distinct to you from the black thread [of night]. Then complete the fast until the sunset. And do not have relations with them as long as you are staying for worship in the mosques. These are the limits [set by] Allah, so do not approach them. Thus does Allah make clear His ordinances to the people that they may become righteous.", "آپ کے لئے [رات کے روزے سے پہلے یہ جائز قرار دیا گیا ہے کہ آپ اپنی بیویوں کے [جنسی تعلقات] کے پاس جائیں۔ وہ آپ کے لئے لباس ہیں اور آپ ان کے لئے لباس ہیں۔ اللہ جانتا ہے کہ تم اپنے آپ کو دھوکہ دیتے تھے ، لہذا اس نے تمہاری توبہ قبول کرلی اور تمہیں معاف کردیا۔ تو اب تم ان سے تعلقات رکھو اور اس کی تلاش کرو جس کا اللہ نے تمہارے لئے فیصلہ کیا ہے۔ اور کھاؤ پینا اس وقت تک جب صبح کا سفید دھاگہ تمہارے لئے سیاہ رات کے دھاگے سے الگ ہوجائے۔ پھر غروب آفتاب تک روزہ رکھنا۔ اور جب تک آپ مساجد میں عبادت کے لئے قیام پذیر ہوں ان سے تعلقات نہ رکھیں۔ یہ اللہ کی حدود ہیں۔ لہذا ان کے پاس مت جاؤ۔ اس طرح اللہ لوگوں کے لئے اپنے احکام واضح کردیتے ہیں تاکہ وہ نیک ہوجائیں۔", "Surah Baqarah Ayah 187"),
            new Model("إِنَّا أَنْزَلْنَاهُ فِي لَيْلَةِ الْقَدْرِ وَمَا أَدْرَاكَ مَا لَيْلَةُ الْقَدْرِ لَيْلَةُ الْقَدْرِ خَيْرٌ مِنْ أَلْفِ شَهْرٍ تَنَزَّلُ الْمَلَائِكَةُ وَالرُّوحُ فِيهَا بِإِذْنِ رَبِّهِمْ مِنْ كُلِّ أَمْرٍ سَلَامٌ هِيَ حَتَّىٰ مَطْلَعِ الْفَجْرِ", "Indeed, We sent the Qur’an down during the Night of Decree. And what can make you know what is the Night of Decree? The Night of Decree is better than a thousand months. The angels and the Spirit descend therein by permission of their Lord for every matter. Peace it is until the emergence of dawn.", "بے شک ، ہم نے فرمانِ شب کی رات قرآن کو اتارا۔ اور آپ کو کیا معلوم کہ رات کا حکم کیا ہے؟ رات کا فرمان ہزار مہینوں سے بہتر ہے۔ فرشتے اور روح اس میں ہر معاملے کے لئے اپنے پروردگار کی اجازت سے اترتے ہیں۔ سلام یہ طلوع فجر کے ظہور تک ہے۔", "Surah Al Qadr"),
    };

    public static final Model[] RAMADAN_HADITH_DETAIL = {
            new Model("إِذَا دَخَلَ شَهْرُ رَمَضَانَ فُتِّحَتْ أَبْوَابُ السَّمَاءِ، وَغُلِّقَتْ أَبْوَابُ جَهَنَّمَ، وَسُلْسِلَتِ الشَّيَاطِينُ", "Allah's Messenger (ﷺ) said, When the month of Ramadan starts, the gates of the heaven are opened and the gates of Hell are closed and the devils are chained", "اللہ کے رسول صلی اللہ علیہ وسلم نے فرمایا ، جب رمضان کا مہینہ شروع ہوتا ہے تو جنت کے دروازے کھول دیئے جاتے ہیں اور جہنم کے دروازے بند ہوجاتے ہیں اور شیطانوں کو جکڑا جاتا ہے", "Sahih al-Bukhari 1899 ,narrated abu Huraira RA", (long) 0),
            new Model(" إِذَا رَأَيْتُمُوهُ فَصُومُوا، وَإِذَا رَأَيْتُمُوهُ فَأَفْطِرُوا، فَإِنْ غُمَّ عَلَيْكُمْ فَاقْدُرُوا لَهُ ", "I heard Allah's Messenger (ﷺ) saying, When you see the crescent (of the month of Ramadan), start fasting, and when you see the crescent (of the month of Shawwal), stop fasting; and if the sky is overcast (and you can't see it) then regard the month of Ramadan as of 30 days", "میں نے رسول اللہ  کو یہ کہتے ہوئے سنا ، جب آپ رمضان (رمضان کے مہینے) کو دیکھیں گے ، تو روزہ رکھنا شروع کریں ، اور جب آپ ہلال (ماہ شوال) دیکھیں گے ، تو روزہ رکیں ، اور اگر آسمان پر بادل چھائے ہوئے ہوں گے ( اور آپ اسے نہیں دیکھ سکتے) پھر رمضان کے مہینے کو 30 دن کی طرح سمجھیں", "Sahih al-Bukhari 1900, narrated ibn Umar", (long) 0),
            new Model(" مَنْ قَامَ لَيْلَةَ الْقَدْرِ إِيمَانًا وَاحْتِسَابًا غُفِرَ لَهُ مَا تَقَدَّمَ مِنْ ذَنْبِهِ، وَمَنْ صَامَ رَمَضَانَ إِيمَانًا وَاحْتِسَابًا غُفِرَ لَهُ مَا تَقَدَّمَ مِنْ ذَنْبِهِ ", "The Prophet (ﷺ) said, Whoever established prayers on the night of Qadr out of sincere faith and hoping for a reward from Allah, then all his previous sins will be forgiven; and whoever fasts in the month of Ramadan out of sincere faith, and hoping for a reward from Allah, then all his previous sins will be forgiven.", "حضرت محمد مصطفی صلی اللہ علیہ وسلم نے فرمایا ،جس نے بھی سچے عقیدے سے شب قدر کو نماز قائم کی اور اللہ سے اجر کی امید رکھی تو اس کے پچھلے سب گناہ بخش دیئے جائیں گے  اور جو شخص رمضان کے مہینے میں پورے عقیدے سے روزہ رکھے گا ، اور اللہ سے اجر کی امید میں ، تو اس کے سارے پچھلے گناہ بخش دیئے جائیں گے۔ ", " Sahih al-Bukhari 1901,Narrated Abu Huraira RA", (long) 0),
            new Model("مَنْ لَمْ يَدَعْ قَوْلَ الزُّورِ وَالْعَمَلَ بِهِ فَلَيْسَ لِلَّهِ حَاجَةٌ فِي أَنْ يَدَعَ طَعَامَهُ وَشَرَابَهُ", "The Prophet (ﷺ) said, Whoever does not give up forged speech and evil actions, Allah is not in need of his leaving his food and drink (i.e. Allah will not accept his fasting.", "آپ صلی اللہ علیہ وسلم نے فرمایا ، جو شخص جعلی تقریر اور برے کاموں سے باز نہیں آتا ہے ، اللہ اسے کھانا پینا چھوڑنے کا محتاج نہیں ہے (یعنی اللہ اس کا روزہ قبول نہیں کرے گا۔", "Sahih al-Bukhari 1903,Narrated Abu Huraira RA", (long) 0),
            new Model("نَّ النَّبِيَّ صلى الله عليه وسلم بَعَثَ رَجُلاً يُنَادِي فِي النَّاسِ، يَوْمَ عَاشُورَاءَ  أَنْ مَنْ أَكَلَ فَلْيُتِمَّ أَوْ فَلْيَصُمْ، وَمَنْ لَمْ يَأْكُلْ فَلاَ يَأْكُلْ ", "Once the Prophet (ﷺ) ordered a person on 'Ashura' (the tenth of Muharram) to announce, Whoever has eaten, should not eat any more, but fast, and who has not eaten should not eat, but complete his fast (till the end of the day", "ایک بار رسول اللہ (صلی اللہ علیہ وآلہ وسلم) نے عاشورہ پر (محرم کی دسویں) ایک شخص کو حکم دیا کہ ، جس نے کھایا ہے اسے مزید کھانا نہیں کھانا چاہئے ، لیکن روزہ رکھنا چاہئے ، اور جس نے نہیں کھایا ہے اسے نہیں کھانا چاہئے ، بلکہ اس کا روزہ مکمل کرنا چاہئے ( دن کے اختتام تک", "Sahih al-Bukhari 1924,Narrated Salama bin Al-Akwa", (long) 0),

    };

    public static final Model[] RAMADAN_SUPPLICATION = {
            new Model("روزہ رکھنے کی نیت", "Dua of Sehri", "وَبِصَوْمِ غَدٍ نَّوَيْتُ مِنْ شَهْرِ رَمَضَانَ", "اورمیں نے ماہ رمضان کے کل کے روزے کی نیت کی.", "I Intend to keep the fast for month of Ramadan.", "(Abu Dawud)"),
            new Model("روزہ افطار کرنے کے بعد کی دعا", "Dua for Iftar", "اَللّٰهُمَّ اِنِّی لَکَ صُمْتُ وَبِکَ اٰمَنْتُ وَعَلَيْکَ تَوَکَّلْتُ وَعَلٰی رِزْقِکَ اَفْطَرْتُ", "اے اللہ!میں نے تیری خاطر روزہ رکھا اور تیرے اوپر ایمان لایا اور تجھ پر بھروسہ کیا اورتیرے رزق سے اسے کھول رہا ہوں۔", "O Allah! I fasted for you and I believe in you and I put my trust in You and I break my fast with your sustenance.", "(Abu Dawud)"),
    };

    public static final Model[] RAMADAN_TRAWEEH_VIRTUE = {
            new Model("َمن قام رمضان إيمانًا واحتسابًا غفر له ما تقدم من ذنبه", "The Messenger of Allah (ﷺ) said, He who observes optional prayer (Tarawih prayers) throughout Ramadan, out of sincerity of Faith and in the hope of earning reward will have his past sins pardoned", "اللہ کے رسول صلی اللہ علیہ وسلم نے فرمایا ، جو شخص پورے اخلاص اور عقیدے کی امید سے پورے رمضان میں اختیاری نماز (تراویح کی نماز) پڑھتا ہے اس کے پچھلے گناہوں کو معاف کردیا جائے گا", "Riyad as-Salihin 1187,Abu Hurairah", (long) 0.0),
            new Model("حَدَّثَنَا هَنَّادُ بْنُ السَّرِيِّ، حَدَّثَنَا عَبْدَةُ، عَنْ مُحَمَّدِ بْنِ عَمْرٍو، عَنْ مُحَمَّدِ بْنِ إِبْرَاهِيمَ، عَنْ أَبِي سَلَمَةَ بْنِ عَبْدِ الرَّحْمَنِ، عَنْ عَائِشَةَ، قَالَتْ كَانَ النَّاسُ يُصَلُّونَ فِي الْمَسْجِدِ فِي رَمَضَانَ أَوْزَاعًا فَأَمَرَنِي رَسُولُ اللَّهِ صلى الله عليه وسلم فَضَرَبْتُ لَهُ حَصِيرًا فَصَلَّى عَلَيْهِ بِهَذِهِ الْقِصَّةِ قَالَتْ فِيهِ قَالَ - تَعْنِي النَّبِيَّ صلى الله عليه وسلم -  أَيُّهَا النَّاسُ أَمَا وَاللَّهِ مَا بِتُّ لَيْلَتِي هَذِهِ بِحَمْدِ اللَّهِ غَافِلاً وَلاَ خَفِيَ عَلَىَّ مَكَانُكُمَْ", "The people used to pray (tarawih prayer) in the mosque during Ramadan severally. The Messenger of Allah (ﷺ) commanded me (to spread a mat). I spread a mat for him and he prayed upon it. The narrator then transmitted the same story. The Prophet (ﷺ) said: O People, praise be to Allah, I did not pass my night carelessly, nor did your position remain hidden from me.", "لوگ رمضان المبارک میں متعدد نماز مسجد میں پڑھتے تھے۔ اللہ کے رسول نے مجھے حکم دیا (چٹائی پھیلائیں)۔ میں نے اس کے لئے چٹائی پھیلائی اور اس نے اس پر دعا کی۔ راوی نے پھر اسی کہانی کو نشر کیا۔ آپ صلی اللہ علیہ وسلم نے ارشاد فرمایا: اے لوگو ، اللہ کی حمد ہو ، میں نے اپنی رات کو لاپرواہی سے نہیں گزرا ، اور نہ ہی آپ کا مقام مجھ سے پوشیدہ رہا۔", "Sunan Abi Dawud 1374,Narrated 'Aishah RA", (long) 0.0),
            new Model("حَدَّثَنِي مُوسَى بْنُ إِسْمَاعِيلَ، حَدَّثَنَا حَمَّادٌ، عَنْ سِمَاكِ بْنِ حَرْبٍ، عَنْ عِكْرِمَةَ، أَنَّهُمْ شَكُّوا فِي هِلاَلِ رَمَضَانَ مَرَّةً فَأَرَادُوا أَنْ لاَ يَقُومُوا وَلاَ يَصُومُوا فَجَاءَ أَعْرَابِيٌّ مِنَ الْحَرَّةِ فَشَهِدَ أَنَّهُ رَأَى الْهِلاَلَ فَأُتِيَ بِهِ النَّبِيُّ صلى الله عليه وسلم فَقَالَ  أَتَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَنِّي رَسُولُ اللَّهِ  قَالَ نَعَمْ  وَشَهِدَ أَنَّهُ رَأَى الْهِلاَلَ فَأَمَرَ بِلاَلاً فَنَادَى فِي النَّاسِ أَنْ يَقُومُوا وَأَنْ يَصُومُوا  قَالَ أَبُو دَاوُدَ رَوَاهُ جَمَاعَةٌ عَنْ سِمَاكٍ عَنْ عِكْرِمَةَ مُرْسَلاً وَلَمْ يَذْكُرِ الْقِيَامَ أَحَدٌ إِلاَّ حَمَّادُ بْنُ سَلَمَةَ َ", "Once the people doubted the appearance of the moon of Ramadan, and intended neither to offer the tarawih prayer nor to keep fast. A bedouin came from al-Harrah and testified that he had sighted the moon. He was brought to the Prophet (ﷺ). He asked: Do you testify that there is no god but Allah, and that I am the Messenger of Allah? He said: Yes; and he testified that he had sighted the moon. He commanded Bilal who announced to the people to offer the tarawih prayer and to keep fast", "ایک بار جب لوگوں نے رمضان المبارک کے چاند کی ظاہری شکل پر شکوہ کیا ، اور نہ تو نماز تراویح ادا کرنے اور نہ ہی روزہ رکھنے کا ارادہ کیا۔ الحرہ سے ایک بیڈوین آئی اور اس نے گواہی دی کہ اس نے چاند کو دیکھا ہے۔ آپ صلی اللہ علیہ وسلم کے پاس لائے گئے۔ اس نے پوچھا: کیا آپ گواہی دیتے ہیں کہ اللہ کے سوا کوئی معبود نہیں ، اور میں اللہ کا رسول ہوں؟ اس نے کہا: ہاں؛ اور اس نے گواہی دی کہ اس نے چاند کو دیکھا ہے۔ انہوں نے بلال کو حکم دیا جس نے لوگوں سے نماز تراویح پڑھنے اور روزہ رکھنے کا اعلان کیا", "Sunan Abi Dawud 2341,Narrated Ikrimah", (long) 0.0),
            new Model("حَدَّثَنَا الْقَعْنَبِيُّ، عَنْ مَالِكِ بْنِ أَنَسٍ، عَنِ ابْنِ شِهَابٍ، عَنْ عُرْوَةَ بْنِ الزُّبَيْرِ، عَنْ عَائِشَةَ، زَوْجِ النَّبِيِّ صلى الله عليه وسلم أَنَّ النَّبِيَّ صلى الله عليه وسلم صَلَّى فِي الْمَسْجِدِ فَصَلَّى بِصَلاَتِهِ نَاسٌ ثُمَّ صَلَّى مِنَ الْقَابِلَةِ فَكَثُرَ النَّاسُ ثُمَّ اجْتَمَعُوا مِنَ اللَّيْلَةِ الثَّالِثَةِ فَلَمْ يَخْرُجْ إِلَيْهِمْ رَسُولُ اللَّهِ صلى الله عليه وسلم فَلَمَّا أَصْبَحَ قَالَ  قَدْ رَأَيْتُ الَّذِي صَنَعْتُمْ فَلَمْ يَمْنَعْنِي مِنَ الْخُرُوجِ إِلَيْكُمْ إِلاَّ أَنِّي خَشِيتُ أَنْ يُفْرَضَ عَلَيْكُمْ  وَذَلِكَ فِي رَمَضَانَ َ", "That the Prophet (ﷺ) once offered (tarawih) prayer in the mosque and the people also prayed along with him. He then prayed on the following night, and the people gathered in large numbers. They gathered on the third night too, but the Messenger of Allah (ﷺ) did not come out to them. When the morning came, he said: I witnessed what you did, and nothing prevented me from coming out to you except that I feared that this (prayer) might be prescribed to you. That was in Ramadan", "کہ رسول اللہ (صلی اللہ علیہ وآلہ وسلم) نے ایک بار مسجد میں نماز تراویح ادا کی اور لوگوں نے بھی ان کے ساتھ نماز پڑھی۔ اس کے بعد اس نے اگلی ہی رات دعا کی ، اور لوگ بڑی تعداد میں جمع ہوگئے۔ وہ تیسری رات کو بھی جمع ہوگئے ، لیکن رسول اللہ. ان کے پاس نہیں آئے۔ جب صبح ہوئی ، تو اس نے کہا: میں نے آپ کے کاموں کا مشاہدہ کیا ، اور مجھے آپ کے پاس آنے سے کسی چیز نے روکنے کے سوا سوچا کہ مجھے اندیشہ ہے کہ یہ دعا آپ کے لئے مقرر کردی جائے۔ وہ رمضان میں تھا", "Sunan Abi Dawud 1373,Narrated 'Aishah RA, wife of Prophet (ﷺ)", (long) 0.0),
            new Model("حَدَّثَنَا إِسْحَاقُ، أَخْبَرَنَا عَفَّانُ، حَدَّثَنَا وُهَيْبٌ، حَدَّثَنَا مُوسَى بْنُ عُقْبَةَ، سَمِعْتُ أَبَا النَّضْرِ، يُحَدِّثُ عَنْ بُسْرِ بْنِ سَعِيدٍ، عَنْ زَيْدِ بْنِ ثَابِتٍ، أَنَّ النَّبِيَّ صلى الله عليه وسلم اتَّخَذَ حُجْرَةً فِي الْمَسْجِدِ مِنْ حَصِيرٍ، فَصَلَّى رَسُولُ اللَّهِ صلى الله عليه وسلم فِيهَا لَيَالِيَ، حَتَّى اجْتَمَعَ إِلَيْهِ نَاسٌ، ثُمَّ فَقَدُوا صَوْتَهُ لَيْلَةً فَظَنُّوا أَنَّهُ قَدْ نَامَ، فَجَعَلَ بَعْضُهُمْ يَتَنَحْنَحُ لِيَخْرُجَ إِلَيْهِمْ فَقَالَ  مَا زَالَ بِكُمُ الَّذِي رَأَيْتُ مِنْ صَنِيعِكُمْ، حَتَّى خَشِيتُ أَنْ يُكْتَبَ عَلَيْكُمْ، وَلَوْ كُتِبَ عَلَيْكُمْ مَا قُمْتُمْ بِهِ فَصَلُّوا أَيُّهَا النَّاسُ فِي بُيُوتِكُمْ، فَإِنَّ أَفْضَلَ صَلاَةِ الْمَرْءِ فِي بَيْتِهِ، إِلاَّ الصَّلاَةَ الْمَكْتُوبَةَ َ", "The Prophet (ﷺ) took a room made of date palm leaves mats in the mosque. Allah's Messenger (ﷺ) prayed in it for a few nights till the people gathered (to pray the night prayer (Tarawih) (behind him.) Then on the 4th night the people did not hear his voice and they thought he had slept, so some of them started humming in order that he might come out. The Prophet (ﷺ) then said, You continued doing what I saw you doing till I was afraid that this (Tarawih prayer) might be enjoined on you, and if it were enjoined on you, you would not continue performing it. Therefore, O people! Perform your prayers at your homes, for the best prayer of a person is what is performed at his home except the compulsory congregational) prayer. (See Hadith No. 229,Vol. 3) (See Hadith No. 134, Vol. 8)", "نبی صلی اللہ علیہ وسلم نے مسجد میں کھجور کے پتوں سے بنا ہوا کمرہ لیا۔ اللہ کے رسول صلی اللہ علیہ وسلم نے اس میں کچھ راتوں تک نماز ادا کی یہاں تک کہ لوگ جمع ہوگئے (رات کی نماز (تراویح) اس کے پیچھے پڑھیں) پھر چوتھی رات کو لوگوں نے اس کی آواز نہ سنی اور انہوں نے سوچا کہ وہ سو گیا ہے ، ان میں سے بعض نے یہ سمجھنا شروع کیا کہ وہ باہر آجائے ، رسول اللہ ﷺ نے پھر فرمایا کہ تم وہ کرتے رہے جو میں نے تم کو کرتے دیکھا جب تک کہ مجھے ڈر نہ لگے کہ اس (تراویح کی نماز) کا حکم آپ پر پڑا ہے ، اور اگر یہ ہوتا آپ پر حکم دیا گیا ہے ، آپ یہ کام جاری نہیں رکھیں گے۔ لہذا ، اے لوگو ، نماز اپنے گھروں پر ادا کرو ، کیونکہ کسی شخص کی بہترین نماز وہ ہے جو اس کے گھر پر لازمی اجتماعی نماز کے سوا ادا کی جاتی ہے۔  (حدیث نمبر 229 ، جلد 3) (دیکھیں حدیث نمبر 134 ، جلد 8)", "Sahih al-Bukhari 7290,Narrated Zaid bin Thabit", (long) 0.0),
    };

    public static final Model[] RAMADAN_TRAWEEH_PROCEDURE = {
            new Model("فیصلہ کریں کہ آپ کتنی رکعت نماز پڑھ رہے ہیں","Decide how many rak'ah you are going to prayerَ", "A rak'ah is a unit of prayer. It's up to you how many raka'h you would like to pray; some people eleven, thirteen, or even twenty rak'ah. As long as you pray your rak'ah two by two, and conclude it with the Witr prayer, this is following the sunnah.", "ایک رکعت نماز کی اکائی ہے۔ یہ آپ پر منحصر ہے کہ آپ کتنی رکعت نماز پڑھنا چاہیں گے۔ کچھ لوگ گیارہ ، تیرہ ، یا اس سے بھی بیس رکعت۔ جب تک کہ آپ اپنی رکعت دو دو نماز پڑھتے ہو ، اور اسے وتر کی نماز کے ساتھ ختم کرتے ہو ، یہ سنت کی پیروی کر رہا ہے", (long) 0.0),
            new Model("قبلہ کا سامنا کریں","Face the Qibla", "this is the direction all Muslims face to turn in prayer towards the Holy Ka'bah. The Holy Mosque in Mecca is the most revered place of worship for Muslims around the entire world. All Muslims are required to face the Ka'bah five times every day when offering their prayers", "یہی رخ وہی سمت ہے جس کو تمام مسلمان نماز کعبہ کی طرف رخ کریں۔ مکہ مکرمہ میں پوری دنیا کے مسلمانوں کے لئے سب سے مشہور عبادت گاہ ہے۔ تمام مسلمانوں کو نماز پڑھتے وقت ہر دن پانچ بار کعبہ کا سامنا کرنا پڑتا ہے",(long) 0.0),
            new Model("تراویح کی نیت کرىں","Make the intention of Taraweeh", "You do not need to pronounce it vocally, but have the intention in your mind that you are praying Taraweeh.", "آپ کو اس کو زبانی طور پر تلفظ کرنے کی ضرورت نہیں ہے ، لیکن آپ کے دماغ میں یہ ارادہ ہے کہ آپ تراویح کی نماز پڑھ رہے ہیں۔",(long) 0.0),
            new Model("اپنے کانوں تک ہاتھ اٹھائیں اور اللہ اکبر کہیں","Raise your hands up to your ears and say Allahu Akbar", "This translates to Allah is the greatest.If you cannot stand up for medical reasons, you are allowed to sit down.There is an alternative opinion that the hands should be raised to the shoulders. Both ways are valid", "اس کا مطلب ہے کہ اللہ سب سے بڑا ہے۔ اگر آپ طبی وجوہات کی بنا پر کھڑے نہیں ہوسکتے ہیں تو آپ کو بیٹھنے کی اجازت ہے۔ ایک متبادل رائے ہے کہ ہاتھ کندھوں تک اٹھائے جائیں۔ دونوں طریقے درست ہیں",(long) 0.0),
            new Model("افتتاحی دعا کی تلاوت کریں","Recite the Opening Prayer", "This is the opening dua. It is subhanakal-lahumma, wabihamdika watabarakas-muka wataala, judduka wala ilaha ghayruk. Then say, a’auodu billaahi minash-shaytaanir rajeem, bis-millaahir rahmaanir raheem", "یہ افتتاحی دعا ہے۔ یہ ہے سُبْحَانَكَ اللَّهُمَّ وَبِحَمْدِكَ وَتَبَارَكَ اسْمُكَ وَتَعَالَى جَدُّكَ وَلاَ إِلَهَ غَيْرُكَ", (long) 0.0),
            new Model("سورہ فاتحہ کی تلاوت کریں","Recite Surah Fatiha", "This is a key component of the prayer. It must be recited in  two rak'ahs of Taraweeh. It is Alhamdu lillahi rabbi 'aalameen; Ar-rahmanir raheem; Maaliki yawmid deen; Iyyaka na'budu wa-iyyaaka nasta'eeen; Ihdinas siraatal mustaqeem; Siraatal latheena an'aamta 'alayhim; Ghayril maghdoobi 'alayhim walad dhaalleen.", "یہ نماز کا ایک اہم جز ہے۔ تراویح کی ہر دو رکعت میں اسے ضرور پڑھنا چاہئے اَلْحَمْدُ لِلّٰهِ رَبِّ الْعٰلَمِیْنَۙ(۱) الرَّحْمٰنِ الرَّحِیْمِۙ(۲) مٰلِكِ یَوْمِ الدِّیْنِؕ(۳) اِیَّاكَ نَعْبُدُ وَ اِیَّاكَ نَسْتَعِیْنُؕ(۴) اِهْدِنَا الصِّرَاطَ الْمُسْتَقِیْمَۙ(۵) صِرَاطَ الَّذِیْنَ اَنْعَمْتَ عَلَیْهِمْ ﴰ غَیْرِ الْمَغْضُوْبِ عَلَیْهِمْ وَ لَا الضَّآلِّیْنَ۠(۷",(long) 0.0),
            new Model(" کسی بھی سورہ کی تلاوت کریں","Recite any other surahَ", " It is encouraged for someone who has memorized the Qur'an to make each rak'ah lengthy by reciting a long surah. However, if you do not know that many surahs, you can recite the ones that you know, as long as you recite them in the correct order.", "اس کے لئے یہ حوصلہ افزائی کی جاتی ہے کہ جس نے قرآن حفظ کیا ہے وہ ایک طویل سورت کی تلاوت کرکے ہر رکعت کو لمبا بنائے۔ تاہم ، اگر آپ یہ نہیں جانتے ہیں کہ بہت سورتیں ، آپ جب تک ان کو صحیح ترتیب سے تلاوت کرتے ہیں ، آپ ان کو سنا سکتے ہیں جو آپ جانتے ہو۔",(long) 0.0),
            new Model("اللہ اکبر کہو اور نیچے جھک جاؤ","َSay Allahu Akbar and bend down", "This is the ruku' position. Try to make your back as straight as possible, and relax your body. Your body does not need to be a perfect 90-degree angle.While bowing, say, Subhanna Rabbiyal Adheem three times. This means Glorious is my Lord, the most great", "یہ رکوع کا مقام ہے۔ اپنی کمر کو ہر ممکن حد تک سیدھے کرنے کی کوشش کریں ، اور اپنے جسم کو آرام دیں۔ آپ کے جسم کو مناسب 90 ڈگری کا زاویہ بننے کی ضرورت نہیں ہے۔ جب رکوع کرتے ہو  کہتے ہیں کہ سُبْحَانَ رَبِّيَ الْعَظِيمِ تین بار۔ اس کا مطلب یہ ہے کہ میرا رب سب سے بڑا ہے",(long) 0.0),
            new Model("رکوع سے اٹھ کھڑے ہوں","Raise from rukuَ", "While rising up, recite Sami-allah Huliman Hamidah . This means Allah hears those who praise Him While standing up, recite Rabana Walakal Hamd (Our Lord, all praise is for you) ", "اٹھتے ہوے سَمِعَ اللَّهُ لِمَنْ حَمِدَهُ کی تلاوت کرو۔ اس کا مطلب ہے کہ اللہ ان لوگوں کو سنتا ہے جو اس کی تعریف کرتے ہیں جب کھڑے ہوتے ہیں تو ، رَبَّنـا وَلَكَ الحَمْـدُ  (ہمارے پروردگار ، تمام تعریفیں تمہارے لئے ہیں) کا ورد کریں۔",(long) 0.0),
            new Model("اللہ اکبر کہو اور سجدہ کرو","َSay Allahu Akbar and prostrate", "This is the sajdah position. Place your head, knees and hands on the floor.When you are positioned fully, say Subhanna Rabbiyal A'laa (Glorious is my Lord, the most High) three times.", "یہ سجدہ کی پوزیشن ہے۔ اپنا سر ، گھٹنوں اور ہاتھوں کو فرش پر رکھیں۔ جب آپ پوری طرح سے پوزیشن میں ہوں تو ،تینوں مرتبہ سُبْحَانَ رَبِّيَ الأَعْلَى ( میرے رب ، سب سے اعلی ہیں)  کہنا ہے",(long) 0.0),
            new Model("سجدہ سے اٹھو اور گھٹنوں کے بل بیٹھو","Rise from sajdah and sit on your kneesَ", "Place your left foot from ball to heel on the floor. Your right foot should be toes on the floor only. Place your hands flat on your thigh.Return to sajdah and say Subhanna Rabbiyal a'laa three times", "اپنے بائیں پاؤں کو ہیل تک فرش پر رکھیں۔ آپ کے دائیں پیر کی انگلی صرف فرش پر ہونی چاہئے۔ اپنے ہاتھوں کو اپنی ران پر فلیٹ رکھیں۔ دوبارا سجدہ کرنے کا راستہ اختیار کریں اور تین بار  سُبْحَانَ رَبِّيَ الأَعْلَى کہیں۔",(long) 0.0),
            new Model("اللہ اکبر کہہ کر کھڑے ہو جاؤ","َSay Allahu Akbar and stand up", "You have completed one rak'ah and you will need to complete another rak'ah in the exact same way.", "آپ نے ایک رکعت مکمل کرلی ہے اور آپ کو اسی طرح دوسری رکعت مکمل کرنے کی ضرورت ہوگی۔",(long) 0.0),
            new Model("دوسری رکعت میں دوسرے سجدہ کے بعد بیٹھے رہیں","َAfter the second sajdah in the second rak'ah, stay sitting", "You need to recite certain du'as in this sitting position.At-tahiyyaatu Lillaahi wa-salaawaatu wa-tayyibaat. As-salaamu ‘alayka ayyuha-Nabiyyu wa rahmatullaahi wa barakaatuhu. As-salaamu ‘alayna wa ‘ala ‘ibaad-illaah-is-saaliheen. Ash-hadu al-aa ilaaha ill-Allaah wa ash-hadu anna Muhammadan ‘abduhu wa rasooluhu,Durood: Allaahumma salli ‘ala Muhammad, wa ‘ala aali Muhammad, kama salayta ‘ala Ibraaheem, wa ‘ala aali Ibraaheem, innaka hameedun majeed. Allaahumma baarik ‘ala Muhammad, wa ‘ala aali Muhammad, kama baarakta ‘ala Ibraaheem, wa ‘ala aali Ibraaheem, innak hameedun majeed", "پ کو اس نشست میں کچھ دعائیں پڑھنے کی ضرورت ہے التَّحِيَّاتُ لِلَّهِ وَالصَّلَوَاتُ وَالطَّيِّبَاتُ، السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ، السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ، أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ,  اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍكَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ .إِنَّكَ حَمِيدٌ مَجِيدٌ للَّهُمَّ بَارِكْ عَلَى مُحَمَّدٍ، وَعَلَى آلِ مُحَمَّدٍ كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ",(long) 0.0),
            new Model("نماز تسلیم کے ساتھ ختم کرو","Finish the prayer with tasleemَ", "Turn your head to the right, and then the life, while saying 'As-salamu alaykum wa Rahmatullah", "اس السلام علیکم و رحمت اللہ کہتے ہوئے اپنے سر کو دائیں اور بائیں طرف مڑیں۔",(long) 0.0),
            new Model("وتر کی نماز کے ساتھ تراویح کا اختتام کریں","Conclude the Taraweeh with the Witr prayer", "When you've prayed your two-by-two rak'ahs, you need to round it all off by praying an odd number of Witr rak'ahs. Most commonly, people pray  three rak'ah Witr. ", "جب آپ اپنی دو دو رکعت نماز پڑھتے ہیں تو آپ کو وتر رکعت نماز پڑھ کر دور کرنے کی ضرورت ہوتی ہے۔ عام طور پر ، لوگ تین رکعت وتر پڑھتے ہیں",(long) 0.0),
    };


    public static final Model[] FAST_KEEPING_PROCEDURE = {
            new Model("Ramadan also spelled Ramazan, Ramzan, is the ninth month of the Islamic calendar observed by Muslims worldwide as a month of fasting (sawm), prayer, reflection, and community.", "رمضان المبارک اسلامی کیلنڈر کا نواں مہینہ ہے جو دنیا بھر کے مسلمان روزے کی نماز، غور و فکر اور برادری کے مہینے کے طور پر مشاہدہ کرتے ہیں۔"),
            new Model("During the entire month of Ramadan, Muslims are obligated to fast every day from dawn to sunset.", "رمضان کے پورے مہینے کے دوران ، مسلمان طلوع فجر سے غروب آفتاب تک ہر روز کے روزے رکھنے کا پابند ہیں۔"),
            new Model("Fasting from sunrise to sunset is fard (obligatory) for all adult Muslims who are not acutely or chronically ill, travelling, elderly, breastfeeding, diabetic, or menstruating.", "طلوع آفتاب سے غروب آفتاب تک روزہ رکھنا (واجب) ان تمام بالغ مسلمانوں کے لئے ہے جو شدید یا دائمی طور پر بیمار ، سفر ، بوڑھوں ، دودھ پلانے ، ذیابیطس ، یا حیض کی حالت میں نہیں ہیں۔"),
            new Model("Fasting during Ramadan means abstinence from all food or drink, including water and chewing gum, from dawn to sunset.", "رمضان میں روزے رکھنے کا مطلب ہے صبح سے غروب آفتاب تک پانی اور کھانے سمیت تمام کھانے پینے سے پرہیز کرنا۔"),
            new Model("It is recommended that before sunrise, Muslims eat a prefast meal known as suhur. This meal often resembles breakfast, but in some cultures it may include more dinner-like foods. ", "یہ تجویز کیا جاتا ہے کہ طلوع آفتاب سے پہلے مسلمان پہلے سے تیز کھانا کھاتے ہیں جسے سحور کہتے ہیں۔ یہ کھانا اکثر ناشتہ سے مشابہت رکھتا ہے ، لیکن کچھ ثقافتوں میں اس میں رات کے کھانے کی طرح کھانے کی چیزیں شامل ہوسکتی ہیں۔"),
            new Model("After sunset, Muslims break their fast with iftar, a meal which usually starts with dates and water or milk, followed by dinner.", "غروب آفتاب کے بعد مسلمان افطار کے ساتھ ختم کرتے ہیں ، ایسا کھانا جو عام طور پر کھجور اور پانی یا دودھ سے شروع ہوتا ہے ، اس کے بعد رات کا کھاناـ"),
            new Model("After Ramadan, Muslims celebrate a three-day holiday called Eid-ul-Fitr. After this Eid (\"celebration\"), Muslims pray the holiday prayer in congregation in the morning, visit family and friends, and celebrate over food, gifts and activities for children.", "رمضان کے بعد ، مسلمان عیدالفطر کے نام سے تین روزہ تعطیل مناتے ہیں۔ اس عید (\"جشن\") کے بعد ، مسلمان صبح کے وقت باجماعت نماز عیدالفطر ادا کرتے ہیں ، کنبہ اور دوستوں سے ملتے ہیں ، اور بچوں کے لئے کھانے ، تحائف اور سرگرمیوں پر جشن مناتے ہیں"),
    };


    /*Add All Hajj Steps in Urdu And English*/
    public static final Model[] HAJJ_HEADINGS = {
            new Model("Hajj Preparation", "حج تیاری", 'a'),
            new Model("Performing the Umrah Rituals", "عمرہ کے شرائط کو انجام دینا", 'a'),
            new Model("Reassume Ihram and the intention to perform Hajj", "احرام اور حج کرنے کا ارادہ دوبارہ کریں", 'a'),
            new Model("Travel to Mina", "مینا کا سفر", 'a'),
            new Model("Travel to Mt. Arafat to perform Wafuq", "ماؤنٹ کا سفر عرفات وفوق ادا کرنے کے لئے", 'a'),
            new Model("Offer Prayers in Muzadalifah", "مزدلفہ میں نماز پڑھو", 'a'),
            new Model("Perform Rami in Mina", "مینا میں رامی کرو", 'a'),
            new Model("Animal Sacrifice – Nahr", "جانوروں کی قربانی - نہر", 'a'),
            new Model("Halq (shaving the head) or Taqsir (clipping or shortening of the hair for men and women)", "ہلک (سر مونڈنا) یا تقویسیر (مردوں اور عورتوں کے لئے بالوں کو تراشنا یا چھوٹا کرنا)", 'a'),
            new Model(" Perform Tawaf and Sa’iy ", "طواف اور سعی کریں", 'a'),
            new Model("Repeat Stoning at Mina After Sunset On the 11th and 12TH day of Dhu al-Hijjah", "ذی الحجہ کے 11 ویں اور 12 ویں دن غروب آفتاب کے بعد مینا پر پتھراؤ کریں", 'a'),
            new Model(" Perform the Farewell Tawaf", "الوداعی طواف کریں", 'a'),
            new Model("Hajj Supplications", "حج کی دعایں", 'a'),

    };

    //Here Add Supplications Of Hajj
    public static final Model[] HAJJ_SUPPLICATION = {
            new Model("سفر کے لئے دعا", "Dua for travelling", "اللّٰهُ أَكْبَر\u200E اللّٰهُ أَكْبَر\u200E اللّٰهُ أَكْبَر\u200E.\n" +
                    "سُبْحَانَ الَّذِيْ سَخَّرَ لَنَا هَذَا وَمَا كُنَّا لَهُ مُقْرِنِيْنَ, وَإِنَّا إِلَى رَبِّنَا لَمُنْقَلِبُوْنَ, اللهُمَّ إِنَّا نَسْأَلُكَ فِيْ سَفَرِنَا هَذا البِرَّ وَالتَّقْوَى, وَمِنَ الْعَمَلِ مَا تَرْضَى, اللهُمَّ هَوِّنْ عَلَيْنَا سَفَرَنَا هَذَا, وَاطْوِ عَنَّا بُعْدَهُ, اللهُمَّ أنْتَ الصَّاحِبُ فِيْ السَّفَرِ وَالْخَلِيْفَةُ فَيْ الْأَهْلِ, اللهُمَّ إِنِّيْ أَعُوْذُ بِكَ مِنْ وَعْثَاءِ السَّفَرِ وَكَآبَةِ الْمَنْظَرِ\n" +
                    "وَسُوْءِ الْمُنْقَلِبِ فِيْ الْمَالِ وَالْأَهْلِ", "پاک ہے وہ جس نے اس کو ہمارے تابع کردیا ، کیونکہ ہم اسے پورا نہیں کرسکتے تھے ، اور واقعی ہم اپنے رب کی طرف لوٹ رہے ہیں۔ اے اللہ ہم آپ سے تقویٰ اور اللہ سے ڈرنے اور ان اعمال کی دعا مانگتے ہیں جن سے آپ ہمارے اس سفر پر راضی ہوجائیں گے۔ اے اللہ یہ سفر ہمارے لئے آسان فرمائے اور ہمارے لئے اس کا فاصلہ طے کرے۔ اے اللہ آپ سفر میں شریک اور خاندان میں نائب ہیں۔ اے اللہ میں سفر میں تکلیف اور غمگین نقطہ نظر سے ، اور میرے مال یا گھر والوں سے ہونے والی کسی برائی سے محفوظ رہتا ہوں۔", "Glory be to Him Who has subjugated this to us, for we could not have accomplished it, and truly to our Lord we are returning. O Allah, we ask You for piety and fear of Allah and deeds with which You will be pleased on this journey of ours. O Allah make this journey easy for us and fold up for us its distance. O Allah You are the Companion on the journey and the Deputy among the family. O Allah I seek Your protection from discomfort on the journey and from a gloomy outlook, and from any evil befalling my wealth or family", "Allāhu akbar Allāhu akbar Allāhu akbar.\n" +
                    "Subḥāna-lladhī sakhkhara lanā hādhā wa mā kunnā lahu muqrinīn wa innā ilā Rabbinā la-munqalibūn. Allāhumma innā nas’aluka safarinā hādha-l-birra wa-t-taqwā, wa mina-l-‘amali mā tarḍā. Allāhumma hawwin ‘alaynā safaranā hādhā, wa-ṭwi ‘annā bu’dah. Allāhumma Anta-ṣ-Ṣāhibu fi-s-safari wa-l-Khalīfatu fi-l-ahl. Allāhumma innī a’ūdhu bika min wa’thā’i-s-safar, wa ka’ābati-l-manẓari wa sū’i-l-munqalabi fi-l-māli wa-l-ahl\n"),
            new Model("عمرہ کرنے کا ارادہ", "Intention for performing umrah", "لَبَّيْكَ اللَّهُمَّ عُمْرَةً", "اے اللہ میں یہاں عمرہ کرنے والا ہوں", "O Allah, here I am to perform Umrah", "Labbayka llāhumma ‘umratan"),
            new Model("تلبیہ", "Talbiyah", "لَبَّيْكَ اللهُمَّ لَبَّيْكَ – لَبَّيْكَ لَا شَرِيْكَ لَكَ لَبَّيْكَ – إِنَّ الْحَمْدَ وَالنِّعْمَةَ لَكَ وَالْمُلْكَ – لَا شَرِيْكَ لَكَ –", "آپ کی خدمت میں ، اللہ ، آپ کی خدمت میں۔ آپ کی خدمت میں ، آپ کی خدمت میں آپ کا کوئی شریک نہیں ہے۔ واقعی تمام تعریفیں ، احسان اور خودمختاری آپ کی ہے۔ آپ کا کوئی شریک نہیں ہے", "At Your service, Allah, at Your service. At Your service, You have no partner, at Your service. Truly all praise, favour and sovereignty is Yours. You have no partner.", "Labbayka llāhumma labbayk(a), labbayka lā sharīka laka labbayk(a), inna l-ḥamda wa n-ni’mata, laka wa l-mulk(a), lā sharīka lak."),
            new Model("مکہ مکرمہ میں داخل ہونا", "Entering makkah", "َللَّهُمَّ هَذَا حَرَمُكَ وَأَمْنُكَ فَحَرِّمْنِي عَلَى النَّارِ، وَأَمِنِّي مِنْ عَذَابِكَ يَوْمَ تَبْعَثُ عِبَادَكَ، وَاجْعَلْنِي مِنْ أَوْلِيَائِكَ وَأَهْلِ طَاعَتِكَ", " اللہ ، یہ تمہارا حرم و سلامت ہے ، لہذا مجھے جہنم کے حرام قرار دے ، جس دن تم اپنے بندوں کو زندہ کرو گے اس دن مجھے اپنے عذاب سے بچا۔ اور مجھے اپنا ایک دوست اور ان لوگوں میں سے ایک بنائیں جو آپ کی اطاعت کرتے ہیں", "Allah, this is Your sanctuary and security, so make me unlawful to Hell-Fire, make me safe from Your punishment on the day You resurrect Your servants; and make me one of Your friends and one of the people who obey You", "Allāhumma hādhā ḥaramuka wa amnuka fa ḥarrimnī ‘ala-n-Nār, wa amminnī min ‘adhābika yawma tab’athu ‘ibādak, wa j‘alnī min awliyā’ika wa ahli ṭā’atik."),
            new Model("مسجد الحرام میں داخل ہونا", "Entering Masjid al-Haram", ".بِسْمِ اللهِ، اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ. اللَّهُمَّ اغْفِرْ لِي وَافْتَحْ لِي أَبْوَابَ رَحْمَتِك", "اللہ کے نام پر ، محمد صلی اللہ علیہ وسلم پر درود بھیجیں۔ اے اللہ میرے لئے اپنے فضل کے دروازے کھول دے", "In the name of Allah, send blessings upon Muhammad ﷺ. O Allah, open for me the doors of Your Bounty", "Bismi-llāh, Allāhumma ṣalli alā Muhammad. Allāhumma-ghfir lī wa-ftaḥ lī abwāba raḥmatik."),
            new Model("کعبہ کی پہلی نگاہ", "First Sight of kaaba", ".اللّٰهُ أَكْبَرُ. اللّٰهُ أَكْبَرُ . لَآ اِلَهَ اِلَّا اللّٰهُ", "الله سب سے بڑا ہے. الله سب سے بڑا ہے. اللہ کے سوا کوئی معبود نہیں", "Allah is the Greatest. Allah is the Greatest. There is no God except Allah", "Allāhu akbar. Allāhu akbar. Lā ilāha illa-llāh"),
            new Model("کالے پتھر پر تلاوت", "Recite at Black stone", "اللهُ أكْبَر", "اللہ سبحانہ وتعالی ہے", "Allah is the Most Great", "Allaahu 'Akbar"),
            new Model("یامنی کونے اور سیاہ پتھر کے درمیان", "Between the yammani corner and black stone", "رَبَّنَا آتِنَا في الدُّنْيَا حسَنَةً وفي الآخِرَةِ حسَنةً وقِنَا عذَابَ النَّارِ", "اے ہمارے رب ہمیں اس دنیا میں بہترین اور اگلی زندگی میں بہترین عطا فرما اور ہمیں دوزخ کے عذاب سے بچائے۔", "O our Lord, grant us the best in this life and the best in the next life, and protect us from the punishment of the Fire", "rabbanaa aatinaa fiddunyaa ḥasanatan wa fil aakhirati ḥasanatan wa qinaa ‛adhaab-an-naar"),
            new Model("زمزم پیتے وقت تلاوت کریں", "Recite while drinking zamzam", "اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمَاً نَافِعَاًً وَرِزْقَاً وَاسِعَاًَ وَشِفَاءً مِنْ كُلِّ دَاءٍ", "اے اللہ ، میں آپ سے ہر طرح کی بیماریوں سے فائدہ مند علم ، وسیع رزق اور علاج تلاش کرتا ہوں", "O Allah, I seek beneficial knowledge, wide sustenance and cure from all ailments from You", "Allaahumma inni as’aluka `ilman naifi`aaa, wa rizqaw wasi`aaa, wa shifa’am min kulli da’i"),
            new Model("سعی کے لئے دعائیں", "Dua for Saee", "إِنَّ الصَّفَا وَالْمَرْوَةَ مِن شَعَائِرِ اللَّهِ ۖ فَمَنْ حَجَّ الْبَيْتَ أَوِ اعْتَمَرَ فَلَا جُنَاحَ عَلَيْهِ أَن يَطَّوَّفَ بِهِمَا ۚ وَمَن تَطَوَّعَ خَيْرًا فَإِنَّ اللَّهَ شَاكِرٌ عَلِيمٌ\n" +
                    "أَبْدَأُ بِمَا بَدَأَ اللهُ بِهِ\n", "بے شک صفا اور مروہ اللہ کی علامتوں میں سے ہیں۔ تو جو شخص ایوان میں حج کرے یا عمرہ کرے - اس کے درمیان چلنے میں اس کا کوئی قصور نہیں ہے۔ اور جو رضاکار اچھے\n" +
                    "کام کرتا ہے تو بےشک اللہ شکر گزار اور جاننے والا ہے۔\n" +
                    "[سورہ البقرہ ، 2: 158]\n" +
                    "میں اس سے شروع کرتا ہوں جس کی ابتدا اللہ نے کی ہے\n", "Indeed, Safa and Marwa are among the symbols of Allah. So whoever makes Hajj to the House or performs Umrah – there is no blame upon him for walking between them. And whoever volunteers good – then indeed, Allah is appreciative and Knowing.\n" +
                    "[Surah al-Baqarah, 2:158]\n" +
                    "I begin with that which Allah has begun with\n", "Inna alssafa waalmarwata min shaAAairi Allahi faman hajja albayta awi iAAtamara fala junaha AAalayhi an yattawwafa bihima waman tatawwaAAa khayran fainna Allaha shakirun Aaaleemun\n" +
                    "Abda’u bimā bad’allahu bihi\n"),
            new Model("صفا میں دعا کرو", "Make Dua at Safa", "اَللّٰهُ أَكْبَرُ، اَللّٰهُ أَكْبَرُ، اَللّٰهُ أَكْبَرُ، وَلِلّٰهِ الْحَمْدُ", ": الله سب سے بڑا ہے؛ الله سب سے بڑا ہے؛ اللہ سب سے بڑا ہے ، اور سب تعریفیں اللہ ہی کی ہیں۔", "Allah is the greatest; Allah is the greatest; Allah is the greatest, and to Allah belongs all praise", "Allāhu akbar, Allāhu akbar, Allāhu akbar, wa lillāhi l-ḥamd."),
            new Model("حرم کو چھوڑ دو", "Leave the Haram", "بِسْمِ اللهِ وَالصَّلَاةُ وَالسَّلَّامُ عَلَى رَسُولِ اللهِ، اللَّهُمَّ إَنِّي أَسْأَلُكَ مِنْ فَضْلِكَ", "اللہ کے نام پر اور سلامتی ہو اور رسول اللہ صلی اللہ علیہ وآلہ وسلم۔ اے اللہ ، میں تم سے اپنے فضل سے پوچھتا ہوں", "In the name of Allah, and peace and blessings be upon the Messenger of Allah. O Allah, I ask of you from Your bounty.", "Bismi llāhi, wa ṣ-ṣalātu wa s-salāmu ‘ala rasūli llāh. Allāhumma innī as’aluka min faḍlik."),
            new Model("حج کے لئے نیت", "Niyyah for Hajj", "َبَّيْكَ اللَّهُمَّ حَجًّا", " اے اللہ میں یہاں حج کرنے والا ہوں", "O Allah, here I am to perform Hajj", "Labbayk Allahumma Hajj."),
            new Model("عید تکبیر", "Eid Takbeer: Takbeer E Tashreeq", "اللَّهُ أَكْبَرُ اللَّهُ أَكْبَرُ لَا إلَهَ إلَّا اللَّهُ. وَاَللَّهُ أَكْبَرُ اللَّهُ أَكْبَرُ وَلِلَّهِ الْحَمْدُ", "اللہ سب سے بڑا ہے ، اللہ سب سے بڑا ہے ، اللہ کے سوا کوئی معبود نہیں۔ اور اللہ سب سے بڑا ہے ، اللہ سب سے بڑا ہے اور سب تعریف اللہ ہی کی ہے۔", "Allah is the greatest, Allah is the greatest, there is no god but Allah. And Allah is the greatest, Allah is the greatest and to Allah belongs all praise.”", "Allahu akbar, Allahu akbar, La ilaha illallah, Wallahu akbar, Allahu akbar wa lillahil hamd"),

    };


    public static final Model[] HAJJ_AQDAMAT = {
            //preparation
            new Model("Hajj begins on the 8th day of Dhu al-Hijjah, when pilgrims make their intentions to undertake the pilgrimage by donning the Ihram garments.\n" +
                    "Before pilgrims wish to enter the Al Masjid Al Haram (the sacred boundary of Mecca) and move across to perform Hajj, they should wear Ihram in order to make haram and traverse the five different areas of Miqats in the Haram boundary\n", "ذی الحجہ کے 8 ویں دن سے حج کا آغاز ہوتا ہے ، جب حجاج احرام کا لباس عطیہ کرکے زیارت کرنے کا ارادہ کرتے ہیں۔\n" +
                    "اس سے پہلے کہ حجاج مسجد الحرام (مکہ کی مقدس حد) میں داخل ہوکر حج کی سعی کرنے کے لیے آگے بڑھیں ، انہیں احرام باندھنا چاہئے تاکہ حرم کی حدود میں مقوط کے پانچ مختلف علاقوں کو عبور کرلیں۔", 0),
            //PERFORMING THE UMRAH RITUALS
            new Model("Pilgrims intending to undertake Hajj al-Tamatt’u must combine Umrah rituals with that of Hajj", "حجاج کرام کو التہام’ حج کا ارادہ کرنا ہے اور انہیں عمرہ کی رسومات کو حج کے ساتھ جوڑنا ہوگا", 0),
            //Reassume Ihram and the intention to perform Hajj:
            new Model("After completing Umrah rituals, pilgrims must assume the state of Ihram and declare their intentions to do Hajj.\n" +
                    "Note: repeat step 1 of Hajj Preparation\n", "عمرہ کی رسومات کو مکمل کرنے کے بعد ، حجاج کرام کو لازمی طور پر احرام کی حالت سنبھالنی ہوگی اور حج کے ارادے کا اعلان کرنا ہوگا۔\n" +
                    "نوٹ: حج کی تیاری کا پہلا مرحلہ دہرانا", 0),
            //Travel to Mina:
            new Model("Soon after the observing the morning prayers, all pilgrims must head to Mina (a town in Mecca), where they stay an entire day carrying out ritual prayers – Duhr, Asr, Maghrib, Isha, Fajr and Qasr – as stated in the Quran.", "صبح کی نماز کے مشاہدہ کے فورا. بعد ، تمام عازمین کو مینا (مکہ کا ایک قصبہ) جانا ہوگا ، جہاں وہ پورا دن نماز کی ادائیگی - ظہر ، عصر ، مغرب ، عشاء ، فجر اور قصر کے ساتھ رہتے ہیں۔ جیسا کہ قرآن مجید میں بیان کیا گیا ہے۔", 0),
            //Travel to Mt. Arafat to perform Wafuq
            new Model("During the second day of Hajj, 9th day of Dhu-al-Hijjah, pilgrims travel to Arafat from Mina reciting Istaghfar and making supplications. Upon reaching Mount Arafat, pilgrims observe Duhr and Asr combined with Qasar prayers near the Jabal al-Rahmah from noon to sunset. This act is known as Waquf (standing before Allah).", "ذی الحجہ کے 9 ویں دن ، حج کے دوسرے دن کے دوران ، حجاج کرام عرفات تک مینا سے استغفر پڑھ رہے ہیں اور دعائیں مانگ رہے ہیں۔ عرفات پہاڑ پر پہنچنے پر ، حجاج کرام نماز ظہر اور عصر کو جمعہ رحیمہ کے قریب دوپہر سے غروب آفتاب تک مناتے ہیں۔ اس فعل کو وقف (اللہ کے سامنے کھڑا) کے نام سے جانا جاتا ہے۔", 0),
            //Offer Prayers in Muzadalifah
            new Model("Post sunset, pilgrims head to Muzadalifah (a town between Mina and Mt. Arafat) to observe the evening prayers and rest the night until Fajr prayers in preparation for the next day’s ritual of stoning the devil. Pilgrims pick up 49 pebbles of similar size for Rami.\n" +
                    "On the 10th day Dhu al-Hijjah, pilgrims leave for Mecca before sunset to do Tawaf al-Ifadah and Sa’iy and get back to Mina to perform Rami, Nahr and Halq.\n", "غروب آفتاب کے بعد ، حجاج کرام شام کے نماز پڑھنے اور شیطان پر سنگسار کرنے کے اگلے دن کی رسم کی تیاری میں فجر کی نماز تک آرام کرنے کے لئے مجدالیفہ (مینا اور ماؤنٹ عرفات کے درمیان ایک شہر) کے لئے روانہ ہوجاتے ہیں۔ حجاج کرام نے رامی کے لئے اسی طرح کے سائز کے 49 کنکر اٹھاتے ہیں۔\n" +
                    "دسویں دن ذی الحجہ کو حجاج طواف الاحداد اور سعی کرنے کے لئے غروب آفتاب سے پہلے مکہ مکرمہ روانہ ہوجاتے ہیں اور رامی ، نہر اورحلق ادا کرنے مینا واپس چلے جاتے ہیں۔", 0),
            //Perform Rami in Mina:
            new Model("On the 11th and 12th days of Hajj, pilgrims must complete the stoning of the Devil or Rami. Before Sunrise, pilgrims head back to Mina and participate in a ritual known as ‘Stoning the devil’. Seven pebbles (of similar sizes) are thrown at a stone structure known as Jamrat al-Aqabah. This is an act carried out at noon on each day. All pilgrims are required to leave for Mecca before sunset on the 12th day of Dhu al-Hijjah.", "حج کے 11 ویں اور 12 ویں دن ، عازمین کو طلوع آفتاب سے قبل شیطان پر پتھرائو مکمل کرنا ہوگا ، حجاج کرام مینا کی طرف روانہ ہوجائیں اور اس رسم میں شرکت کریں جو \"شیطان کو سنگسار کرنا\" کے نام سے جانا جاتا ہے۔ جمرات الا عقبہ کے نام سے جانے والے ایک پتھر کے ڈھانچے پر سات کنکر (اسی طرح کے سائز کے) پھینکے جاتے ہیں۔ یہ ایک ایسا عمل ہے جو ہر دن دوپہر کے وقت کیا جاتا ہے۔ تمام حاجیوں کو لازم ہے کہ وہ ذی الحجہ کے 12 ویں دن کو غروب آفتاب سے قبل مکہ روانہ ہوں۔", 0),
            //Animal Sacrifice – Nahr:
            new Model("The culmination of the stoning ceremony calls for an animal sacrifice. For this pilgrims can purchase sacrifice voucher or a coupon, which states that a sacrifice has been made in their name. the sacrificial animal is either a lamb or a camel. The animal is butchered and its meat is packed and shipped to other Middle Eastern countries or is fed to the poor.", "پتھراؤ کی تقریب کا خاتمہ جانوروں کی قربانی کا مطالبہ کرتا ہے۔ اس کے لئے زائرین قربانی کے واؤچر یا کوپن خرید سکتے ہیں ، جس میں کہا گیا ہے کہ ان کے نام پر قربانی دی گئی ہے۔ قربانی کا جانور  بھیڑ یا اونٹ ہے۔  اور اس کا گوشت بھری ہوئی ہے اور دوسرے مشرق وسطی کے ممالک میں بھیج دیا جاتا ہے یا غریبوں کو کھلایا جاتا ہے۔", 0),
            //Halq (shaving the head) or Taqsir (clipping or shortening of the hair for men and women
            new Model("Men should get their head completely shaved, or get their hair clipped. While women are forbidden to shave their heads and only allowed to have a lock or strand of their hair clipped. The act of cutting the hair symbolizes one’s detachment from physical appearances and complete subjection to Allah.", "مردوں کو اپنے سر کو مکمل طور پر منڈوا دینا چاہئے ، یا اپنے بالوں کو کٹانا چاہئے۔ جب کہ خواتین کو اپنے سر مونڈنے سے منع کیا گیا ہے اور انھیں صرف اپنے بالوں کا تالا یا بھوسے رکھنے کی اجازت ہے۔ بالوں کو کاٹنے کا عمل جسمانی نمودار ہونے اور اللہ کی مکمل تابع ہونے سے کسی کی لاتعلقی کی علامت ہے۔مردوں کو اپنے سر کو مکمل طور پر منڈوا دینا چاہئے ، یا اپنے بالوں کو کٹانا چاہئے۔ جب کہ خواتین کو اپنے سر مونڈنے سے منع کیا گیا ہے اور انھیں صرف اپنے بالوں کا تالا یا بھوسے رکھنے کی اجازت ہے۔ بالوں کو کاٹنے کا عمل جسمانی نمودار ہونے اور اللہ کی مکمل تابع ہونے سے کسی کی لاتعلقی کی علامت ہے۔", 0),
            //Perform Tawaf and Sa’iy
            new Model("Perform Tawaf and Sa’iy", "طواف اور سعی کریں", 0),
            //Repeat Stoning at Mina After Sunset On the 11th and 12TH day of Dhu al-Hijjah
            new Model("The stoning ritual is repeated by throwing pebbles at two other monuments other than Jamrat al Aqabah – Jamrat Oolah (the first Jamrat) and Jamrat Wustah (middle Jamrat). Pilgrims face the Jamarah (main pillar), with the Mecca on their left and Mina on their right, stone it with seven small pebbles while reciting takbeer.", "جمرات الا عقبہ  جمرات اولہ (پہلا جمرات) اور جمرات وستا (درمیانی جمرات) کے علاوہ دو دیگر یادگاروں پر بھی پتھر پھینک کر سنگسار کرنے کی رسم دہرائی گئی ہے۔ حجاج جمہرہ (مرکزی ستون) کا سامنا کرتے ہیں ، ان کی بائیں طرف مکہ اور دائیں طرف مینا ، تکبیر کی تلاوت کرتے ہوئے اسے سات چھوٹے کنکروں سے سنگسار کرتے ہیں۔", 0),
            //Perform the Farewell Tawaf
            new Model("The next and the final step is the farewell Tawaf, circumambulating the Kaaba anti-clockwise seven times and touching or kissing the Kaaba if possible. Pilgrims reflect on their experience and thank Allah for everything, while circumambulating the Kaaba.\n" +
                    "On completing the Tawaf, pilgrims can proceed to collect their belongings, leave Kaaba by setting their left foot out first and making supplications while doing so. This final step marks the end of Hajj rituals.\n", "اس کا اگلا اور آخری مرحلہ الوداع طواف ہے ، جو کعبہ کو گھڑی کی مخالف سمت سے سات بار گھومتا ہے اور اگر ممکن ہو تو کعبہ کو چھونے یا چومنا ہے۔ حجاج کرام اپنے تجربے پر غور کرتے ہیں اور کعبہ کا طواف کرتے ہوئے ہر چیز پر اللہ کا شکر ادا کرتے ہیں۔\n" +
                    "طواف مکمل کرنے پر ، حجاج کرام اپنا سامان جمع کرنے کے لئے آگے بڑھ سکتے ہیں ، کعبہ کو اپنے بائیں پاؤں کو پہلے باہر چھوڑ کر اور دعائیں مانگتے ہیں۔ یہ آخری اقدام حج کی رسومات کے خاتمے کی علامت ہے۔", 0),

    };

    public static final Model[] HIJRI_CALENDER = {
            new Model("Hijri Calender", "The Hijri calendar (Arabic: ٱلتَّقْوِيم ٱلْهِجْرِيّ\u200E at-taqwīm al-hijrīy), also known as the Lunar Hijri calendar and (in English) as the Islamic, Muslim or Arabic calendar, is a lunar calendar consisting of 12 lunar months in a year of 354 or 355 days. It is used to determine the proper days of Islamic holidays and rituals, such as the annual period of fasting and the proper time for the Hajj.The Islamic calendar employs the Hijri era whose epoch was established as the Islamic New Year of 622 CE.[1] During that year, Muhammad and his followers migrated from Mecca to Medina and established the first Muslim community (ummah), an event commemorated as the Hijra."),
    };
    public static final Model[] HIJRI_DAYS = {
            new Model("al-Ahad", "ٱلْأَحَد", "the One", "Sunday"),
            new Model("al-Ithnayn", "الاِثْنَيْن", "the Second", "Monday"),
            new Model("ath-Thulatha", "ٱلثُّلَاثَاء", "the Third", "Tuesday"),
            new Model("al-Arbiaʾ", "ٱلْأَرْبِعَاء", "the Fourth", "Wednesday"),
            new Model("al-Khamis", "ٱلْخَمِيس", "the Fifth", "Thursday"),
            new Model("al-Jummah", "ٱلْجُمْعَة", "the Gathering", "Friday"),
            new Model("as-Sabt", "ٱلسَّبْت", "the Seventh", "Saturday"),
    };

    public static final Model[] Hijri_Months = {
            new Model("al-Muharram", "ٱلْمُحَرَّم", "Forbidden", "A sacred month, so called because battle and all kinds of fighting are forbidden (Harām) during this month. Muharram includes Ashura, the tenth day."),
            new Model("Safar", "صَفَر", "Void", "Supposedly named this because pre-Islamic Arab houses were empty this time of year while their occupants gathered food."),
            new Model("Rabīʿ al-ʾAwwal", "رَبِيع ٱلْأَوَّل", "The first spring", "Also means to graze, because cattle were grazed during this month. Also a very holy month of celebration for many Muslims, as it was the month the Prophet Muhammad(SAW) was born."),
            new Model("Rabīʿ ath-Thānī", "رَبِيع ٱلثَّانِي", "The second spring", "Rabi Al Thani, which is formally known as Rabi al Aakhir, is the fourth month in accordance with the Islamic Calendar. Focusing on its Literal meaning, it is meant as the second month of spring.To serve the departed souls, donations are performed in Rabi Al Tha’ni. As the Islamic Calendar is based on Lunar Calendar, every month shall start on observing the first crescent of the new moon."),
            new Model("Jumadā al-ʾŪlā", "جُمَادَىٰ ٱلْأُولَىٰ", "The first of parched land", "Often considered the pre-Islamic summer. Jumādā may also be related to a verb meaning \"to freeze\" and another account relates that water would freeze during this time of year."),
            new Model("Jumādā ath-Thāniyah", "جُمَادَىٰ ٱلثَّانِيَة", "The second of parched land", "Jumada al-Thani (Arabic: جُمَادَىٰ ٱلثَّانِي\u200E, romanized: Jumādā ath-Thānī, lit. 'The second Jumada') also known as Jumada al-Akhirah (Arabic: جُمَادَىٰ ٱلْآخِرَة\u200E, romanized: Jumādā al-ʾĀkhirah, lit. 'The final Jumada'), or Jumada al-Akhir (Arabic: جُمَادَىٰ ٱلْآخِر\u200E, romanized: Jumādā al-ʾĀkhir), is the sixth month in the Islamic Calendar. The word Jumda (Arabic: جمد\u200E), from which the name of the month is derived, is used to denote dry parched land, a land devoid of rain, and hence denote the dry months.[citation needed] Jumādā (Arabic: جُمَادَىٰ\u200E) may also be related to a verb meaning \"to freeze\" and another account relates that water would freeze during this time of year."),
            new Model("Rajab", "رَجَب", "Respect, Honour", "This is the second sacred month in which fighting is forbidden. Rajab may also be related to a verb meaning \"to remove\", so called because pre-Islamic Arabs would remove the heads of their spears and refrain from fighting."),
            new Model("Shaban", "شَعْبَان", "Scattered", "Marked the time of year when Arab tribes dispersed to find water. Sha‘bān may also be related to a verb meaning \"to be in between two things\". Another account relates that it was called thus because the month lies between Rajab and Ramadan."),
            new Model("Ramadan", "رَمَضَان", "Burning heat", "Burning is related to fasting as with an empty stomach one's worldly desire will burn. Supposedly so called because of high temperatures caused by the excessive heat of the sun. Ramaḍān is the most venerated month of the Hijri calendar. During this time, Muslims must fast from pre-dawn until sunset and should give charity to the poor and needy."),
            new Model("Shawwal", "شَوَّال", "Raised", "Female camels would normally be in calf at this time of year and raise their tails. At the first day of this month, the Eid al-Fitr, \"Festival of Breaking the Fast\" begins, marking the end of fasting and the end of Ramadhan."),
            new Model("Du al-Qadah", "ذُو ٱلْقَعْدَة", "The one of truce/sitting", "This is a holy month during which war is banned. People are allowed to defend themselves if attacked."),
            new Model("Du al-Hijjah", "ذُو ٱلْحِجَّة", "The one of pilgrimage", "During this month Muslim pilgrims from all around the world congregate at Mecca to visit the Kaaba. The Hajj is performed on the eighth, ninth and the tenth of this month. Day of Arafah takes place on the ninth of the month. Eid al-Adha, the \"Festival of the Sacrifice\", begins on the tenth day and ends on sunset of the twelfth, and this is a fourth holy month during which war is banned.")
    };

    //IMPORTANT ISLAMIC EVENTS
    public static final Model[] ISLAMIC_EVENTS = {
            new Model("1 Muharram", " Islamic New Year.", 10.0),
            new Model("10 Muharram", "Day of Ashura. For both Shias and Sunnis, the martyrdom of Husayn ibn Ali, the grandson of Muhammad, and his followers. For Sunnis, the crossing of the Red Sea by Moses occurred on this day.", 10.0),
            new Model("12 Rabi al-Awwal", "Birth of Prophet Muhammad (PBUH)", 10.0),
            new Model("27 Rajab", "Isra' and Mi'raj", 10.0),
            new Model("17 Ramadan", "Battle of Badr", 10.0),
            new Model("27 Ramadan", "Nuzul al-Qur'an. The most probable day Muhammad received the first verses of the Quran.", 10.0),
            new Model("1 Shawwal", "Eid ul-Fitr", 10.0),
            new Model("8–13 Dhu al-Hijjah", "The Hajj pilgrimage to Mecca", 10.0),
            new Model("9 Dhu al-Hijjah", "Day of Arafa.", 10.0),
            new Model("10 Dhu al-Hijjah", "Eid al-Adha", 10.0),
            new Model("15 Sha'ban", "Mid-Sha'ban, or Night of Forgiveness", 10.0),
            new Model("6 Shawal", "Battle of Uhud", 10.0),

    };

    public static final Model[] ZAKKAT_QURANIC_DETAIL = {
            new Model("وَأَقِيمُوا۟ ٱلصَّلَوٰةَ وَءَاتُوا۟ ٱلزَّكَوٰةَ وَٱرْكَعُوا۟ مَعَ ٱلرَّٰكِعِينَ", "And establish prayer and give zakah and bow with those who bow [in worship and obedience].", "اور نماز قائم کرو اور زکوٰۃ دو اور رکوع کرنے والوں کے ساتھ جھکاؤ", "Wa aqeemus salaata wa aatuz zakaata warka’oo ma’ar raaki’een", "2:43", 4, 5, 6),
            new Model("وَإِذْ أَخَذْنَا مِيثَٰقَ بَنِىٓ إِسْرَٰٓءِيلَ لَا تَعْبُدُونَ إِلَّا ٱللَّهَ وَبِٱلْوَٰلِدَيْنِ إِحْسَانًا وَذِى ٱلْقُرْبَىٰ\n" +
                    "وَٱلْيَتَٰمَىٰ وَٱلْمَسَٰكِينِ وَقُولُوا۟ لِلنَّاسِ حُسْنًا وَأَقِيمُوا۟ ٱلصَّلَوٰةَ وَءَاتُوا۟ ٱلزَّكَوٰةَ ثُمَّ \n" +
                    "تَوَلَّيْتُمْ إِلَّا قَلِيلًا مِّنكُمْ وَأَنتُم مُّعْرِضُونَ \n", " And [recall] when We took the covenant from the Children of Israel, [enjoining upon them], “Do not worship except Allah ; and to parents do good and to relatives, orphans, and the needy. And speak to people good [words] and establish prayer and give zakah.” Then you turned away, except a few of you, and you were refusing", "اور [یاد رکھیں] جب ہم نے بنی اسرائیل سے عہد لیا تو ، (ان کو حکم دیتے ہوئے) ، \"اللہ کے سوا عبادت نہ کرو؛ اور والدین کے ساتھ اور رشتہ داروں ، یتیموں ، اور مسکینوں کے ساتھ بھلائی کریں۔ اور لوگوں سے اچھے [الفاظ] بولیں اور نماز قائم کریں اور زکوٰۃ دیں۔ پھر آپ نے ان چند لوگوں کو چھوڑ کر مکر لیا ، اور آپ انکار کر رہے تھے۔", "Wa iz akhaznaa meesaaqa Baneee Israaa’eela laa ta’budoona illal laaha wa bil waalidaini ihsaananw wa zil qurbaa walyataamaa walmasaakeeni wa qooloo linnaasi husnanw wa aqeemus salaata wa aatuzZakaata summa tawallaitum illaa qaleelam minkum wa antum mu’ridoon ", "2:83", 4, 5, 6),
            new Model("وَأَقِيمُوا۟ ٱلصَّلَوٰةَ وَءَاتُوا۟ ٱلزَّكَوٰةَ ۚ وَمَا تُقَدِّمُوا۟ لِأَنفُسِكُم مِّنْ خَيْرٍ تَجِدُوهُ عِندَ ٱللَّهِ ۗ \n" +
                    "إِنَّ ٱللَّهَ بِمَا تَعْمَلُونَ بَصِيرٌ\n", "And establish prayer and give zakah, and whatever good you put forward for yourselves – you will find it with Allah. Indeed, Allah of what you do, is Seeing ", "اور نماز قائم کرو اور زکوٰۃ دو ، اور جو کچھ تم اپنے لئے آگے بڑھاؤ گے وہ خدا کے پاس پائیں گے۔ جو کچھ تم کرتے ہو اللہ اس کو دیکھ رہا ہے", "Wa aqeemus salaata wa aatuz zakaah; wa maa tuqaddimoo li anfusikum min khairin tajidoohu ‘indal laah; innal laaha bimaa ta’maloona baseer", "2:110", 4, 5, 6),
            new Model("إِنَّ ٱلَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ ٱلصَّٰلِحَٰتِ وَأَقَامُوا۟ ٱلصَّلَوٰةَ وَءَاتَوُا۟ ٱلزَّكَوٰةَ لَهُمْ أَجْرُهُمْ \n" +
                    "عِندَ رَبِّهِمْ وَلَا خَوْفٌ عَلَيْهِمْ وَلَا هُمْ يَحْزَنُونَ\n", "Indeed, those who believe and do righteous deeds and establish prayer and give zakah will have their reward with their Lord, and there will be no fear concerning them, nor will they grieve. ", "بے شک جو لوگ ایمان لائے اور نیک عمل کرتے رہے اور نماز قائم کرتے اور زکوٰۃ دیتے ہیں ان کا اجر اپنے پروردگار کے پاس ہے اور نہ ان کو کوئی خوف ہوگا اور نہ وہ غمگین ہوں گے۔", "Innal lazeena aamanoo wa amilus saalihaati wa aqaamus salaata wa aatawuz zakaata lahum ajruhum ‘inda rabbihim wa laa khawfun ‘alaihim wa laa hum yahzanoon", "2:277", 4, 5, 6),
            new Model("إِنَّمَا وَلِيُّكُمُ ٱللَّهُ وَرَسُولُهُۥ وَٱلَّذِينَ ءَامَنُوا۟ ٱلَّذِينَ يُقِيمُونَ ٱلصَّلَوٰةَ \n" +
                    "وَيُؤْتُونَ ٱلزَّكَوٰةَ وَهُمْ رَٰكِعُونَ\n", "Your ally is none but Allah and [therefore] His Messenger and those who have believed – those who establish prayer and give zakah, and they bow [in worship]. ", "آپ کا حلیف اللہ کے سوا اور اس کا رسول اور مومنین کے سوا کوئی نہیں ہے جو نماز قائم کرتے ہیں اور زکوٰۃ دیتے ہیں اور وہ سجدہ کرتے ہیں۔", "Innamaa waliyyukumul laahu wa Rasooluhoo wal lazeena aamanul lazeena yuqeemoonas Salaata wa yu’toonaz Zakaata wa hum raaki’oon", "5:55", 4, 5, 6),
    };


    public static final Model[] ZAKKAT_ELIGIBLE_PEOPLE = {
            new Model(" Al-Fuqara (The poor)","غریب", "Fuqara are the people who live below the poverty line and don’t have enough means to live a normal life like others. They deserve your zakat in order to meet the daily necessities of their lives", "فوقرہ وہ لوگ ہیں جو غربت کی لکیر سے نیچے رہتے ہیں اور دوسروں کی طرح معمول کی زندگی گزارنے کے لئے اتنے ذرائع نہیں رکھتے ہیں۔ اپنی زندگی کی روز مرہ کی ضروریات کو پورا کرنے کے لیے وہ آپ کی زکات کے مستحق ہیں", 2.0, 3.0, 'p'),
            new Model(" Al-Masakin (The needy)","مسکین", "Masakin are extremely poor and needy people. These people don’t have any possessions or income. Your zakat money can help them in improving their living conditions.", "مساکین انتہائی غریب اور محتاج افراد ہیں۔ ان لوگوں کے پاس کوئی سامان یا آمدنی نہیں ہے۔ آپ کی زکوہ\n" +
                    "کی رقم ان کے رہائشی حالات کو بہتر بنانے میں مدد کرسکتی ہے۔\n", 2.0, 3.0, 'p'),
            new Model("Zakat collectors","ِ زکات جمع کرنے والا", "Zakat can be given to the people who are authorized to collect and distribute it among the needy and poor. It includes trustworthy institutions and NGOs who are working to help underprivileged Muslim communities.", "زکوہ\n" +
                    "ان لوگوں کو دی جاسکتی ہے جو اس کو جمع کرنے اور محتاجوں اور مسکینوں میں بانٹنے کے مجاز ہیں۔ اس میں قابل اعتماد ادارے اور غیر سرکاری تنظیمیں شامل ہیں جو پسماندہ مسلم کمیونٹیز کی مدد کے لئے کوشاں ہیں۔\n" +
                    "\n", 2.0, 3.0, 'p'),
            new Model("Who converted to Islam","جو نیا مسلمان ہو جاۓ" ,"Those who are newly converted to Islam are eligible to receive zakat (if they are needy). For example, if someone has converted and is detached from their family and friends, you can give your zakat to them so that they can start their new journey.", "جو لوگ اسلام قبول کرچکے ہیں وہ زکوہ\n" +
                    "وصول کرنے کے اہل ہیں (اگر وہ محتاج ہوں)۔ مثال کے طور پر ، اگر کوئی شخص تبدیل ہوا ہے اور اپنے کنبہ اور دوستوں سے علیحدہ ہے ، تو آپ اپنی زکوہ\n" +
                    "انہیں دے سکتے ہیں تاکہ وہ اپنا نیا سفر شروع کرسکیں۔\n" +
                    "\n", 2.0, 3.0, 'p'),
            new Model("Freeing captives","غلاموں کو آزاد کرنا", "Slavery is prohibited in many parts of the world but there are still some places where people are trafficked and kept as slaves. Your zakat money can help slaves in freeing themselves and improve their living standards.", "دنیا کے بیشتر حصوں میں غلامی کی ممانعت ہے لیکن اب بھی کچھ ایسی جگہیں ہیں جہاں لوگوں کو سمگل کیا جاتا ہے اور غلام بنا کر رکھا جاتا ہے۔ آپ کی زکوہ\n" +
                    "کی رقم غلاموں کو اپنے آپ کو آزاد کرنے اور ان کے معیار زندگی کو بہتر بنانے میں مدد کرسکتی ہے۔\n" +
                    "\n", 2.0, 3.0, 'p'),
            new Model("Debtors","مقروض", "Zakat can be given to pay off the debts of someone who cannot repay on his own. However, one must make sure that the money borrowed by a debtor is not used for any un-Islamic or wrong purpose", "زکوہ\n" +
                    "کسی ایسے شخص کے قرض ادا کرنے کے لئے دی جاسکتی ہے جو خود ہی ادائیگی نہیں کرسکتا۔ تاہم ، کسی کو یہ یقینی بنانا ہوگا کہ کسی دیندار کے ذریعہ لی گئی رقم کسی غیر اسلامی یا غلط مقصد کے لئے استعمال نہیں ہوتی ہے\n" +
                    "\n", 2.0, 3.0, 'p'),
            new Model("In the path of Allah","اللہ کی راہ میں", "Those who are striving in the path of Allah are entitled to receive your zakat. These are the people who are fighting for Allah’s cause far away from their homes. Your zakat can help them have a better living.", "جو لوگ اللہ کی راہ پر گامزن ہیں وہ آپ کی زکوہ\n" +
                    "وصول کرنے کے حقدار ہیں۔ یہ وہ لوگ ہیں جو اپنے گھروں سے بہت دور اللہ کے مقصد کے لئے لڑ رہے ہیں۔ آپ کی زکوہ\n" +
                    "بہتر زندگی گزارنے میں ان کی مدد کر سکتی ہے۔\n" +
                    "\n", 2.0, 3.0, 'p'),
            new Model("Wayfarer (Travelers)","راستہ فروش", "Zakat can be given to a traveler who is left alone in a foreign land and is in need of money to get back to his destination or to fulfill his objective of traveling. There is a condition that the person should be traveling for a lawful purpose otherwise he is not entitled to receive zakat. Refugees are also wayfarers and can be given zakat money as they leave their countries because of violence and oppression in search of a safe and better place.", "زکوہ\n" +
                    "کسی ایسے مسافر کو دی جاسکتی ہے جو غیر ملکی سرزمین میں تنہا رہ جاتا ہے اور اسے اپنی منزل مقصود تک پہنچنے کے لئے یا سفر کے اپنے مقصد کو پورا کرنے کے لئے رقم کی ضرورت ہوتی ہے۔ اس شرط میں ہے کہ اس شخص کو کسی حلال مقصد کے لئے سفر کرنا چاہئے ورنہ وہ زکوہ\n" +
                    "وصول کرنے کا حقدار نہیں ہے۔ پناہ گزین بھی راہ سفر کرنے والے ہیں اور انہیں ایک محفوظ اور بہتر جگہ کی تلاش میں ہونے والے تشدد اور جبر کی وجہ سے اپنے ملک چھوڑنے پر زکوہ\n" +
                    "کی رقم دی جاسکتی ہے۔\n" +
                    "\n", 2.0, 3.0, 'p')

    };


    private String ALLAH_NAMES_ARABIC;
    private String ALLAH_NAMES_ENGLISH;
    private String ALLAH_NAMES_MEANING;
    private String ALLAH_NAMES_REFERENCE_ARABIC;
    private String ALLAH_NAMES_REFERENCE_ENGLISH;
    private String MUHAMMAD_NAMES_ARABIC;
    private String MUHAMMAD_NAMES_ENGLISH;
    private String MUHAMMAD_NAMES_MEANING;
    private String MUHAMMAD_NAMES_REFERENCE_ARABIC;
    private String MUHAMMAD_NAMES_REFERENCE_ENGLISH;
    private int IMAGE_ID;
    private String MENU_NAME;

    private String DUA_URDU;
    private String DUA_ENGLISH;
    private String DUA;
    private String DUA_MEANING_URDU;
    private String DUA_MEANING_ENGLISH;
    private String DUA_REFERENCE;

    private String NAMAZ_HEADING_URDU;
    private String NAMAZ_HEADING_ENGLISH;
    private String STEPS_URDU;
    private String STEPS_ENGLISH;
    private String NAMAZ_ARABIC;
    private String NAMAZ_URDU;
    private String NAMAZ_ENGLISH;
    private String TRANSLITERATION;
    private int PROCESS_IMAGE;

    private String TASBEEH;


    private String TASBEEH_TRANSLATION;
    private String TASBEEH_TRASNLITERATION;

    private String ABLUTION_HEADING_ENGLISH;
    private String ABLUTION_HEADING_URDU;
    private String ABLUTION_PROCESS_ENGLISH;
    private String ABLUTION_PROCESS_URDU;
    private String ABLUTION_DUA;
    private String ABLUTION_DUA_TRANSLATION_ENGLISH;
    private String ABLUTION_DUA_TRANSLATION_URDU;
    private String ABLUTION_DUA_TRANSLITERATION;
    private int ABLUTION_PROCESS_IMAGE_ID;

    private String RAMADAN_HEADING_ENGLISH;
    private String RAMADAN_HEADING_URDU;

    private String RAMADAN_QURAN_REFERENCE_ARABIC;
    private String RAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH;
    private String RAMADAN_QURAN_REFERENCE_TRANSLATION_URDU;
    private String RAMADAN_QURAN_AYAH_REFERENCE;

    private String RAMADAN_HADITH_REFERENCE_ARABIC;
    private String RAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH;
    private String RAMADAN_HADITH_REFERENCE_TRANSLATION_URDU;
    private String RAMADAN_HADITH_REFERENCE;

    //Hajj
    private String HAJJ_HEADINGS_ENGLISH;
    private String HAJJ_HEADINGS_URDU;
    private char c;
    //hajj process
    private String HAJJ_PROCESS_ENGLISH;
    private String HAJJ_PROCESS_URDU;
    private int a = 0;

    //Islamic Events
    private String HIJRA_DATES;
    private String DESCRIPTION_OF_EVENTS;
    private double n = 10.0;

    //Zakkat From Quran
    private String ZAKKAT_QURAN_REFERENCE_ARABIC;
    private String ZAKKAT_QURAN_REFERENCE_TRANSLATION_ENGLISH;
    private String ZAKKAT_QURAN_REFERENCE_TRANSLATION_URDU;
    private String ZAKKAT_QURAN_REFERENCE_TRANSLITERATION;
    private String ZAKKAT_QURAN_AYAH_REFERENCE;
    private int e = 4;
    private int f = 5;
    private int g = 6;


    //zakkat eligible people
    private String ELIGIBLE_PEOPLE_ENGLISH;
    private String ELIGIBLE_PEOPLE_URDU;
    private String DESCRIPTION_IN_ENGLISH;
    private String DESCRIPTION_IN_URDU;
    private double l = 2.0;
    private double o = 3.0;
    private char v = 'p';


    public Model(String HIJRA_DATES, String DESCRIPTION_OF_EVENTS, double i) {
        this.HIJRA_DATES = HIJRA_DATES;
        this.DESCRIPTION_OF_EVENTS = DESCRIPTION_OF_EVENTS;
        this.n = n;

    }


    public Model(String HAJJ_PROCESS_ENGLISH, String HAJJ_PROCESS_URDU, int a) {
        this.HAJJ_PROCESS_ENGLISH = HAJJ_PROCESS_ENGLISH;
        this.HAJJ_PROCESS_URDU = HAJJ_PROCESS_URDU;
        this.a = a;

    }

    public Model(String HAJJ_HEADINGS_ENGLISH, String HAJJ_HEADINGS_URDU, char c) {
        this.HAJJ_HEADINGS_ENGLISH = HAJJ_HEADINGS_ENGLISH;
        this.HAJJ_HEADINGS_URDU = HAJJ_HEADINGS_URDU;
        this.c = c;
    }

    public Model(String RAMADAN_QURAN_REFERENCE_ARABIC, String RAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH, String RAMADAN_QURAN_REFERENCE_TRANSLATION_URDU, String RAMADAN_QURAN_AYAH_REFERENCE) {
        this.RAMADAN_QURAN_REFERENCE_ARABIC = RAMADAN_QURAN_REFERENCE_ARABIC;
        this.RAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH = RAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH;
        this.RAMADAN_QURAN_REFERENCE_TRANSLATION_URDU = RAMADAN_QURAN_REFERENCE_TRANSLATION_URDU;
        this.RAMADAN_QURAN_AYAH_REFERENCE = RAMADAN_QURAN_AYAH_REFERENCE;
    }

    public Model(String RAMADAN_HADITH_REFERENCE_ARABIC, String RAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH, String RAMADAN_HADITH_REFERENCE_TRANSLATION_URDU, String RAMADAN_HADITH_REFERENCE, Long EXTRA) {
        this.RAMADAN_HADITH_REFERENCE_ARABIC = RAMADAN_HADITH_REFERENCE_ARABIC;
        this.RAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH = RAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH;
        this.RAMADAN_HADITH_REFERENCE_TRANSLATION_URDU = RAMADAN_HADITH_REFERENCE_TRANSLATION_URDU;
        this.RAMADAN_HADITH_REFERENCE = RAMADAN_HADITH_REFERENCE;
    }

    public String getABLUTION_HEADING_ENGLISH() {
        return ABLUTION_HEADING_ENGLISH;
    }

    public String getABLUTION_HEADING_URDU() {
        return ABLUTION_HEADING_URDU;
    }

    public Model(String ABLUTION_HEADING_ENGLISH, String ABLUTION_HEADING_URDU, String ABLUTION_PROCESS_ENGLISH, String ABLUTION_PROCESS_URDU, String ABLUTION_DUA, String ABLUTION_DUA_TRANSLATION_ENGLISH, String ABLUTION_DUA_TRANSLATION_URDU, String ABLUTION_DUA_TRANSLITERATION, int ABLUTION_PROCESS_IMAGE_ID, int VALUE) {
        this.ABLUTION_HEADING_ENGLISH = ABLUTION_HEADING_ENGLISH;
        this.ABLUTION_HEADING_URDU = ABLUTION_HEADING_URDU;
        this.ABLUTION_PROCESS_ENGLISH = ABLUTION_PROCESS_ENGLISH;
        this.ABLUTION_PROCESS_URDU = ABLUTION_PROCESS_URDU;
        this.ABLUTION_DUA = ABLUTION_DUA;
        this.ABLUTION_DUA_TRANSLATION_ENGLISH = ABLUTION_DUA_TRANSLATION_ENGLISH;
        this.ABLUTION_DUA_TRANSLATION_URDU = ABLUTION_DUA_TRANSLATION_URDU;
        this.ABLUTION_DUA_TRANSLITERATION = ABLUTION_DUA_TRANSLITERATION;
        this.ABLUTION_PROCESS_IMAGE_ID = ABLUTION_PROCESS_IMAGE_ID;
    }

    public Model(String NAMAZ_HEADING_URDU, String NAMAZ_HEADING_ENGLISH, String STEPS_URDU, String STEPS_ENGLISH, String NAMAZ_ARABIC, String NAMAZ_URDU, String NAMAZ_ENGLISH, String TRANSLITERATION, int PROCESS_IMAGE) {
        this.NAMAZ_HEADING_URDU = NAMAZ_HEADING_URDU;
        this.NAMAZ_HEADING_ENGLISH = NAMAZ_HEADING_ENGLISH;
        this.STEPS_URDU = STEPS_URDU;
        this.STEPS_ENGLISH = STEPS_ENGLISH;
        this.NAMAZ_ARABIC = NAMAZ_ARABIC;
        this.NAMAZ_URDU = NAMAZ_URDU;
        this.NAMAZ_ENGLISH = NAMAZ_ENGLISH;
        this.TRANSLITERATION = TRANSLITERATION;
        this.PROCESS_IMAGE = PROCESS_IMAGE;
    }

    public Model(int IMAGE_ID, String MENU_NAME) {
        this.IMAGE_ID = IMAGE_ID;
        this.MENU_NAME = MENU_NAME;
    }

    public Model(String ALLAH_NAMES_ARABIC, String ALLAH_NAMES_ENGLISH, String ALLAH_NAMES_MEANING, String ALLAH_NAMES_REFERENCE_ARABIC, String ALLAH_NAMES_REFERENCE_ENGLISH) {
        this.ALLAH_NAMES_ARABIC = ALLAH_NAMES_ARABIC;
        this.ALLAH_NAMES_ENGLISH = ALLAH_NAMES_ENGLISH;
        this.ALLAH_NAMES_MEANING = ALLAH_NAMES_MEANING;
        this.ALLAH_NAMES_REFERENCE_ARABIC = ALLAH_NAMES_REFERENCE_ARABIC;
        this.ALLAH_NAMES_REFERENCE_ENGLISH = ALLAH_NAMES_REFERENCE_ENGLISH;
    }


    public Model(String MUHAMMAD_NAMES_ARABIC, String MUHAMMAD_NAMES_ENGLISH, String MUHAMMAD_NAMES_MEANING, String MUHAMMAD_NAMES_REFERENCE_ARABIC, String MUHAMMAD_NAMES_REFERENCE_ENGLISH, int val) {
        this.MUHAMMAD_NAMES_ARABIC = MUHAMMAD_NAMES_ARABIC;
        this.MUHAMMAD_NAMES_ENGLISH = MUHAMMAD_NAMES_ENGLISH;
        this.MUHAMMAD_NAMES_MEANING = MUHAMMAD_NAMES_MEANING;
        this.MUHAMMAD_NAMES_REFERENCE_ARABIC = MUHAMMAD_NAMES_REFERENCE_ARABIC;
        this.MUHAMMAD_NAMES_REFERENCE_ENGLISH = MUHAMMAD_NAMES_REFERENCE_ENGLISH;
    }

    public Model(String DUA_URDU, String DUA_ENGLISH, String DUA, String DUA_MEANING_URDU, String DUA_MEANING_ENGLISH, String DUA_REFERENCE) {
        this.DUA_URDU = DUA_URDU;
        this.DUA_ENGLISH = DUA_ENGLISH;
        this.DUA = DUA;
        this.DUA_MEANING_URDU = DUA_MEANING_URDU;
        this.DUA_MEANING_ENGLISH = DUA_MEANING_ENGLISH;
        this.DUA_REFERENCE = DUA_REFERENCE;
    }

    public Model(String TASBEEH, String TASBEEH_TRANSLATION, String TASBEEH_TRASNLITERATION) {
        this.TASBEEH = TASBEEH;
        this.TASBEEH_TRANSLATION = TASBEEH_TRANSLATION;
        this.TASBEEH_TRASNLITERATION = TASBEEH_TRASNLITERATION;
    }

    public Model(String RAMADAN_HEADING_ENGLISH, String RAMADAN_HEADING_URDU) {
        this.RAMADAN_HEADING_ENGLISH = RAMADAN_HEADING_ENGLISH;
        this.RAMADAN_HEADING_URDU = RAMADAN_HEADING_URDU;
    }

    public Model(String ELIGIBLE_PEOPLE_ENGLISH, String ELIGIBLE_PEOPLE_URDU, String DESCRIPTION_IN_ENGLISH, String DESCRIPTION_IN_URDU, double l, double o, char v) {
        this.ELIGIBLE_PEOPLE_ENGLISH = ELIGIBLE_PEOPLE_ENGLISH;
        this.ELIGIBLE_PEOPLE_URDU = ELIGIBLE_PEOPLE_URDU;
        this.DESCRIPTION_IN_ENGLISH = DESCRIPTION_IN_ENGLISH;
        this.DESCRIPTION_IN_URDU = DESCRIPTION_IN_URDU;
        this.l = l;
        this.o = o;
        this.v = v;

    }


    public Model(String ZAKKAT_QURAN_REFERENCE_ARABIC, String ZAKKAT_QURAN_REFERENCE_TRANSLATION_ENGLISH, String ZAKKAT_QURAN_REFERENCE_TRANSLATION_URDU, String ZAKKAT_QURAN_REFERENCE_TRANSLITERATION, String ZAKKAT_QURAN_AYAH_REFERENCE, int e, int f, int g) {
        this.ZAKKAT_QURAN_REFERENCE_ARABIC = ZAKKAT_QURAN_REFERENCE_ARABIC;
        this.ZAKKAT_QURAN_REFERENCE_TRANSLATION_ENGLISH = ZAKKAT_QURAN_REFERENCE_TRANSLATION_ENGLISH;
        this.ZAKKAT_QURAN_REFERENCE_TRANSLATION_URDU = ZAKKAT_QURAN_REFERENCE_TRANSLATION_URDU;
        this.ZAKKAT_QURAN_REFERENCE_TRANSLITERATION = ZAKKAT_QURAN_REFERENCE_TRANSLITERATION;
        this.ZAKKAT_QURAN_AYAH_REFERENCE = ZAKKAT_QURAN_AYAH_REFERENCE;
        this.e = e;
        this.f = f;
        this.g = g;

    }


    public String getMUHAMMAD_NAMES_REFERENCE_ARABIC() {
        return MUHAMMAD_NAMES_REFERENCE_ARABIC;
    }

    public String getMUHAMMAD_NAMES_REFERENCE_ENGLISH() {
        return MUHAMMAD_NAMES_REFERENCE_ENGLISH;
    }

    public String getALLAH_NAMES_REFERENCE_ARABIC() {
        return ALLAH_NAMES_REFERENCE_ARABIC;
    }

    public String getALLAH_NAMES_REFERENCE_ENGLISH() {
        return ALLAH_NAMES_REFERENCE_ENGLISH;
    }

    public String getMUHAMMAD_NAMES_MEANING() {
        return MUHAMMAD_NAMES_MEANING;
    }

    public String getALLAH_NAMES_MEANING() {
        return ALLAH_NAMES_MEANING;
    }

    public String getMUHAMMAD_NAMES_ENGLISH() {
        return MUHAMMAD_NAMES_ENGLISH;
    }

    public String getMUHAMMAD_NAMES_ARABIC() {
        return MUHAMMAD_NAMES_ARABIC;
    }

    public String getALLAH_NAMES_ENGLISH() {
        return ALLAH_NAMES_ENGLISH;
    }

    public String getMENU_NAME() {
        return MENU_NAME;
    }

    public int getIMAGE_ID() {
        return IMAGE_ID;
    }

    public String getALLAH_NAMES_ARABIC() {
        return ALLAH_NAMES_ARABIC;
    }

    public String getDUA_URDU() {
        return DUA_URDU;
    }

    public String getDUA_ENGLISH() {
        return DUA_ENGLISH;
    }

    public String getDUA() {
        return DUA;
    }

    public String getDUA_MEANING_URDU() {
        return DUA_MEANING_URDU;
    }

    public String getDUA_MEANING_ENGLISH() {
        return DUA_MEANING_ENGLISH;
    }

    public String getDUA_REFERENCE() {
        return DUA_REFERENCE;
    }

    public String getNAMAZ_HEADING_URDU() {
        return NAMAZ_HEADING_URDU;
    }

    public String getNAMAZ_HEADING_ENGLISH() {
        return NAMAZ_HEADING_ENGLISH;
    }

    public String getSTEPS_URDU() {
        return STEPS_URDU;
    }

    public String getSTEPS_ENGLISH() {
        return STEPS_ENGLISH;
    }

    public String getNAMAZ_ARABIC() {
        return NAMAZ_ARABIC;
    }

    public String getNAMAZ_URDU() {
        return NAMAZ_URDU;
    }

    public String getNAMAZ_ENGLISH() {
        return NAMAZ_ENGLISH;
    }

    public String getTRANSLITERATION() {
        return TRANSLITERATION;
    }

    public int getPROCESS_IMAGE() {
        return PROCESS_IMAGE;
    }

    public String getTASBEEH() {
        return TASBEEH;
    }

    public String getTASBEEH_TRANSLATION() {
        return TASBEEH_TRANSLATION;
    }

    public String getTASBEEH_TRASNLITERATION() {
        return TASBEEH_TRASNLITERATION;
    }


    public String getABLUTION_PROCESS_ENGLISH() {
        return ABLUTION_PROCESS_ENGLISH;
    }

    public String getABLUTION_PROCESS_URDU() {
        return ABLUTION_PROCESS_URDU;
    }

    public String getABLUTION_DUA() {
        return ABLUTION_DUA;
    }

    public String getABLUTION_DUA_TRANSLATION_ENGLISH() {
        return ABLUTION_DUA_TRANSLATION_ENGLISH;
    }

    public String getABLUTION_DUA_TRANSLATION_URDU() {
        return ABLUTION_DUA_TRANSLATION_URDU;
    }

    public String getABLUTION_DUA_TRANSLITERATION() {
        return ABLUTION_DUA_TRANSLITERATION;
    }

    public int getABLUTION_PROCESS_IMAGE_ID() {
        return ABLUTION_PROCESS_IMAGE_ID;
    }

    public String getRAMADAN_HEADING_ENGLISH() {
        return RAMADAN_HEADING_ENGLISH;
    }

    public String getRAMADAN_HEADING_URDU() {
        return RAMADAN_HEADING_URDU;
    }

    public String getRAMADAN_QURAN_REFERENCE_ARABIC() {
        return RAMADAN_QURAN_REFERENCE_ARABIC;
    }

    public String getRAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH() {
        return RAMADAN_QURAN_REFERENCE_TRANSLATION_ENGLISH;
    }

    public String getRAMADAN_QURAN_REFERENCE_TRANSLATION_URDU() {
        return RAMADAN_QURAN_REFERENCE_TRANSLATION_URDU;
    }

    public String getRAMADAN_QURAN_AYAH_REFERENCE() {
        return RAMADAN_QURAN_AYAH_REFERENCE;
    }

    public String getRAMADAN_HADITH_REFERENCE_ARABIC() {
        return RAMADAN_HADITH_REFERENCE_ARABIC;
    }

    public String getRAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH() {
        return RAMADAN_HADITH_REFERENCE_TRANSLATION_ENGLISH;
    }

    public String getRAMADAN_HADITH_REFERENCE_TRANSLATION_URDU() {
        return RAMADAN_HADITH_REFERENCE_TRANSLATION_URDU;
    }

    public String getRAMADAN_HADITH_REFERENCE() {
        return RAMADAN_HADITH_REFERENCE;
    }

    public String getHAJJ_HEADINGS_ENGLISH() {
        return HAJJ_HEADINGS_ENGLISH;
    }

    public String getHAJJ_HEADINGS_URDU() {
        return HAJJ_HEADINGS_URDU;
    }

    public String getHAJJ_PROCESS_ENGLISH() {
        return HAJJ_PROCESS_ENGLISH;
    }

    public String getHAJJ_PROCESS_URDU() {
        return HAJJ_PROCESS_URDU;
    }

    public String getHIJRA_DATES() {
        return HIJRA_DATES;
    }

    public String getDESCRIPTION_OF_EVENTS() {
        return DESCRIPTION_OF_EVENTS;
    }

    public String getELIGIBLE_PEOPLE_ENGLISH() {
        return ELIGIBLE_PEOPLE_ENGLISH;
    }

    public String getDESCRIPTION_IN_ENGLISH() {
        return DESCRIPTION_IN_ENGLISH;
    }

    public String getDESCRIPTION_IN_URDU() {
        return DESCRIPTION_IN_URDU;
    }

    public String getZAKKAT_QURAN_REFERENCE_ARABIC() {
        return ZAKKAT_QURAN_REFERENCE_ARABIC;
    }

    public String getZAKKAT_QURAN_REFERENCE_TRANSLATION_ENGLISH() {
        return ZAKKAT_QURAN_REFERENCE_TRANSLATION_ENGLISH;
    }

    public String getZAKKAT_QURAN_REFERENCE_TRANSLATION_URDU() {
        return ZAKKAT_QURAN_REFERENCE_TRANSLATION_URDU;
    }

    public String getZAKKAT_QURAN_REFERENCE_TRANSLITERATION() {
        return ZAKKAT_QURAN_REFERENCE_TRANSLITERATION;
    }

    public String getELIGIBLE_PEOPLE_URDU() {
        return ELIGIBLE_PEOPLE_URDU;
    }

    public String getZAKKAT_QURAN_AYAH_REFERENCE() {
        return ZAKKAT_QURAN_AYAH_REFERENCE;
    }

}


