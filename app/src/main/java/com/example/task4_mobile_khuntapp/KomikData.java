package com.example.task4_mobile_khuntapp;

import java.util.ArrayList;

public class KomikData {
    private static String Title [] = {
            "One Piece",
            "Begining After The End",
            "Haikyuu",
            "Last Human",
            "Solo Leveling",
            "Konosuba",
            "Thomb Rider King"
    };
    private  static  int HeroImages[] = {
            R.drawable.op,
            R.drawable.begining,
            R.drawable.haikyuu,
            R.drawable.last,
            R.drawable.sl,
            R.drawable.konosuba,
            R.drawable.thomb
    };
    private static String Genre [] = {
            "Shounen, Action, Comedy",
            "Action, Fantasy",
            "Sport, Shounen",
            "Thriller, Action",
            "Action, Fantasy",
            "Comedy, Fantasy",
            "Fantasy, Action"
    };
    private static String Tipe [] = {
            "Manga",
            "Manhwa",
            "Manga",
            "Manhua",
            "Manhwa",
            "Manga",
            "Manhwa"
    };

    private static String Descrition [] = {
        "Bercerita tentang seorang laki-laki bernama Monkey D. Luffy, yang menentang arti dari gelar bajak laut. Daripada kesannama besar, kejahatan, kekerasan, dia lebih terlihat seperti bajak laut rendahan yang suka bersenang-senang, alasanLuffy menjadi bajak laut adalah tekadnya untuk berpetualang di lautan yang menyenangkan dan bertemu orang-orangbaru dan menarik, sertabersama-sama mencari One Piece.",
        "King Grey memiliki kekuatan, kekayaan, dan prestise yang tak tertandingi di dunia yang diatur oleh kemampuan bela diri. Namun, kesunyian masih melekat di belakang mereka yang memiliki kekuatan besar. Di bawah eksterior glamor seorang raja yang kuat mengintai cangkang manusia, tanpa tujuan dan kemauan. Bereinkarnasi ke dunia baru yang penuh dengan sihir dan monster, raja memiliki kesempatan kedua untuk menghidupkan kembali hidupnya. Namun, mengoreksi kesalahan masa lalunya tidak akan menjadi satu-satunya tantangan. Di bawah kedamaian dan kemakmuran dunia baru adalah ancaman arus bawah untuk menghancurkan segala sesuatu yang telah ia usahakan, mempertanyakan peran dan alasan kelahiran kembali.",
        "Bercerita pada seorang anak SMP yaitu Shouyo Hinata yang sangat sekali menyukai Volleyball. Klubnya di SMP tak punya satu pun member,hingga akhirnya ketika dia masuk kelas 3 SMP dia mendapatkan 3 orang anggota dari kelas 1 dan meminta bantuan kepada kedua teman sekelasnya di klub lain untuk mengikuti pertandingan reguler. Namun dipertandingan pertamanya itu Hinata langsung menghadapi klub favorit yang mempunyai pemain dengan julukan “KING Of The Court” Kageyama Tobio, dan untuk membalaskan kekalahan pertamanya di pertandingan pertama dan terakhir Hinata di SMP, Hinata berniat untuk melampauinya dengan Masuk SMA Karasuno dimana SMA itu adalah sekolah seorang pemain yang menjadi idola/penggerak (pemain itu dijuluki “Small Giant”) Hinata menyukai Volleyball sewaktu SD. Tapi ternyata Rivalnya Kageyama Tobio yang menjadi incaran balas dendamnya juga masuk di SMA yang sama",
        "Zuo Tianchen adalah manusia terakhir yang hidup di kota yang terinfeksi zombi. Ketika dia akan mati, jiwanya kembali ke waktu tepat sebelum bencana yang ditakdirkan itu terjadi 10 tahun yang lalu. Dia bersumpah, kali ini dia akan melindungi orang-orang yang harus dia lindungi dan bertemu lagi dengan kekasihnya di masa lalu. Saksikanlah perjuangannya untuk terus bertahan hidup disenjatai dengan ingatannya akan 10 tahun yang akan terjadi!",
            "10 tahun yang lalu, setelah \"Gerbang\" yang terhubung ke dunia dengan dunia monster dibuka, beberapa hal yang biasa, setiap hari orang menerima kekuatan untuk memburu monster di dalam Gerbang. Mereka dikenal sebagai \"Pemburu(Hunter)\". Namun, tidak semua Pemburu kuat. Nama saya Sung Jin-Woo, Hunter E-rank. Saya seseorang yang harus mempertaruhkan nyawanya di dugeon paling rendah, \"Terlemah Di Dunia\".",
    "Menceritakan tentang kehidupan Satou Kazuma, seorang hikikomori yang menyukai game namun hidupnya terlalu cepat berakhir akibat sebuah kecelakaan lalu lintas. harusnya memang benar-benar telah berakhir, tetapi saat ia terbangun di alam baka kazuma bertemu dengan seorang gadis cantik yang menyebut dirinya seorang dewi bernama aqua. aqua menjelaskan sebab kematian yang dialami kazuma karena syok dan menertawainya. ",
            "omb Raider King bercerita tentang Soo Jeo-heon, seorang pemburu relik, yang dikhianati atasannya, seorang bos organisasi pemburu. Ia mendapat kesempatan kedua untuk mengulang petualangannya dan membalas dendam. ",
    };



    public static ArrayList<Komik> getListData(){
        ArrayList<Komik> list = new ArrayList<>();
        for (int position = 0; position < Title.length; position++){
            Komik komik = new Komik();
            komik.setTitle(Title[position]);
            komik.setGenre(Genre[position]);
            komik.setTipe(Tipe[position]);
            komik.setSinopsis(Descrition[position]);
            komik.setPoster(HeroImages[position]);
            list.add(komik);
        }
        return list;
    };
}
