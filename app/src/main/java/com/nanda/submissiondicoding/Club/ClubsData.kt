package com.nanda.submissiondicoding.Club

import com.nanda.submissiondicoding.R

object ClubsData {

    private val clubNames = arrayOf("Bayern Munchen",
    "Manchester United",
    "Manchester City",
    "Real Madrid",
    "Tottenham Hotspurs",
    "Liverpool",
    "Leicester City",
    "Chelsea",
    "Barcelona",
    "Arsenal")

    private val clubDetails = arrayOf("Fußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern München (pengucapan bahasa Jerman: [ʔɛf ˈt͡seː ˈbaɪ̯ɐn ˈmʏnçən]), FC Bayern Minga (dalam bahasa Bayern), atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bayern. Hal ini terkenal karena tim sepak bola profesional yang membantai Klub Raksasa Spanyol yaitu Barcelona dengan Skor 8-2 yang bermain di La Liga, peringkat teratas sistem liga sepak bola Jerman, dan merupakan klub paling sukses dalam sejarah sepak bola Jerman, setelah memenangkan rekor 31 gelar nasional dan 20 piala nasional.",
    "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.",
    "Manchester City Football Club (dikenal pula sebagai Man City atau The Citizens) adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester.",
    "Real Madrid Club de Fútbol (pengucapan bahasa Spanyol: [reˈal maˈðɾið ˈkluβ ðe ˈfutβol]; Royal Madrid Football Club), umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol.\n" +
            "\n" +
            "Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih. Kata Real (\"dari kerajaan\") Spanyol dan dianugerahkan ke klub oleh Raja Alfonso XIII pada tahun 1920 bersama-sama dengan mahkota kerajaan di lambang klub. Klub ini telah memainkan pertandingan kandang di Stadion Santiago Bernabéu dengan kapasitas 85.454 di pusat kota Madrid sejak tahun 1947.",
    "Tottenham Hotspur Football Club /ˈtɒtənəm/,[2][3] adalah klub sepak bola yang berasal dari Tottenham, sebuah daerah yang berada di wilayah utara London. Mereka juga dikenal sebagai Spurs, The Spurs dan Tottenham, sementara penggemar mereka memberi mereka nama the Lilywhites karena seragam tradisional mereka yang berwarna putih.",
    "Liverpool Football Club /ˈlɪvərpuːl/ (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris.\n" +
            "\n" +
            "Liverpool didirikan pada tahun 1892 dan bergabung dengan Football League pada tahun berikutnya. Klub ini telah bermain di Stadion Anfield sejak pembentukannya yang terletak sekitar 4,8 km dari pusat kota Liverpool.",
    "Dibentuk pada tahun 1884 oleh sekelompok pemuda Wyggeston School sebagai \"Leicester Fosse\", klub bergabung dengan Asosiasi Sepak Bola Inggris pada tahun 1890. Sebelum pindah ke Jalan Filbert pada tahun 1891, klub bermain di lima tempat yang berbeda, termasuk Victoria Park sebelah tenggara dari pusat kota dan di Belgrave Road Cricket and Bicycle Grounds. klub juga bergabung dengan Liga Midland pada tahun 1891, dan terpilih ke Divisi Dua pada 1894 setelah finish diperingkat kedua. pertandingan perdanadi Liga, Leicester mengalami kekalahan 4-3 di Grimsby Town, dengan kemenangan di Liga perdana mereka di minggu berikutnya, melawan Rotherham United di Filbert Street. di musim yang sama juga mereka meraih kemenangan terbesar klub hingga saat ini yakni kemenangan 13-0 atas Notts Olympic dalam pertandingan kualifikasi Piala FA. Pada musim 1907-08 klub mengakhiri sebagai runner-up Divisi II, dan meraih promosi ke Divisi utama, kasta tertinggi sepak bola Inggris. Namun, klub terdegradasi hanya dalam satu musim, dan meraih rekor kekalahan terbesar pada musim itu yakni kalah 12-0 melawan Nottingham Forest.",
    "Chelsea Football Club /ˈtʃɛlsiː/ adalah sebuah klub sepak bola yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.\n" +
            "\n" +
            "Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih pada dekade 1960-an, 1970-an, 1990-an, dan 2000-an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam gelar juara Liga Utama Inggris, delapan Piala FA, lima Piala Liga, dua Liga Eropa UEFA, dua Piala Winners UEFA, dua Liga Champions UEFA, dan dua Piala Super UEFA.[3] Dalam dua dekade terakhir merupakan periode terbaik kesuksesan Chelsea dengan meraih lebih dari 30 gelar sejak tahun 1997, termasuk untuk pertama kali meraih gelar ganda, Liga Utama Inggris dan Piala FA pada tahun 2010 serta gelar juara Liga Champions UEFA pada tahun 2012 dan 2021; gelar juara Liga Eropa UEFA pada 2013 dan 2019.[4][5]",
    "Fútbol Club Barcelona, juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol.\n" +
            "\n" +
            "Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris, Jerman dan Katalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto \"Més que un club\" (Lebih dari sebuah klub). Tidak seperti banyak klub sepak bola lainnya, para pendukung memiliki dan mengoperasikan Barcelona. Ia adalah klub sepak bola kedua terkaya di dunia dalam hal pendapatan, dengan omzet tahunan sebesar €560,8 juta dan kedua yang paling berharga, senilai \$3,56 miliar.[2][3] Lagu kebangsaan resmi Barcelona adalah \"Cant del Barça\", yang ditulis oleh Jaume Picas dan Josep Maria Espinas.",
    "Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. Didirikan pada 1886 dengan nama Dial Square. Klub ini bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris, yang telah memenangkan 13 gelar kasta utama Liga Inggris (10 pada era Divisi Pertama dan 3 pada era Premier League) dan 14 gelar di Piala FA (Gelar paling banyak). Arsenal memegang rekor untuk periode terpanjang berada di kasta puncak Liga Inggris tanpa pernah terdegradasi sejak musim 1919 dan menjadi tim pada peringkat pertama dalam klasemen Liga Inggris sepanjang abad ke-20.[3] Arsenal menjadi tim kedua di Inggris yang menyelesaikan semusim liga tanpa kalah (musim 2003–04) dan tim pertama yang melakukannya pada era di mana satu musim berlangsung 38 pertandingan.")

    private val clubImages = intArrayOf(R.drawable.munchen,
    R.drawable.mu,
    R.drawable.mc,
    R.drawable.madrid,
    R.drawable.spurs,
    R.drawable.liverpool,
    R.drawable.leicester,
    R.drawable.chelsea,
    R.drawable.barca,
    R.drawable.arsenal)

    val listData : ArrayList<Club>
        get() {
            val list = arrayListOf<Club>()
            for (position in clubNames.indices){
                val club = Club()
                club.name = clubNames[position]
                club.detail = clubDetails[position]
                club.photo = clubImages[position]
                list.add(club)
            }
            return list
        }
}