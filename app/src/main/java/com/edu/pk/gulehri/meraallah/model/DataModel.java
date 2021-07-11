package com.edu.pk.gulehri.meraallah.model;

public class DataModel {

    //Zakkat From Hadith
    private String ZAKKAT_HADITH_REFERENCE_ARABIC;
    private String ZAKKAT_HADITH_REFERENCE_TRANSLATION_ENGLISH;
    private String ZAKKAT_HADITH_REFERENCE_TRANSLATION_URDU;
    private String ZAKKAT_HADITH_NARRATED_BY;
    private String ZAKKAT_HADITH_REFERENCE;

    //Six kalimas
    private String KALIMAH_NAME;
    private String KALIMAH_IN_ARABIC;
    private String KALIMAH_TRANSLATION_IN_ENGLISH;
    private String KALIMAH_TRANSLATION_IN_URDU;
    private String KALIMAH_TRANSLITERATION;
    private int justNumber;

    private String FUNERAL_PRAYER_PROCESS_IN_ENGLISH;
    private String FUNERAL_PRAYER_PROCESS_IN_URDU;

    public static final DataModel[] NEWBORN_CHILD = {
            new DataModel("Congratulations", "مبارک باد دینا", "When a baby is born, then it is commendable in Islam (Mustahab) to congratulate the parents on the birth of the child. ", "جب بچہ پیدا ہوتا ہے ، تب اسلام میں والدین کو بچے کی پیدائش پر مبارکباد پیش کرنا قابل تحسین ہے۔"),
            new DataModel("Azaan", "آذان", "Azaan should be said in the right ear, and the Iqaamah in the left ear. This is done immediately after the baby is born. \n" +
                    "It is narrated that on the birth of Hasan (رضي الله عنه), the Prophet (صلى الله عليه وآله وسلم) said the Azaan in his ear. (Abu Dawood, Tirmizi). \n" +
                    "While writing on the wisdom of this, Hafiz Ibn Al Qayyim has stated that the significance of saying the Azaan and Iqaamah in the ears is that such words declare the greatness and majesty of Allah. \n" +
                    "In other words, this is prompting the creed of Islam, and through the Azan and Iqaamah, the Satans distance themselves from the child.", "اذان دائیں کان میں ، اور  اقامہ بائیں کان میں کہنا چاہئے۔ یہ بچے کے پیدا ہونے کے فورا بعد کیا جاتا ہے۔\n" +
                    " حدیث ہے کہ حسن رضی اللہ عنہ کی ولادت کے دن ، رسول اللہ صلی اللہ علیہ وسلم نے اس کے کان میں اذان کہی۔ (ابو داؤد ، ترمذی)\n" +
                    "اس کی حکمت پر لکھتے ہوئے حافظ ابن القیوم نے بیان کیا ہے کہ کانوں میں اذان اور اقامت کہنے کی اہمیت یہ ہے کہ اس طرح کے الفاظ اللہ کی عظمت اور اللہ کی شان کا اعلان کرتے ہیں۔\n" +
                    "دوسرے لفظوں میں ، یہ مذہب اسلام کو فروغ دے رہا ہے ، اور اذان اور اقامہ کے ذریعہ شیطان اپنے آپ کو بچے سے دور کرتا ہے۔"),
            new DataModel("Tahneek ", "تہنیک", "Tahneek should be done with the child. This is the practice of chewing and softening a date, and placing a little of it on the palate of the child, so that it goes down the infant’s throat easily. \n" +
                    "Care must be taken to remove the skin of the date. If the date is not available, one may apply anything sweet (like honey or syrup) to the child’s palate.\n" +
                    "The scholars have written that through this Sunnah act of tahneek, the veins and muscles of the child are strengthened. \n" +
                    "The dental palate, the jaws and mouth are made active, thereby making it easy for the child to draw milk from the breast of the mother.\n" +
                    "In this regard, it is narrated from Abu Moosa (رضي الله عنه) that he said, ‘A son was born at our place, I bought him to the Messenger of Allah (صلى الله عليه وآله وسلم) who named him Ibrahim, and performed his tahneek with a date. He then made dua of barakah (blessings for him) and handed him to me’. (Bukhari, Muslim).", "تہنیک بچے کے ساتھ کی جانی چاہئے۔ یہ ایک کھجور کو چبانے اور نرم کرنے کا رواج ہے ، اور اس کا تھوڑا سا بچے کے تالے پر رکھ دیتے ہیں ، تاکہ یہ آسانی سے بچے کے گلے میں جاسکے۔\n" +
                    " اگر کھجور دستیاب نہیں ہے تو ، کوئی بھی  میٹھی چیز (جیسے شہد یا شربت)بچے کے تالے میں  پر رکھ سکتے ہیں۔\n" +
                    "علمائے کرام نے لکھا ہے کہ تہنک کے اس سنت عمل سے بچے کی رگوں اور پٹھوں کو تقویت ملتی ہے۔\n" +
                    "دانتوں کا تالو ، جبڑے اور منہ فعال ہوجاتے ہیں ، اس طرح بچے کے لئے ماں کے چھاتی سے دودھ نکالنا آسان ہوجاتا ہے۔\n" +
                    "اس سلسلے میں ، ابو موسیٰ (رضی اللہ عنہ) سے روایت ہے کہ انہوں نے کہا ، 'ہمارے  گھر میں ایک بیٹا پیدا ہوا ، میں اسے رسول اللہ صلی اللہ علیہ وسلم کے پاس لےگیا ، جس نے اس کا نام ابراہیم رکھا ، اور  ایک  کھجور کے ساتھ اس کا تاہنیک انجام دیا. پھر اس نے برکت کی دعا کی اور اسے میرے حوالے کیا۔ (بخاری ، مسلم)"),
            new DataModel(" Shaving of Head", "سر مونڈنا", "The head of the infant should be shaved. The hair on the head of the child must be shaved on the seventh day. It is commendable (Mustahab) to give silver (or its value in money) in Sadaqah (charity) to the poor and needy equal to the weight of the child’s hair.\n" +
                    "It is narrated that Fatima (رضي الله عنها) distributed silver as Sadaqah equal in weight to the hair on the heads of Hasan, Husain, Zainab and Umme Kulthum (رضی الله عنهم). (Muwata of Imam Malik).\n" +
                    "Ibn Ishaq has also narrated that on the birth of Hasan (رضي الله عنه) the Prophet (صلى الله عليه وآله وسلم) requested Fatima (رضي الله عنها) to have the hair of the infant shaved and offer silver equal in weight to the hair as Sadaqah.\n" +
                    "The entire head must be shaved. To leave some hair, while shaving some is prohibited. While writing on the significance of shaving the infant’s head, the scholars have written, ‘shaving the hair of the head provides the child with strength, and opens the pores of the skin. It is also beneficial to the child’s eyesight, hearing and sense of smell.", "بچے کا سر مونڈنا چاہئے۔ ساتویں دن بچے کے سر کے بال مونڈنے چاہیے۔ صدقہ (صدقہ) میں چاندی (یا اس کی قیمت میں) بچے کے بالوں کے وزن کے برابر غریب اور نادار افراد کو دینا (قابل تحسین ہے) قابل تعریف ہے۔\n" +
                    "روایت ہے کہ فاطمہ (رضی اللہ عنہا) نے حسن ، حسین ، زینب اور امت کلثوم (رضی اللہ عنہم) کے سروں پر بالوں میں برابر صداقت کے طور پر چاندی تقسیم کی۔ (امام مالک کا معاویہ)\n" +
                    "ابن اسحاق نے یہ بھی روایت کیا ہے کہ حسن (رضی اللہ عنہ) کی ولادت کے موقع پر نبی (صلی اللہ علیہ وآلہ وسلم) نے فاطمہ (رضی اللہ عنہا) سے درخواست کی کہ بچے کے بال منڈوائیں اور بالوں کو چاندی کے برابر وزن پیش کریں۔ \n" +
                    "سارا سر مونڈنا چاہئے۔ کچھ بالوں کو چھوڑنا ، جبکہ کچھ مونڈنا ممنوع ہے۔ نوزائیدہ بچے کے سر منڈانے کی اہمیت پر لکھتے ہوئے ، اسکالرز نے لکھا ہے ، ‘سر کے بال مونڈنے سے بچے کو طاقت ملتی ہے ، اور جلد کے چھید کھل جاتے ہیں۔ یہ بچے کی بینائی ، سماعت اور بو کے احساس کے لئے بھی فائدہ مند ہے۔"),
            new DataModel("Name", "نام", "The child should be give a good name. According to a hadith, a child is pledged to its Aqeeqa, which is sacrificed on behalf of the child on the seventh day, then it is given a name, and the hair is shaved. (Abu Dawood, Tirmizi). \n" +
                    "From this, it shows that a child must be named on the seventh day. It is also permissible to name a child at birth. In this regard, it is narrated that when Munzir bin Abu Usaid was born, his father took him to the Prophet (صلى الله عليه وآله وسلم), who took the child in his lap and asked the father its name. On being told, he said, ‘No, call him Munzir’. (Bukhari, Muslim).\n" +
                    "It is also reported in a hadith that the Prophet (صلى الله عليه وآله وسلم) said (at the time of the birth of his son Ibraheem), ‘last night a son was born to me, and I have named him Ibraheem after my grandfather, Ibraheem (عليه السلام)’. (Muslim).\n" +
                    "From these, it shows that it is permissible to give the child a name at birth. It must be remembered that the name given to the child must be good, lovely and meaningful. The Prophet (صلى الله عليه وآله وسلم) mentioned that ‘on the day of judgement, people will be called by their names and the names of their fathers. Therefore, a good name must be selected’.(Abu Dawood).\n" +
                    "Children should not be give names that might later on detract from their personality or become a cause of ridicule. The Prophet (صلى الله عليه وآله وسلم) always changed names that were derogatory. (Tirmizi). One must not give name that allude to an ill omen or bad character.\n" +
                    "The name selected for a child must not be a name that is used for Allah. For example, one should not be named with Ahad (The One), Azeez (Mighty), Khaliq (Creator), Razaaq (Nourisher) and other similar attributes which are used for Allah. Instead, while using such names one should compound it with the word Abdul (which means ‘the servant of’). So, Abdul Ahad means the Servant of the One Allah. Abdul Azeez means Servant of the Mighty One, etc. etc.\n" +
                    "When naming children, parents must ensure that the names they select signify servitude to Allah Alone, and not to a false deity.",  "بچے کو ایک اچھا نام دینا چاہئے۔ ایک حدیث کے مطابق ، ایک بچہ اپنے عقیقہ سے گروی رکھتا ہے ، جو ساتویں دن اس بچے کی طرف سے قربان کیا جاتا ہے ، پھر اسے نام دیا جاتا ہے ، اور بال مونڈ جاتے ہیں۔ (ابو داؤد ، ترمذی)\n" +
                    "اس سے ، یہ ظاہر کرتا ہے کہ ساتویں دن کسی بچے کا نام رکھنا ضروری ہے۔ پیدائش کے وقت کسی بچے کا نام لینا بھی جائز ہے۔ اس سلسلے میں روایت ہے کہ جب منذر بن ابو اسید پیدا ہوا تو اس کے والد اسے رسول اللہ صلی اللہ علیہ وسلم کے پاس لے گئے ، انہوں نے بچے کو گود میں لیا اور والد سے اس کا نام پوچھا۔ بتائے جانے پر ، اس نے کہا ، ‘نہیں ، اسے منذر کہلو۔ (بخاری ، مسلم)\n" +
                    "ایک حدیث میں یہ بھی روایت ہے کہ رسول اللہ صلی اللہ علیہ وسلم نے (اپنے بیٹے ابراہیم کی ولادت کے وقت) کہا ، 'کل رات مجھ سے ایک بیٹا پیدا ہوا ، اور میں نے اپنے دادا کے نام پر اس کا نام ابراہیم رکھا ہے۔ ، ابراہیم (علیه السلام) '۔ (مسلمان).\n" +
                    "ان سے یہ ظاہر ہوتا ہے کہ پیدائش کے وقت ہی بچے کو نام دینا جائز ہے۔ یہ یاد رکھنا چاہئے کہ بچے کو دیا گیا نام اچھا ، پیارا اور معنی خیز ہونا چاہئے۔ نبی کریم صلی اللہ علیہ وسلم نے ذکر کیا کہ ‘فیصلے کے دن ، لوگوں کو ان کے نام اور اپنے باپ دادا کے نام سے پکارا جائے گا۔ لہذا ، ایک اچھے نام کا انتخاب کرنا ہوگا ’۔ (ابو داؤد)۔\n" +
                    "بچوں کو ایسے نام نہیں دیئے جانے چاہئیں جو بعد میں ان کی شخصیت سے دور ہوجائیں یا تضحیک کا سبب بنے ہوں۔ نبی اکرم صلی اللہ علیہ وسلم نے ہمیشہ نام بدل دیئے جو توہین آمیز تھے۔ (ترمذی) کسی کو ایسا نام نہیں دینا چاہئے جو کسی خراب شگون یا برے کردار کو ظاہر کرے۔\n" +
                    "کسی بچے کے لئے منتخب کردہ نام وہ نام نہیں ہونا چاہئے جو اللہ کے لئے استعمال ہوتا ہے۔ مثال کے طور پر ، کسی کا نام احد (ایک) ، عزیز (غالب) ، خالق (خالق) ، رزاق (نریشر) اور اسی طرح کی دوسری صفات کے ساتھ نہیں رکھا جانا چاہئے جو اللہ کے لئے استعمال ہوتے ہیں۔ اس کے بجائے ، اس طرح کے نام استعمال کرتے وقت کسی کو عبد (جس کا مطلب ہے کہ ’’ خادم ‘‘) کے ساتھ اس کا مرکب ہونا چاہئے۔ تو ، عبد الاحد کا مطلب ہے ایک اللہ کا بندہ۔ عبد العزیز کا مطلب ہے غالب کا بندہ وغیرہ۔\n" +
                    "بچے کا نام مرتب کرتے وقت ، والدین کو یہ یقینی بنانا ہوگا کہ وہ منتخب کردہ نام صرف اللہ کی بندگی کی نشاندہی کرتے ہیں ، نہ کہ کسی جھوٹے معبود کی۔"),
            new DataModel("Aqeeqah", "عقیقہ", "The Aqeeqah of the child should be done on the seventh day of its birth.\n" +
                    "The Aqeeqah refers to the sacrifice of a goat or sheep on behalf of the child. Regarding this, the Prophet (صلى الله عليه وآله وسلم) is reported to have said, ‘Every child is pledged to its aqeeqah which should be slaughtered on its behalf on the seventh day, the child must be named and have its head shaved on the same day’. (Abu Dawood, Tirmizi).\n" +
                    "The sacrifice on behalf of a boy is two goats (or sheep) and for  girl is one goat (or sheep). (Ahmad, Tirmizi). \n" +
                    "According to the traditions, it is commendable (mustahab) to do a child’s aqeeqah on the seventh day. The Prophet (صلى الله عليه وآله وسلم) performed aqeeqah of Hasan and Husain (his two grandsons) on the seventh day after their birth. It may also be done on the 14th or 21st. day. It is also permissible if done on the 4th, 8th, or 10th day after the birth of the child. If done at a later date, this will be permissible.\n" +
                    "In case of a boy, if a person sacrificed only one goat (or sheep) then the aqeeqah will be valid. According to a hadith recorded by Imam Abu Dawood, it states that the bones of the sacrificial animals must not be broken (that is, animals for Qurbani and Aqeeqa). The act of not breaking the bones is a sign of good omen of health and strength of the child.\n" +
                    "However, no harm is done if someone inadvertently breaks the bones of the animals. The meat can be divided by giving a part to the poor and needy. A part can be given to relatives, friends, neighbors, and a part kept for oneself. A portion can also be given to the midwife or nurse. (Baihaqi). One can use the meat to celebrate the Aqeeqah feast by cooking it and inviting others to eat.\n" +
                    "According to a hadith, while slaughtering the animal of Aqeeqa, one should say, ‘I sacrifice in the name of Allah. O Allah, it is for you alone, and it will return to you. O Allah, this aqeeqah is on behalf of the child- ______ so-and-so (the child’s name should be mentioned). (Ibn Mundhir).\n" +
                    "While explaining the wisdom behind the Aqeeqah, scholars have written that on the birth of a child, an animal is offered in aqeeqah to obtain nearness to Allah and to offer a ransom for the child. The child later intercedes for his parents.", "بچے کی عقیقہ اس کی پیدائش کے ساتویں دن کی جانی چاہئے۔\n" +
                    "عقیقہ سے مراد بچے کی طرف سے بکری یا بھیڑ کی قربانی ہوتی ہے۔ اس کے بارے میں ، نبی اکرم صلی اللہ علیہ وسلم نے ارشاد کیا ہے ، 'ہر بچہ اپنے عقیقہ سے وعدہ کرتا ہے جسے ساتویں دن اس کی طرف سے ذبح کرنا چاہئے ، اس بچے کا نام رکھنا چاہئے اور اس کا سر منڈانا چاہئے ایک ہی دن'. (ابو داؤد ، ترمذی)\n" +
                    "لڑکے کی طرف سے قربانی دو بکرے (یا بھیڑ) ہوتی ہے اور لڑکی کے لئے ایک بکرا (یا بھیڑ) ہوتا ہے۔ (احمد ، ترمذی)\n" +
                    "روایات کے مطابق ، ساتویں دن کسی بچے کا عقیقہ کرنا قابل تعریف ہے (مستحب)۔ نبی اکرم صلی اللہ علیہ وسلم نے ان کی ولادت کے ساتویں دن حسن اور حسین (اپنے دو پوتے) کی عقیقہ ادا کی۔ یہ 14 یا 21 تاریخ کو بھی کیا جاسکتا ہے۔ دن یہ بھی جائز ہے اگر بچے کی پیدائش کے بعد چوتھے ، آٹھویں یا دسویں دن کیا جائے۔ اگر بعد کی تاریخ میں ہوجائے تو ، یہ جائز ہوگا۔\n" +
                    "لڑکے کی صورت میں ، اگر کوئی شخص صرف ایک بکرے (یا بھیڑ) کی قربانی کرے تو عقیقہ صحیح ہوگی۔ امام ابو داؤد کے ذریعہ درج ایک حدیث کے مطابق ، اس میں کہا گیا ہے کہ قربانی کے جانوروں کی ہڈیاں نہیں توڑنی چاہئیں (یعنی قرانی اور عقیقہ کے لئے جانور)۔ ہڈیاں نہ توڑنے کا فعل بچے کی صحت اور طاقت کے اچھے شگون کی علامت ہے۔\n" +
                    "تاہم ، اگر کوئی نادانستہ طور پر جانوروں کی ہڈیاں توڑ دیتا ہے تو کوئی نقصان نہیں ہوتا ہے۔ غریبوں اور مسکینوں کو ایک حصہ دے کر گوشت تقسیم کیا جاسکتا ہے۔ ایک حصہ رشتہ داروں ، دوستوں ، پڑوسیوں اور ایک حصہ اپنے لئے رکھا جاسکتا ہے۔ ایک حصہ دایہ یا نرس کو بھی دیا جاسکتا ہے۔ (بیہقی)۔ کوئی بھی گوشت عقیقہ کی دعوت منانے کے لئے اسے پکا کر اور دوسروں کو کھانے کی دعوت دے کر استعمال کرسکتا ہے۔\n" +
                    "ایک حدیث کے مطابق ، عقیقہ کے جانور ذبح کرتے وقت ، کسی کو یہ کہنا چاہئے ، ‘میں اللہ کے نام پر قربانی کرتا ہوں۔ اے اللہ ، یہ صرف تمہارے لئے ہے ، اور وہ تمہارے پاس لوٹائے گا۔ اے اللہ ، یہ عقیقہ بچے کی طرف سے ہے ______ اسی طرح (اس بچے کا نام ذکر کرنا چاہئے)۔ (ابن منذر)\n" +
                    "عقیقہ کے پیچھے حکمت کی وضاحت کرتے ہوئے علمائے کرام نے لکھا ہے کہ ایک بچے کی پیدائش کے وقت ، ایک جانور کی عقیقہ میں اللہ سے قربت حاصل کرنے اور بچے کے لئے تاوان کی پیش کش کی جاتی ہے۔ بعد میں بچہ اپنے والدین کے لئے شفاعت کرتا ہے۔"),
            new DataModel("Circumcision", "ختنہ", "Circumcision should be done for the baby. Based on the traditions of the Prophet (صلى الله عليه وآله وسلم), the scholars have mentioned that it is Mustahab to do the circumcision of a boy before he attains maturity. It is advisable to do it at the time of aqeeqah, since, at this age the child does not suffer much pain. It is narrated in a tradition that the Prophet (صلى الله عليه وآله وسلم) had the aqeeqah and circumcision of his grandsons, Hasan and Husain (رضی الله عنهم), performed on the seventh day after their birth. (Baihaqi).\n" +
                    "\n" +
                    "While highlighting the wisdom of circumcision, the scholars have written that:\n" +
                    "◉ it distinguishes Muslims from the followers of other religions.\n" +
                    "◉ it also indicates to one’s submission to the injunctions of Allah, and a willingness to carry out His commands.\n" +
                    "◉ it ensures perfect cleanliness.\n" +
                    "◉ it prevents many illnesses.", "بچے کے لئے ختنہ کروانا چاہئے۔ نبی کریم صلی اللہ علیہ وسلم کی روایات کی بنا پر ، علمائے کرام نے ذکر کیا ہے کہ لڑکے کی پختگی ہونے سے پہلے ہی اس کا ختنہ کرنا مستحب ہے۔ عقیقہ کے وقت ایسا کرنے کا مشورہ دیا جاتا ہے ، چونکہ اس عمر میں بچے کو زیادہ تکلیف نہیں ہوتی ہے۔ ایک روایت میں روایت ہے کہ رسول اللہ صلی اللہ علیہ وسلم نے اپنے نواسے حسن اور حسین (رضی اللہ عنہم) کی عقیقہ اور ختنہ ان کی ولادت کے ساتویں دن کیا تھا۔ (بیہقی)۔\n" +
                    "ختنہ کی حکمت کو اجاگر کرتے ہوئے علمائے کرام نے لکھا ہے کہ:\n" +
                    "◉ یہ مسلمانوں کو دوسرے مذاہب کے ماننے والوں سے ممتاز کرتا ہے۔\n" +
                    "◉ اس سے اللہ کے احکامات پر اطاعت اور اس کے احکام پر عمل کرنے کی آمادگی کی بھی نشاندہی ہوتی ہے۔\n" +
                    "◉ یہ کامل صفائی کو یقینی بناتا ہے۔\n" +
                    "◉ یہ بہت ساری بیماریوں سے بچاتا ہے۔"),
    };
    //Newborn Child
    private String CHILD_HEADING_ENGLISH;
    private String CHILD_HEADING_URDU;
    private String CHILD_BORN_DETAIL_ENGLISH;
    private String CHILD_BORN_DETAIL_URDU;

    public DataModel(String CHILD_HEADING_ENGLISH, String CHILD_HEADING_URDU, String CHILD_BORN_DETAIL_ENGLISH, String CHILD_BORN_DETAIL_URDU) {
        this.CHILD_HEADING_ENGLISH = CHILD_HEADING_ENGLISH;
        this.CHILD_HEADING_URDU = CHILD_HEADING_URDU;
        this.CHILD_BORN_DETAIL_ENGLISH = CHILD_BORN_DETAIL_ENGLISH;
        this.CHILD_BORN_DETAIL_URDU = CHILD_BORN_DETAIL_URDU;
    }

    public static DataModel[] QURAN_SURAH_PAGES_LIST = {
            new DataModel("فاتِحَةُ ", "1", "Al-Fatihah (the Opening)", 1),
            new DataModel("البَقَرة", "2", "Al-Baqarah (the Cow)", 1),
            new DataModel("آل عِمران", "45", "Al Imran (the Family of Imran)", 1),
            new DataModel("النِّســاء", "69", "An-Nisa (the Women)", 1),
            new DataModel("المَـائِدة", "95", "Al-Maidah (the Table)", 1),
            new DataModel("الأنْعـام", "115", "Al-Anam (the Cattle)", 1),
            new DataModel("الأعراف", "136", "Al-Araf (the Heights)", 1),
            new DataModel("الأنْفـال", "160", "Al-Anfal (the Spoils of War)", 1),
            new DataModel("التـَّوْبَة", "169", "At-Taubah (the Repentance)", 1),
            new DataModel("يُونُس", "187", "Yunus (Yunus)", 1),
            new DataModel("هُود", "199", "Hud (Hud)", 1),
            new DataModel("يُوسُف", "212", "Yusuf (Yusuf)", 1),
            new DataModel("الرَّعد", "225", "Ar-Ra’d (the Thunder)", 1),
            new DataModel("اِبراهيم", "231", "Ibrahim (Ibrahim)", 1),
            new DataModel("الحِجْر", "237", "Al-Hijr (the Rocky Tract)", 1),
            new DataModel("النًّحل", "242", "An-Nahl (the Bees)", 1),
            new DataModel("الاِسْرآء", "255", "Al-Isra’ (the Night Journey)", 1),
            new DataModel("الكَهْف", "266", "Al-Kahf (the Cave)", 1),
            new DataModel("مَريَم", "277", "Maryam (Maryam)", 1),
            new DataModel("طه", "284", "Ta-Ha (Ta-Ha)", 1),
            new DataModel("الأنْبيآء", "294", "Al-Anbiya’ (the Prophets)", 1),
            new DataModel("الحَجّ", "302", "Al-Haj (the Pilgrimage)", 1),
            new DataModel("المؤمِنون", "311", "Al-Mu’minun (the Believers)", 1),
            new DataModel("النّور", "319", "An-Nur (the Light)", 1),
            new DataModel("الفُرقان", "329", "Al-Furqan (the Criterion)", 1),
            new DataModel("الشُّـعَراء", "335", "Ash-Shu’ara’ (the Poets)", 1),
            new DataModel("النَّـمْل", "345", "An-Naml (the Ants)", 1),
            new DataModel("القَصَص", "354", "Al-Qasas (the Stories)", 1),
            new DataModel("العَنْـكَبُوت", "364", "Al-Ankabut (the Spider)", 1),
            new DataModel("الرُّوم", "371", "Ar-Rum (the Romans)", 1),
            new DataModel("لُقْمان", "377", "Luqman (Luqman)", 1),
            new DataModel("السَّـجْدة", "381", "As-Sajdah (the Prostration)", 1),
            new DataModel("الأحزاب", "383", "Al-Ahzab (the Combined Forces)", 1),
            new DataModel("ســَبَأ", "393", "Saba’ (the Sabeans)", 1),
            new DataModel("فاطِر", "399", "Al-Fatir (the Originator)", 1),
            new DataModel("يــس", "404", "Ya-Sin (Ya-Sin)", 1),
            new DataModel("الصّــافّات", "410", "As-Saffah (Those Ranges in Ranks)", 1),
            new DataModel("ص", "417", "Sad (Sad)", 1),
            new DataModel("الزُّمَر", "422", "Az-Zumar (the Groups)", 1),
            new DataModel("غافر", "431", "Ghafir (the Forgiver)", 1),
            new DataModel("فُصِّلَت", "439", "Fusilat (Distinguished)", 1),
            new DataModel("الشُّوری", "445", "Ash-Shura (the Consultation)", 1),
            new DataModel("الزُّخْرُف", "451", "Az-Zukhruf (the Gold)", 1),
            new DataModel("الدُّخان", "457", "Ad-Dukhan (the Smoke)", 1),
            new DataModel("الجاثِية", "460", "Al-Jathiyah (the Kneeling)", 1),
            new DataModel("الأحقاف", "464", "Al-Ahqaf (the Valley)", 1),
            new DataModel("مُحَمّد", "468", "Muhammad (Muhammad)", 1),
            new DataModel("الفَتْح", "472", "Al-Fat’h (the Victory)", 1),
            new DataModel("الحُجُرات", "477", "Al-Hujurat (the Dwellings)", 1),
            new DataModel("ق", "479", "Qaf (Qaf)", 1),
            new DataModel("الذ ّارِيات", "482", "Adz-Dzariyah (the Scatterers)", 1),
            new DataModel("الطُّور", "485", "At-Tur (the Mount)", 1),
            new DataModel("النَّجْم", "487", " An-Najm (the Star)", 1),
            new DataModel("القَمَر", "490", "Al-Qamar (the Moon)", 1),
            new DataModel("الرَّحمن", "493", "Ar-Rahman (the Most Gracious)", 1),
            new DataModel("الواقِعَة", "496", "Al-Waqi’ah (the Event)", 1),
            new DataModel("الحَديد", "499", "Al-Hadid (the Iron)", 1),
            new DataModel("المُجادَلة", "504", "Al-Mujadilah (the Reasoning)", 1),
            new DataModel("الحَشْر", "507", "Al-Hashr (the Gathering)", 1),
            new DataModel("المُمتَحَنة", "510", "Al-Mumtahanah (the Tested)", 1),
            new DataModel("الصَّف", "513", "As-Saf (the Row)", 1),
            new DataModel("الجُّمُعة", "515", "Al-Jum’ah (Friday)", 1),
            new DataModel("المُنافِقُون", "516", "Al-Munafiqun (the Hypocrites)", 1),
            new DataModel("التَّغابُن", "518", "At-Taghabun (the Loss & Gain)", 1),
            new DataModel("الطَّلاق", "520", "At-Talaq (the Divorce)", 1),
            new DataModel("التَّحْريم", "522", "At-Tahrim (the Prohibition)", 1),
            new DataModel("المُلْك", "524", "Al-Mulk – (the Kingdom)", 1),
            new DataModel("القَلـََم", "526", "Al-Qalam (the Pen)", 1),
            new DataModel("الحَاقّـَة", "529", "Al-Haqqah (the Inevitable)", 1),
            new DataModel("المَعارِج", "531", "Al-Ma’arij (the Elevated Passages)", 1),
            new DataModel("نُوح", "533", "Nuh (Nuh)", 1),
            new DataModel("الجِنّ", "534", "Al-Jinn (the Jinn)", 1),
            new DataModel("المُزَّمّـِل", "537", "Al-Muzammil (the Wrapped)", 1),
            new DataModel("المُدَّثــِّر", "538", "Al-Mudaththir (the Cloaked)", 1),
            new DataModel("القِيامَة", "540", "Al-Qiyamah (the Resurrection)", 1),
            new DataModel("الإنسان", "542", "Al-Insan (the Human)", 1),
            new DataModel("المُرسَلات", "544", "Al-Mursalat (Those Sent Forth)", 1),
            new DataModel("النـَّبأ", "545", "An-Naba’ (the Great News)", 1),
            new DataModel("النـّازِعات", "547", "An-Nazi’at (Those Who Pull Out)", 1),
            new DataModel("عَبَس", "548", "‘Abasa (He Frowned)", 1),
            new DataModel("التـَّكْوير", "550", "At-Takwir (the Overthrowing)", 1),
            new DataModel("الإنفِطار", "551", "Al-Infitar (the Cleaving)", 1),
            new DataModel("المُطـَفِّفين", "552", "Al-Mutaffifin (Those Who Deal in Fraud)", 1),
            new DataModel("الإنشِقاق", "553", "Al-Inshiqaq (the Splitting Asunder)", 1),
            new DataModel("البُروج", "554", "Al-Buruj (the Stars)", 1),
            new DataModel("الطّارق", "555", "At-Tariq (the Nightcomer)", 1),
            new DataModel("الأعلی", "556", "Al-A’la (the Most High)", 1),
            new DataModel("الغاشِيَة", "556", "Al-Ghashiyah (the Overwhelming)", 1),
            new DataModel("الفَجْر", "557", "Al-Fajr (the Dawn)", 1),
            new DataModel("البَـلـَد", "559", "Al-Balad (the City)", 1),
            new DataModel("الشــَّمْس", "559", "Ash-Shams (the Sun)", 1),
            new DataModel("اللـَّيل", "560", "Al-Layl (the Night)", 1),
            new DataModel("الضُّحی", "561", "Adh-Dhuha (the Forenoon)", 1),
            new DataModel("الإنشـِراح", "561", "Al-Inshirah (the Opening Forth)", 1),
            new DataModel("التـِّين", "562", "At-Tin (the Fig)", 1),
            new DataModel("العَلـَق", "562", "Al-‘Alaq (the Clot)", 1),
            new DataModel("القـَدر", "563", "Al-Qadar (the Night of Decree)", 1),
            new DataModel("البَيِّنَة", "563", "Al-Bayinah (the Proof)", 1),
            new DataModel("الزِّلزال", "564", "Az-Zalzalah (the Earthquake)", 1),
            new DataModel("العـَاديات", "564", "Al-‘Adiyah (the Runners)", 1),
            new DataModel("القارِعَة", "565", "Al-Qari’ah (the Striking Hour)", 1),
            new DataModel("التَكاثـُر", "565", "At-Takathur (the Piling Up)", 1),
            new DataModel("العَصْر", "566", "Al-‘Asr (the Time)", 1),
            new DataModel("الهُمَزَة", "566", "Al-Humazah (the Slanderer)", 1),
            new DataModel("الفيل", "566", "Al-Fil (the Elephant)", 1),
            new DataModel("قـُرَيْش", "567", "Quraish (Quraish)", 1),
            new DataModel("الماعُون", "567", "Al-Ma’un (the Assistance)", 1),
            new DataModel("الكـَوْثَر", "567", "Al-Kauthar (the River of Abundance)", 1),
            new DataModel("الكافِرون", "568", "Al-Kafirun (the Disbelievers)", 1),
            new DataModel("النـَّصر", "568", "An-Nasr (the Help)", 1),
            new DataModel("ٱلْمَسَد", "568", "Al-Masad (the Palm Fiber)", 1),
            new DataModel("الإخـْلاص", "569", "Al-Ikhlas (the Sincerity)", 1),
            new DataModel("الفـَلَق", "569", "Al-Falaq (the Daybreak)", 1),
            new DataModel("النـَّاس", "569", "An-Nas (Mankind)", 1),

    };
    private String SURAH_NAME;
    private String SURAH_NAME_ENGLISH;

    //FUNERAL_PRAYER_DUA
    public static final DataModel[] FUNERAL_PRAYER_DUA = {
            new DataModel("Sana(Thana)", "ثناء",
                    "سُبْحَانَكَ اللَّهُمَّ وَبِحَمْدِكَ وَتَبَارَكَ اسْمُكَ وَتَعَالَى جَدُّكَ .وَجَلَّ ثَنَاءُكَ وَلاَ إِلَهَ غَيْرُكَ",
                    "Glory be to You Oh Allah, and praise be to You, and blessed is Your name, and exalted is Your Majesty, and there is none to be served besides You", "اللہ تعالی پاک ہے اور آپ کا حمد ہے ، اور آپ کا نام مبارک ہے ، اور آپ کا شرف بلند ہے ، اور آپ کے سوا کوئی عبادت کرنے والا نہیں ہے", "Subhana kalla humma ,wabe hamdeka ,wata baara kasmoka ,wata aalaa jaddoka, wa jalla sanaoka,wala ilaha gairoka"),
            new DataModel("Durood Sharif", "درود شریف",
                    "َللّٰھُمَّ صَلِّ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا صَلَّیْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ اَللّٰھُمَّ بَارِکْ عَلٰی " +
                            "مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا بَارَکْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ",
                    "O Allah, let Your Blessings come upon Muhammad (Peace Be Upon Him) and the family of Muhammad (Peace Be Upon Him), as you have blessed Ibrahim and his family. Truly, You are Praiseworthy and Glorious. Allah, bless Muhammad and the family of Muhammad, as you have blessed Ibrahim and his family. Truly, You are Praiseworthy and Glorious.",
                    "اے اللہ ، آپ کی رحمتیں محمد صلی اللہ علیہ وآلہ وسلم پر نازل ہوں ، جیسا کہ آپ نے ابراہیم اور ان کے اہل خانہ کو برکت بخشی ہے۔ واقعی ، آپ قابل ستائش اور شان دار ہیں۔ اللہ ، محمد صلی اللہ علیہ وآلہ وسلم  کو اور محمد صلی اللہ علیہ وآلہ وسلم  کے گھر والوں کو بھی برکت عطا فرمائے ، جیسا کہ آپ نے ابراہیم اور اس کے کنبہ کو برکت بخشی ہے۔ واقعی ، آپ قابل ستائش اور شان دار ہیں۔",
                    "Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid. Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid."),

            new DataModel("If the deceased is an adult, male or female, the" + "following Prayer is recited",
                    "اگر مردہ بالغ ، مرد ہو یا عورت ، درج ذیل دعا پڑھی جاتی ہے",
                    "اللهمَّ اغفر لِحينا و مَيّتِناَ و شاهِدنا وغائبِنا و صغيرنا وكبيرِنا وذَكَرِنا وأُنثَانَا" +
                            "للهم مَن احيتَهُ منَّا فأَحيهِ على الإسلام ومَن تَوَفَّيتَهُ مِنَّا فَتَوفَّهُ على الإيمان",
                    "O Allah, forgive our living ones and our deceased" +
                            "ones and those of us who are present and those who" +
                            "are absent, and our young ones and our old ones" +
                            "and our males and our females. O Allah, those of us" +
                            "whom Thou grantest life, keep them firm on Islam," +
                            "and those of us whom Thou causest to die, cause" +
                            "them to die in the faith.", "اے اللہ ہمارے زندہ لوگوں اور ہمارے میتوں کو معاف فرما اور ہم میں سے جو موجود ہیں اور وہ جوغائب ہیں ، اور ہمارے جوان اور ہمارے بوڑھےاور ہمارے مرد اور خواتین۔ اے اللہ ہم میں سے جس کو تو نے زندگی بخش دی ہے ،انہیں اسلام پر قائم رکھو ،اور ہم میں سے جن کو تو موت کا سبب بناتا ہے .اسے ایمان نصیب فرما.",
                    "Allahumaghfir lihayyina wa mayyitina wa shahidina wa gha’ibina wa saghirina wa kabirina, wa Dhakarina wa unthana. Allahumma man ahyaitahu minna fa’ahyihi ‘alal-Islam, wa man tawaffaitahu minna fatawaffahu ‘alal-Iman"),


            new DataModel("Prayer for a deceased non adult Boy",
                    "نابالغ لڑکے کا جنازہ", "اللّهُمَّ اجعَلهُ لَنَا فَرَطًا وَّاجعَلهُ  لَنَا اجرًا وَّذُخرًا وَّاجعَلهُ لَنَا شَافِعًا وَّمُشَفَّعًا"
                    , "O Allah make him our forerunner, and make him, for" + "us, a reward and a treasure, and make him for us a pleader and accept his pleading.",
                    "اے اللہ اس کو ہمارا پیش خیمہ بنا دے ، اور اسے بنا دے " + "ہمارے لئے ، ایک انعام اور ایک خزانہ ، اور اسے ہمارے لئے ایک درخواست گزار بنائیں " + "اور اس کی التجا قبول کریں۔ ", "Allahummaj‘alhu lana furutan, waj‘alhu lana ajran wa dhukhran, waj‘alhu lana shafi‘an wa mushaffa‘"),

            new DataModel("Prayer for a deceased non adult Girl", "نابالغ لڑکی کا جنازہ", "اللّهُمَّ اجعَلهَا لَنَا فَرَطًا وَّاجعَلهَا  لَنَا اجرًا وَّذُخرًا وَّاجعَلهَا لَنَا شَافِعَةً وَّمُشَفَّعَةً.", "O Allah make her one who precedes us to make arrangement for us and make her our reward and our depository and make her an intercessor for us and one who intercession you have accepted", "اے اللہ اس کو ایک بنائے جو ہمارے لئے بندوبست کرے اور اسے ہمارا اجر اور ہماری امانت بنادے اور اسے ہمارے لئے شفاعت بنائے اور وہ شفاعت جسے آپ نے قبول کیا۔", "Allahummaj‘alha lana furutan, waj‘alha lana ajran wa dhukhran, waj‘alha lana shafi‘atan wa mushaffa‘ah"),
    };
    //FUNERAL_PRAYER_PROCESS
    public static final DataModel[] FUNERAL_PRAYER_PROCESS = {
            new DataModel("The Imam commences the Prayer by saying" +
                    " Allahu Akbar, i.e. Allah is the Greatest, loudly. The" +
                    " followers say the same in a low tone. The Imam then" +
                    " recites Thana’ silently. He then" +
                    " says Allahu Akbar without raising his hand. The" +
                    " followers say Allahu Akbar too, but in a low tone." +
                    " Then, the whole congregation recites Durud silently." +
                    " After that the Imam says Allahu Akbar for the third" +
                    " time audibly and the particular prayers for the" +
                    " deceased as given below, are recited. The Imam then" +
                    " says Allahu Akbar for the fourth time and, turning his" +
                    " face towards the right says Assalamu ‘Alaikum wa" +
                    " Rahmatullah, and turning his face towards the left" +
                    " repeats the same to mark the end of the Prayer." +
                    " The followers, too, say Assalamu ‘Alaikum wa" +
                    " Rahmatullah, in a low tone and also turn their faces to" +
                    " the right and left", "امام بلند آواز سے اللہ اکبر (اللہ سب سے بڑا) کہہ کر نماز کا آغاز کرتے ہیں۔ پیروکار دھیمے لہجے میں یہی کہتے ہیں۔ اس کے بعد امام خاموشی سے ثناء کی تلاوت کرتا ہے۔ اس کے بعد وہ اللہ اکبر کو ہاتھ اٹھائے بغیر کہتے ہیں۔ پیروکار بھی اللہ اکبر  کم لہجے میں کہتے ہیں ، پھر پوری جماعت خاموشی سے درود کی تلاوت کرتے ہیں۔ اس کے بعد امام  تیسری بار اللہ اکبر کہتا  اور میت کےلیےدعا پڑھتے ہیں ، اور جماعت بھی خاموشی سے یہی دعا پڑھتے ہیں. اس کے بعد امام چوتھی بار اللہ اکبر کہتا ہے اور چہرا دائیں طرف  اور  بائیں طرف موڑتے ہوئے السلام عليكم ورحمة الله کہتا ہےـ اور جماعت بھی اسی طرح خاموشی سے کہتے ہیں.")


    };
    private String SURAH_PAGE_NUMBER;

    public static final DataModel[] FUNERAL_HEADINGS = {
            new DataModel("How to Perform Funeral", "جنازے کا طریقہ"),
            new DataModel("Funeral Supplications", "جنازے کی دعایں")
    };
    public static final DataModel[] ZAKKAT_HADITH_DETAIL = {
            new DataModel("حَدَّثَنَا حَفْصُ بْنُ عُمَرَ، حَدَّثَنَا شُعْبَةُ، عَنِ ابْنِ عُثْمَانَ بْنِ عَبْدِ اللَّهِ بْنِ مَوْهَبٍ، عَنْ مُوسَى بْنِ طَلْحَةَ، عَنْ أَبِي أَيُّوبَ، رضى الله عنه أَنَّ رَجُلاً، قَالَ لِلنَّبِيِّ صلى الله عليه وسلم أَخْبِرْنِي بِعَمَلٍ يُدْخِلُنِي الْجَنَّةَ\u200F.\u200F قَالَ مَا لَهُ مَا لَهُ وَقَالَ النَّبِيُّ صلى الله عليه وسلم \u200F \"\u200F أَرَبٌ مَالَهُ، تَعْبُدُ اللَّهَ، وَلاَ تُشْرِكُ بِهِ شَيْئًا، وَتُقِيمُ الصَّلاَةَ، وَتُؤْتِي الزَّكَاةَ، وَتَصِلُ الرَّحِمَ \u200F\"\u200F\u200F.\u200F وَقَالَ بَهْزٌ حَدَّثَنَا شُعْبَةُ، حَدَّثَنَا مُحَمَّدُ بْنُ عُثْمَانَ، وَأَبُوهُ، عُثْمَانُ بْنُ عَبْدِ اللَّهِ أَنَّهُمَا سَمِعَا مُوسَى بْنَ طَلْحَةَ، عَنْ أَبِي أَيُّوبَ، بِهَذَا\u200F.\u200F قَالَ أَبُو عَبْدِ اللَّهِ أَخْشَى أَنْ يَكُونَ، مُحَمَّدٌ غَيْرَ مَحْفُوظٍ إِنَّمَا هُوَ عَمْرٌو", "A man said to the Prophet (ﷺ) \"Tell me of such a deed as will make me enter Paradise.\" The people said, \"What is the matter with him? What is the matter with him?\" The Prophet (ﷺ) said, \"He has something to ask. (What he needs greatly) The Prophet (ﷺ) said: (In order to enter Paradise) you should worship Allah and do not ascribe any partners to Him, offer prayer perfectly, pay the Zakat and keep good relations with your Kith and kin.\"", "ایک شخص نے رسول اللہ (صلی اللہ علیہ وآلہ وسلم) سے کہا \"مجھے ایسا کام بتاؤ جو مجھے جنت میں داخل کرے گا۔\" لوگوں نے کہا اس کے ساتھ کیا ہوا ہے اس کے ساتھ کیا ہوا ہے؟ آپ صلی اللہ علیہ وسلم نے فرمایا ، \"اس کے پاس کچھ پوچھنا ہے۔ (جس کی اسے بہت ضرورت ہے) رسول اللہ  نے فرمایا: (جنت میں داخل ہونے کے لئے) آپ کو اللہ کی عبادت کرنا چاہئے اور اس کے ساتھ کسی کا شریک نہیں ہونا چاہئے ، نماز پوری طرح پڑھنا چاہئے۔ ، زکوٰۃادا کرو اور اپنے قرابت داروں سے اچھے تعلقات رکھو۔ \"", "Abu Aiyub", "Sahih al-Bukhari 1396,Book 24, Hadith 2"),
            new DataModel("حَدَّثَنِي مُحَمَّدُ بْنُ عَبْدِ الرَّحِيمِ، حَدَّثَنَا عَفَّانُ بْنُ مُسْلِمٍ، حَدَّثَنَا وُهَيْبٌ، عَنْ يَحْيَى بْنِ سَعِيدِ بْنِ حَيَّانَ، عَنْ أَبِي زُرْعَةَ، عَنْ أَبِي هُرَيْرَةَ ـ رضى الله عنه ـ أَنَّ أَعْرَابِيًّا، أَتَى النَّبِيَّ صلى الله عليه وسلم فَقَالَ دُلَّنِي عَلَى عَمَلٍ إِذَا عَمِلْتُهُ دَخَلْتُ الْجَنَّةَ\u200F.\u200F قَالَ \u200F\"\u200F تَعْبُدُ اللَّهَ لاَ تُشْرِكُ بِهِ شَيْئًا، وَتُقِيمُ الصَّلاَةَ الْمَكْتُوبَةَ، وَتُؤَدِّي الزَّكَاةَ الْمَفْرُوضَةَ، وَتَصُومُ رَمَضَانَ \u200F\"\u200F\u200F.\u200F قَالَ وَالَّذِي نَفْسِي بِيَدِهِ لاَ أَزِيدُ عَلَى هَذَا\u200F.\u200F فَلَمَّا وَلَّى قَالَ النَّبِيُّ صلى الله عليه وسلم \u200F\"\u200F مَنْ سَرَّهُ أَنْ يَنْظُرَ إِلَى رَجُلٍ مِنْ أَهْلِ الْجَنَّةِ فَلْيَنْظُرْ إِلَى هَذَا \u200F\"\u200F\u200F.\u200F حَدَّثَنَا مُسَدَّدٌ، عَنْ يَحْيَى، عَنْ أَبِي حَيَّانَ، قَالَ أَخْبَرَنِي أَبُو زُرْعَةَ، عَنِ النَّبِيِّ صلى الله عليه وسلم بِهَذَا\u200F.", "A Bedouin came to the Prophet (ﷺ) and said, \"Tell me of such a deed as will make me enter Paradise, if I do it.\" The Prophet (p.b.u.h) said, \"Worship Allah, and worship none along with Him, offer the (five) prescribed compulsory prayers perfectly, pay the compulsory Zakat, and fast the month of Ramadan.\" The Bedouin said, \"By Him, in Whose Hands my life is, I will not do more than this.\" When he (the Bedouin) left, the Prophet (ﷺ) said, \"Whoever likes to see a man of Paradise, then he may look at this man.\"", "ایک بدو\n" +
                    " رسول اللہ صلی اللہ علیہ وسلم کے پاس آئے اور کہا کہ مجھے ایسی حرکت کے بارے میں بتاؤ جو مجھے جنت میں داخل کردے ، اگر میں یہ کروں تو۔ نبی (صلی اللہ علیہ وآلہ وسلم) نے فرمایا ، \"اللہ کی عبادت کرو ، اور اس کے ساتھ کسی کی عبادت نہ کرو ، (پانچ) طے شدہ لازمی نماز پوری طور پر ادا کرو ، لازمی زکوٰۃ ادا کرو ، اور ماہ رمضان کے روزے رکھو۔\" بدو\n" +
                    " نے کہا ، \"اس کی قسم ، میری زندگی کس کے ہاتھ میں ہے ، میں اس سے زیادہ کچھ نہیں کروں گا۔\" جب وہ چلے گئے ، رسول اللہ نے فرمایا ، \"جو شخص جنت کے آدمی کو دیکھنا پسند کرے گا تو وہ اس شخص کی طرف دیکھے گا۔\"\n", "Abu Huraira", "Sahih al-Bukhari 1397, Book 24, Hadith 3"),
            new DataModel("حَدَّثَنَا حَجَّاجٌ، حَدَّثَنَا حَمَّادُ بْنُ زَيْدٍ، حَدَّثَنَا أَبُو جَمْرَةَ، قَالَ سَمِعْتُ ابْنَ عَبَّاسٍ ـ رضى الله عنهما ـ يَقُولُ قَدِمَ وَفْدُ عَبْدِ الْقَيْسِ عَلَى النَّبِيِّ صلى الله عليه وسلم فَقَالُوا يَا رَسُولَ اللَّهِ إِنَّ هَذَا الْحَىَّ مِنْ رَبِيعَةَ قَدْ حَالَتْ بَيْنَنَا وَبَيْنَكَ كُفَّارُ مُضَرَ، وَلَسْنَا نَخْلُصُ إِلَيْكَ إِلاَّ فِي الشَّهْرِ الْحَرَامِ، فَمُرْنَا بِشَىْءٍ نَأْخُذُهُ عَنْكَ، وَنَدْعُو إِلَيْهِ مَنْ وَرَاءَنَا\u200F.\u200F قَالَ \u200F\"\u200F آمُرُكُمْ بِأَرْبَعٍ، وَأَنْهَاكُمْ عَنْ أَرْبَعٍ الإِيمَانِ بِاللَّهِ وَشَهَادَةِ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ ـ وَعَقَدَ بِيَدِهِ هَكَذَا ـ وَإِقَامِ الصَّلاَةِ، وَإِيتَاءِ الزَّكَاةِ، وَأَنْ تُؤَدُّوا خُمُسَ مَا غَنِمْتُمْ، وَأَنْهَاكُمْ عَنِ الدُّبَّاءِ وَالْحَنْتَمِ وَالنَّقِيرِ وَالْمُزَفَّتِ \u200F\"\u200F\u200F.\u200F وَقَالَ سُلَيْمَانُ وَأَبُو النُّعْمَانِ عَنْ حَمَّادٍ \u200F\"\u200F الإِيمَانِ بِاللَّهِ شَهَادَةِ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ \u200F\"\u200F\u200F.\u200F", "A delegation of the tribe of `Abdul Qais came to the Prophet (ﷺ) and said, \"O Allah's Messenger (ﷺ)! We are from the tribe of Rabi`a, and the infidels of the tribe of Mudar stands between us and you; so we cannot come to you except during the Sacred Months. Please order us to do something (religious deeds) which we may carry out and also invite to it our people whom we have left behind.\" The Prophet said, \"I order you to do four things and forbid you four others: (I order you) to have faith in Allah, and confess that none has the right to be worshipped but Allah, (and the Prophet (ﷺ) gestured with his hand like this (i.e. one knot) and to offer prayers perfectly and to pay the Zakat, and to pay onefifth of the booty in Allah's Cause. And I forbid you to use Dubba', Hantam, Naqir and Muzaffat (all these are the names of utensils used for preparing alcoholic drinks).\"", "قبیل` عبد القیس کا ایک وفد نبی کریم (کے پاس آیا اور عرض کیا ، یا رسول اللہ (ص) ہم قبیلہ ربیع میں سے ہیں ، اور قبیل موضر کے کافر ہمارے اور آپ کے درمیان کھڑے ہیں۔ لہذا ہم آپ کے پاس مقدس مہینوں کے سوا نہیں آسکتے ہیں۔ براہ کرم ہمیں حکم دیں کہ ہم کچھ (مذہبی اعمال) کریں جو ہم انجام دے سکتے ہیں اور اپنے لوگوں کو بھی دعوت دیں جن کو ہم پیچھے چھوڑ چکے ہیں۔ نبی ﷺ نے فرمایا ، \"میں آپ کو چار چیزیں کرنے کا حکم دیتا ہوں اور آپ کو چار دیگر لوگوں سے منع کرتا ہوں: (میں آپ کو حکم دیتا ہوں کہ) اللہ پر اعتقاد رکھو ، اور اعتراف کرو کہ اللہ کے سوا کسی کی عبادت کرنے کا حق نہیں ہے ، (اور نبی ﷺ نے اشارہ کیا) اس طرح اس کے ہاتھ سے (یعنی ایک گرہ) اور نماز پڑھنے اور زکوٰۃ ادا کرنے اور مال غنیمت میں سے اللہ کا راستہ ادا کرنے کے لئے۔ الکحل مشروبات تیار کرنے کے لئے استعمال ہونے والے برتنوں کے نام)۔ \"", "Ibn `Abbas", "Sahih al-Bukhari 1398,Book 24, Hadith 4"),
            new DataModel("حَدَّثَنَا أَبُو الْيَمَانِ الْحَكَمُ بْنُ نَافِعٍ، أَخْبَرَنَا شُعَيْبُ بْنُ أَبِي حَمْزَةَ، عَنِ الزُّهْرِيِّ، حَدَّثَنَا عُبَيْدُ اللَّهِ بْنُ عَبْدِ اللَّهِ بْنِ عُتْبَةَ بْنِ مَسْعُودٍ، أَنَّ أَبَا هُرَيْرَةَ ـ رضى الله عنه ـ قَالَ لَمَّا تُوُفِّيَ رَسُولُ اللَّهِ صلى الله عليه وسلم وَكَانَ أَبُو بَكْرٍ ـ رضى الله عنه ـ وَكَفَرَ مَنْ كَفَرَ مِنَ الْعَرَبِ فَقَالَ عُمَرُ ـ رضى الله عنه كَيْفَ تُقَاتِلُ النَّاسَ، وَقَدْ قَالَ رَسُولُ اللَّهِ صلى الله عليه وسلم \u200F \"\u200F أُمِرْتُ أَنْ أُقَاتِلَ النَّاسَ حَتَّى يَقُولُوا لاَ إِلَهَ إِلاَّ اللَّهُ\u200F.\u200F فَمَنْ قَالَهَا فَقَدْ عَصَمَ مِنِّي مَالَهُ وَنَفْسَهُ إِلاَّ بِحَقِّهِ، وَحِسَابُهُ عَلَى اللَّهِ \u200F\"\u200F\u200F.\u200F فَقَالَ وَاللَّهِ لأُقَاتِلَنَّ مَنْ فَرَّقَ بَيْنَ الصَّلاَةِ وَالزَّكَاةِ، فَإِنَّ الزَّكَاةَ حَقُّ الْمَالِ، وَاللَّهِ لَوْ مَنَعُونِي عَنَاقًا كَانُوا يُؤَدُّونَهَا إِلَى رَسُولِ اللَّهِ صلى الله عليه وسلم لَقَاتَلْتُهُمْ عَلَى مَنْعِهَا\u200F.\u200F قَالَ عُمَرُ ـ رضى الله عنه ـ فَوَاللَّهِ مَا هُوَ إِلاَّ أَنْ قَدْ شَرَحَ اللَّهُ صَدْرَ أَبِي بَكْرٍ ـ رضى الله عنه ـ فَعَرَفْتُ أَنَّهُ الْحَقُّ\u200F.\u200F", "When Allah's Messenger (ﷺ) died and Abu Bakr became the caliph some Arabs renegade (reverted to disbelief) (Abu Bakr decided to declare war against them), `Umar, said to Abu Bakr, \"How can you fight with these people although Allah's Messenger (ﷺ) said, 'I have been ordered (by Allah) to fight the people till they say: \"None has the right to be worshipped but Allah, and whoever said it then he will save his life and property from me except on trespassing the law (rights and conditions for which he will be punished justly), and his accounts will be with Allah.' \" Abu Bakr said, \"By Allah! I will fight those who differentiate between the prayer and the Zakat as Zakat is the compulsory right to be taken from the property (according to Allah's orders) By Allah! If they refuse to pay me even a she-kid which they used to pay at the time of Allah's Messenger (ﷺ) . I would fight with them for withholding it\" Then `Umar said, \"By Allah, it was nothing, but Allah opened Abu Bakr's chest towards the decision (to fight) and I came to know that his decision was right.\"", "جب اللہ کے رسول (صلی اللہ علیہ وآلہ وسلم) کی وفات ہوئی اور ابوبکر خلیفہ ہوئے تو کچھ عربوں نے تجدید (کفر کی طرف لوٹ لیا) (ابوبکر نے ان کے خلاف جنگ کا اعلان کرنے کا فیصلہ کیا) ، عمر نے ، ابو بکر سے کہا ، \"تم ان لوگوں کے ساتھ کیسے لڑ سکتے ہو حالانکہ اللہ رسول اللہ (صلی اللہ علیہ وآلہ وسلم) نے کہا ، مجھے حکم دیا گیا ہے کہ لوگوں سے لڑو یہاں تک کہ وہ کہتے ہیں: اللہ کے سوا کسی کی عبادت کا حق نہیں ہے ، اور جس نے یہ کہا تو وہ اپنی جان اور مال مجھ سے بچائے گا سوائے اس کے لیے\n" +
                    " کہ قانون کی خلاف ورزی (حقوق اور شرائط جس کے لیے\n" +
                    "اسے انصاف کی سزا دی جائے گی) اور اس کا حساب کتاب اللہ کے پاس ہوگا۔ ' \"ابوبکر نے کہا ، اللہ کی قسم! میں ان لوگوں سے مقابلہ کروں گا جو نماز اور زکوٰۃ کے درمیان فرق کرتے ہیں کیونکہ زکوٰۃ لازمی حق ہے کہ جائداد سے لیا جائے (اللہ کے حکم کے مطابق) اللہ کی قسم! اگر وہ مجھے ایک بچی بھی دینے سے انکار کردیں جو وہ رسول اللہ صلی اللہ علیہ وسلم کے وقت ادا کرتے تھے۔ میں ان کو روکنے کے لئے ان کے ساتھ لڑوں گا \"پھر عمر نے کہا ،\" خدا کی قسم ، یہ کچھ بھی نہیں تھا ، لیکن اللہ نے ابوبکر کا سینہ اس فیصلے (جنگ) کے لئے کھول دیا اور مجھے معلوم ہوا کہ اس کا فیصلہ صحیح تھا۔ \"\n", "Abu Huraira", "Sahih al-Bukhari 1399, 00,Book 24, Hadith 5"),
            new DataModel("حَدَّثَنَا ابْنُ نُمَيْرٍ، قَالَ حَدَّثَنِي أَبِي، حَدَّثَنَا إِسْمَاعِيلُ، عَنْ قَيْسٍ، قَالَ قَالَ جَرِيرُ بْنُ عَبْدِ اللَّهِ بَايَعْتُ النَّبِيَّ صلى الله عليه وسلم عَلَى إِقَامِ الصَّلاَةِ، وَإِيتَاءِ الزَّكَاةِ، وَالنُّصْحِ لِكُلِّ مُسْلِمٍ", "I gave the pledge of allegiance to the Prophet (ﷺ) for offering prayer perfectly, giving Zakat, and giving good advice to every Muslim", "میں نے نبی کریم صلی اللہ علیہ وسلم سے نماز باجماعت ادا کرنے ، زکوٰۃ.\u200F\n" +
                    "دینے اور ہر مسلمان کو اچھی نصیحت کرنے کا بیعت کیا۔\n", "Jarir bin `Abdullah", "Sahih al-Bukhari 01,Book 24, Hadith 6")
    };
    public static DataModel[] SIX_KALIMAS_HEADINGS = {
            new DataModel("كَلِمَاتْ اَلطَّيِّبَة", "Kalimat at-Tayyibah (Word of Purity)"),
            new DataModel("كَلِمَاتْ اَلشَّهَادَة", "Kalimat ash-Shahādah (Word of Testimony)"),
            new DataModel("كَلِمَاتْ اَلتَّمْجِيدْ", "Kalimat at-Tamjīd (Word of Majesty)"),
            new DataModel("كَلِمَاتْ اَلتَّوْحِيدْ", "Kalimat at-Tawhīd (Word of Oneness)"),
            new DataModel("كَلِمَاتْ إِسْتِغْفَارْ", "Kalimat ʾIstighfār (Word of Penitence)"),
            new DataModel("كَلِمَاتْ رَدّْ اَلْكُفْرْ", "Kalimat Radd al-Kufr (Word of Rejection of Disbelief)"),
    };
    public static DataModel[] SIX_KALIMAS = {
            new DataModel("Kalimah Tayyibah", "لَآ اِلٰهَ اِلَّااللهُ مُحَمَّدٌ رَّسُولُ اللہِ", "There is no god but Allah, [and] Muhammad is the messenger of Allah.", "اللہ کے سوا کوئی معبود نہیں ، [اور] محمد  اللہ کے رسول ہیں۔", "'lā ilāha illā -llāh, muḥammadur rasūlu -llāh.", 0),
            new DataModel("Kalimah Shahadah", "اَشْهَدُ اَنْ لَّآ اِلٰهَ اِلَّا اللهُ وَحْدَہٗ لَاشَرِيْكَ لَہٗ وَاَشْهَدُ اَنَّ مُحَمَّدًا عَبْدُهٗ وَرَسُولُہٗ", "I bear witness that (there is) no god except Allah; One is He, no partner hath He, and I bear witness that Muhammad is His Servant and Messenger", "میں گواہی دیتا ہوں کہ اللہ کے سوا کوئی معبود نہیں ہے۔ ایک وہ ہے ، اس کا کوئی شریک نہیں ہے ، اور میں گواہی دیتا ہوں کہ محمد اس کا خادم اور رسول ہے", "Ašhadu al lā ilāha illā-llāhu waḥdahu lā šarīka lahu, wa ašhadu anna muḥammadan ʿabduhu wa rasūluh.", 0),
            new DataModel("Kalimah Tamjeed", " سُبْحَان اللهِ وَالْحَمْدُلِلّهِ وَلا إِلهَ إِلّااللّهُ وَاللّهُ أكْبَرُ وَلا حَوْلَ وَلاَ قُوَّةَ إِلَّا بِاللّهِ الْعَلِيِّ الْعَظِيْم", "Exalted is Allah, and [all] praise is due to Allah, and there is no deity except Allah, and Allah is the Greatest. And there is no might nor power except in Allah, the Most High, the Most Great.", "اللہ سبحانہ وتعالی ہے ، اور [تمام] تعریف اللہ ہی کے لئے ہے ، اور اللہ کے سوا کوئی معبود نہیں ، اور اللہ سب سے بڑا ہے۔ اور نہ ہی کوئی طاقت اور طاقت ہے سوائے اللہ کے ، جو سب سے زیادہ اعلی ، عظیم ہے۔", "Subḥāna-llāhi, wa-l-ḥamdu li-llāhi, wa lā ilāha illā-llāhu, Wa-llāhu akbar, Wa lā ḥawla wa lā quwwata illā bi-llāhi-l-ʿalīyyi-l-ʿaẓīm.", 0),
            new DataModel("Kalimah Tawheed", " لَآ اِلٰهَ اِلَّاللهُ وَحْدَهٗ لَا شَرِيْكَ لَهٗ لَهُ الْمُلْكُ وَ لَهُ الْحَمْدُ يُحْىٖ وَ يُمِيْتُ وَ هُوَحَیٌّ لَّا يَمُوْتُ اَبَدًا اَبَدًاؕ ذُو الْجَلَالِ وَالْاِكْرَامِؕ بِيَدِهِ الْخَيْرُؕ وَهُوَ عَلٰى كُلِّ شیْ ٍٔ قَدِیْرٌؕ", "There is none worthy of worship except Allah. He is Alone and has no partners. To Him belongs the Kingdom and for Him is all Praise. He gives life and causes death. He is eternal and ubiquitous. He of Majesty and Munificence. In His Hand is all good. And He has power over everything.", "اللہ کے سوا عبادت کے لائق کوئی نہیں۔ وہ تنہا ہے اور اس کا کوئی شریک نہیں ہے۔ اسی کی بادشاہی ہے اور اسی کے لئے سب تعریف ہے۔ وہ زندگی دیتا ہے اور موت کا سبب بنتا ہے۔ وہ ابدی اور ہر جگہ ہے۔ وہ عظمت و فراست کا۔ سب کچھ اس کے ہاتھ میں ہے۔ اور وہ ہر چیز پر قدرت رکھتا ہے", "lā ilāha illā-llāhu waḥdahu lā sharīka lahu lahu l-mulku wa lahu l-ḥamdu yuḥyi wa yumītu wa huwa ḥayyul lā yamūtu abadan abada ḏhu l-jalāli wa l-ʾikrām biyadihi-l k͟hayr wa-huwa ʿala-kulli shayʾin qadīr.", 0),
            new DataModel("Kalimah Istighfar", " اَسْتَغْفِرُاللهِ رَبِّىْ مِنْ كُلِِّ ذَنْۢبٍ اَذْنَبْتُهٗ عَمَدًا اَوْ خَطَا ًٔ سِرًّا اَوْ عَلَانِيَةً وَّاَتُوْبُ اِلَيْهِ مِنَ الذَّنْۢبِ الَّذِیْٓ اَعْلَمُ وَ مِنَ الذَّنْۢبِ الَّذِىْ لَآ اَعْلَمُ اِنَّكَ اَنْتَ عَلَّامُ الْغُيُوْبِ وَ سَتَّارُ الْعُيُوْبِ و َغَفَّارُ الذُّنُوْبِ وَ لَا حَوْلَ وَلَا قُوَّةَ اِلَّا بِاللهِ الْعَلِىِِّ الْعَظِيْمِؕ", "I seek forgiveness from Allah, my Lord, from every sin I committed knowingly or unknowingly, secretly or openly, and I turn towards Him from the sin that I know and from the sin that I do not know. Certainly You, You (are) the knower of the hidden things and the Concealer (of) the mistakes and the Forgiver (of) the sins. And (there is) no power and no strength except from Allah, the Most High, the Most Great.", "میں جانتا ہوں یا جان بوجھ کر ، خفیہ یا کھلم کھلا ہر گناہ سے اللہ رب العزت سے معافی چاہتا ہوں ، اور میں اس گناہ سے اس کی طرف متوجہ ہوں جس کا مجھے علم ہے اور میں اس گناہ سے نہیں جانتا ہوں۔ یقینا  تم ، چھپی ہوئی باتوں کے جاننے والے اور غلطیوں کو چھپانے والے اور گناہوں کو معاف کرنے والے ہو اور نہ ہی کوئی طاقت اور طاقت ہے سوائے اللہ ہی کی طرف سے ، جو سب سے زیادہ غالب ، عظیم ہے۔", "astaġhfiru-llāha rabbī min kulli thanbin athnabtuhu ʿamadan ʾaw k͟haṭāʾan sirran ʾaw ʿalāniyyataw wa atūbu ʾilayhi minal ḏhanbi-llaḏhī aʿlamu wa minal ḏhanbi-llaḏhī lā aʿlamu innaka ʾanta ʿallāmul-ġhuyūbi wa sattārul-ʿuyūbi wa ġhaffāru ḏhunūbi wa lā ḥawla wa lā quwwata illā billāhil-ʿalīyyil-ʿaẓīm.", 0),
            new DataModel("Kalima Radde Kufr", " اَللّٰهُمَّ اِنِّیْٓ اَعُوْذُ بِكَ مِنْ اَنْ اُشْرِكَ بِكَ شَيْئًا وَّاَنَآ اَعْلَمُ بِهٖ وَ اَسْتَغْفِرُكَ لِمَا لَآ اَعْلَمُ بِهٖ تُبْتُ عَنْهُ وَ تَبَرَّأْتُ مِنَ الْكُفْرِ وَ الشِّرْكِ وَ الْكِذْبِ وَ الْغِيْبَةِ وَ الْبِدْعَةِ وَ النَّمِيْمَةِ وَ الْفَوَاحِشِ وَ الْبُهْتَانِ وَ الْمَعَاصِىْ كُلِِّهَا وَ اَسْلَمْتُ وَ اَقُوْلُ لَآ اِلٰهَ اِلَّا اللهُ مُحَمَّدٌ رَّسُوْلُ اللهِؕ", "O Allah! I seek protection in You from that I should not join any partner with You and I have knowledge of it. I seek Your forgiveness from that which I do not know. I repent from it (ignorance) and I reject disbelief and joining partners with You and of falsehood and slandering and innovation in religion and tell-tales and evil deeds and the blame and the disobedience, all of them. I submit to Your will and I believe and I declare: There is none worthy of worship except Allah and Muhammad is His Messenger.", "اے اللہ! میں آپ سے حفاظت چاہتا ہوں کہ مجھے آپ کے ساتھ کسی شریک میں شامل نہیں ہونا چاہئے اور مجھے اس کا علم ہے۔ میں اس سے معافی چاہتا ہوں جس کا مجھے علم نہیں ہے۔ میں اس سے (لاعلمی) سے توبہ کرتا ہوں اور میں کفر اور آپ کے ساتھ شریک ہونے اور دین میں جھوٹ اور غیبت اور بدعت کی باتیں کرتا ہوں ، کہانیاں اور برے کاموں اور الزام تراشی اور نافرمانی ، ان سب سے۔ میں آپ کی مرضی کے تابع ہوں اور میں یقین کرتا ہوں اور میں اعلان کرتا ہوں: اللہ کے سوا کوئی قابل لائق نہیں ہے اور محمد اس کا رسول ہیں۔", "Allāhumma innī aʿūḏhu bika min an ušrika bika šayʾaw-wwa-anā aʿlamu bihi wa-staġhfiruka limā lā aʿlamu bihi tubtu ʿanhu wa tabarra'tu mina-l-kufri wa-š-širki wa-l-kiḏhbi wa-l-ġhībati wa-l-bidʿati wa-nnamīmati wa-l-fawāḥiši wa-l-buhtāni wa-l-maʿāṣī kullihā wa aslamtu wa aqūlu lā ilāha illā-llāhu Muḥammadu-r-rasūlu llāh.", 0),
    };






    public static final DataModel[] NOORANI_QAIDA = {
            new DataModel("0", "1", 'x'),
            new DataModel("1", "5", 'x'),
            new DataModel("2", "6", 'x'),
            new DataModel("3", "9", 'x'),
            new DataModel("4", "10", 'x'),
            new DataModel("5", "11", 'x'),
            new DataModel("6", "12", 'x'),
            new DataModel("7", "13", 'x'),
            new DataModel("8", "14", 'x'),
            new DataModel("9", "15", 'x'),
            new DataModel("10", "16", 'x'),
            new DataModel("11", "17", 'x'),
            new DataModel("12", "19", 'x'),
            new DataModel("13", "21", 'x'),
            new DataModel("14", "22", 'x'),
            new DataModel("15", "25", 'x'),
            new DataModel("16", "26", 'x'),
            new DataModel("17", "29", 'x'),
            new DataModel("18", "31", 'x'),
            new DataModel("19", "34", 'x'),
            new DataModel("20", "36", 'x'),
            new DataModel("21", "37", 'x'),
            new DataModel("22", "37", 'x'),
            new DataModel("23", "39", 'x'),
            new DataModel("24", "41", 'x'),
            new DataModel("25", "42", 'x'),
            new DataModel("26", "44", 'x'),
            new DataModel("27", "45", 'x'),
            new DataModel("28", "47", 'x'),
            new DataModel("29", "48", 'x'),
            new DataModel("30", "50", 'x'),
            new DataModel("31", "51", 'x'),
            new DataModel("32", "52", 'x'),
            new DataModel("33", "53", 'x'),
    };


    //Noorani Qaida
    private String LESSON_NO;
    private String PAGE_NO;
    private char c;

    public DataModel(String LESSON_NO, String PAGE_NO, char c) {
        this.LESSON_NO = LESSON_NO;
        this.PAGE_NO = PAGE_NO;
        this.c = c;
    }


    //Quran surah pages list
    private int EXTRA;
    private String FUNERAL_DUA_HEADING_ENGLISH;
    private String FUNERAL_DUA_HEADING_URDU;
    private String FUNERAL_DUA;
    private String FUNERAL_DUA_MEANING_ENGLISH;
    private String FUNERAL_DUA_MEANING_URDU;
    private String FUNERAL_DUA_TRANSLITERATION;

    public DataModel(String ZAKKAT_HADITH_REFERENCE_ARABIC, String ZAKKAT_HADITH_REFERENCE_TRANSLATION_ENGLISH, String ZAKKAT_HADITH_REFERENCE_TRANSLATION_URDU, String ZAKKAT_HADITH_NARRATED_BY, String ZAKKAT_HADITH_REFERENCE) {
        this.ZAKKAT_HADITH_REFERENCE_ARABIC = ZAKKAT_HADITH_REFERENCE_ARABIC;
        this.ZAKKAT_HADITH_REFERENCE_TRANSLATION_ENGLISH = ZAKKAT_HADITH_REFERENCE_TRANSLATION_ENGLISH;
        this.ZAKKAT_HADITH_REFERENCE_TRANSLATION_URDU = ZAKKAT_HADITH_REFERENCE_TRANSLATION_URDU;
        this.ZAKKAT_HADITH_NARRATED_BY = ZAKKAT_HADITH_NARRATED_BY;
        this.ZAKKAT_HADITH_REFERENCE = ZAKKAT_HADITH_REFERENCE;
    }

    public DataModel(String FUNERAL_DUA_HEADING_ENGLISH, String FUNERAL_DUA_HEADING_URDU, String FUNERAL_DUA, String FUNERAL_DUA_MEANING_ENGLISH, String FUNERAL_DUA_MEANING_URDU, String FUNERAL_DUA_TRANSLITERATION) {
        this.FUNERAL_DUA_HEADING_ENGLISH = FUNERAL_DUA_HEADING_ENGLISH;
        this.FUNERAL_DUA_HEADING_URDU = FUNERAL_DUA_HEADING_URDU;
        this.FUNERAL_DUA = FUNERAL_DUA;
        this.FUNERAL_DUA_MEANING_ENGLISH = FUNERAL_DUA_MEANING_ENGLISH;
        this.FUNERAL_DUA_MEANING_URDU = FUNERAL_DUA_MEANING_URDU;
        this.FUNERAL_DUA_TRANSLITERATION = FUNERAL_DUA_TRANSLITERATION;
    }

    public DataModel(String FUNERAL_PRAYER_PROCESS_IN_ENGLISH, String FUNERAL_PRAYER_PROCESS_IN_URDU) {
        this.FUNERAL_PRAYER_PROCESS_IN_ENGLISH = FUNERAL_PRAYER_PROCESS_IN_ENGLISH;
        this.FUNERAL_PRAYER_PROCESS_IN_URDU = FUNERAL_PRAYER_PROCESS_IN_URDU;
    }

    public DataModel(String KALIMAH_NAME, String KALIMAH_IN_ARABIC, String KALIMAH_TRANSLATION_IN_ENGLISH,
                     String KALIMAH_TRANSLATION_IN_URDU, String KALIMAH_TRANSLITERATION, int justNumber) {
        this.KALIMAH_NAME = KALIMAH_NAME;
        this.KALIMAH_IN_ARABIC = KALIMAH_IN_ARABIC;
        this.KALIMAH_TRANSLATION_IN_ENGLISH = KALIMAH_TRANSLATION_IN_ENGLISH;
        this.KALIMAH_TRANSLATION_IN_URDU = KALIMAH_TRANSLATION_IN_URDU;
        this.KALIMAH_TRANSLITERATION = KALIMAH_TRANSLITERATION;
        this.justNumber = justNumber;
    }

    public DataModel(String SURAH_NAME, String SURAH_PAGE_NUMBER, String SURAH_NAME_ENGLISH, int EXTRA) {
        this.SURAH_NAME = SURAH_NAME;
        this.SURAH_PAGE_NUMBER = SURAH_PAGE_NUMBER;
        this.SURAH_NAME_ENGLISH = SURAH_NAME_ENGLISH;
        this.EXTRA = EXTRA;
    }

    public String getZAKKAT_HADITH_REFERENCE_ARABIC() {
        return ZAKKAT_HADITH_REFERENCE_ARABIC;
    }

    public String getZAKKAT_HADITH_REFERENCE_TRANSLATION_ENGLISH() {
        return ZAKKAT_HADITH_REFERENCE_TRANSLATION_ENGLISH;
    }

    public String getZAKKAT_HADITH_REFERENCE_TRANSLATION_URDU() {
        return ZAKKAT_HADITH_REFERENCE_TRANSLATION_URDU;
    }

    public String getZAKKAT_HADITH_NARRATED_BY() {
        return ZAKKAT_HADITH_NARRATED_BY;
    }

    public String getZAKKAT_HADITH_REFERENCE() {
        return ZAKKAT_HADITH_REFERENCE;
    }

    public String getFUNERAL_PRAYER_PROCESS_IN_ENGLISH() {
        return FUNERAL_PRAYER_PROCESS_IN_ENGLISH;
    }

    public String getFUNERAL_PRAYER_PROCESS_IN_URDU() {
        return FUNERAL_PRAYER_PROCESS_IN_URDU;
    }

    public String getKALIMAH_IN_ARABIC() {
        return KALIMAH_IN_ARABIC;
    }

    public String getKALIMAH_TRANSLATION_IN_ENGLISH() {
        return KALIMAH_TRANSLATION_IN_ENGLISH;
    }

    public String getKALIMAH_TRANSLATION_IN_URDU() {
        return KALIMAH_TRANSLATION_IN_URDU;
    }

    public String getKALIMAH_TRANSLITERATION() {
        return KALIMAH_TRANSLITERATION;
    }

    public String getKALIMAH_NAME() {
        return KALIMAH_NAME;
    }

    public String getFUNERAL_DUA_HEADING_ENGLISH() {
        return FUNERAL_DUA_HEADING_ENGLISH;
    }

    public String getFUNERAL_DUA_HEADING_URDU() {
        return FUNERAL_DUA_HEADING_URDU;
    }

    public String getFUNERAL_DUA() {
        return FUNERAL_DUA;
    }

    public String getFUNERAL_DUA_MEANING_ENGLISH() {
        return FUNERAL_DUA_MEANING_ENGLISH;
    }

    public String getFUNERAL_DUA_MEANING_URDU() {
        return FUNERAL_DUA_MEANING_URDU;
    }

    public String getFUNERAL_DUA_TRANSLITERATION() {
        return FUNERAL_DUA_TRANSLITERATION;
    }

    public String getSURAH_NAME() {
        return SURAH_NAME;
    }

    public String getSURAH_PAGE_NUMBER() {
        return SURAH_PAGE_NUMBER;
    }

    public String getSURAH_NAME_ENGLISH() {
        return SURAH_NAME_ENGLISH;
    }


    public String getLESSON_NO() {
        return LESSON_NO;
    }

    public String getPAGE_NO() {
        return PAGE_NO;
    }

    public String getCHILD_HEADING_ENGLISH() {
        return CHILD_HEADING_ENGLISH;
    }

    public String getCHILD_HEADING_URDU() {
        return CHILD_HEADING_URDU;
    }

    public String getCHILD_BORN_DETAIL_ENGLISH() {
        return CHILD_BORN_DETAIL_ENGLISH;
    }

    public String getCHILD_BORN_DETAIL_URDU() {
        return CHILD_BORN_DETAIL_URDU;
    }
}
