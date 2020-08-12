package com.example.tugas_uas_akb_if3_10117087.Database;

import android.content.Context;

/** NIM : 10117087
   Nama : AhmadMaula
   Kelas : IF-3
 **/

public class TambahWisata {

    private static DatabaseHelper databaseHelper;

    public TambahWisata(Context context){

        databaseHelper = new DatabaseHelper(context);
  //      Log.d("insert", "inserting data");
        databaseHelper.save(new Wisata(1, "Tebing Keraton",
                "Ciburial, Kec. Cimenyan, Kabupaten Bandung Barat, Jawa Barat 40198",
                "setiap hari 05.00–18.00",
                "Tebing Keraton atau Tebing Karaton merupakan sebuah tebing yang berada" +
                        "di dalam kawasan Taman Hutan Raya Ir. H. Djuanda. Tebing ini terletak di" +
                        "Kampung Ciharegem Puncak, Desa Ciburial, Bandung, Jawa Barat, Indonesia." +
                        "Dari Tebing Keraton dapat menikmati pemandangan spektakuler. Bukan lampu" +
                        "kota, melainkan hutan",
                "https://www.hargatiket.net/wp-content/uploads/2018/10/Harga-Tiket-Tebing-Keraton-Bandung.jpg",
                "-6.834122", "107.663647"));



        databaseHelper.save(new Wisata(2, "The Lodge Maribaya",
                "Jalan Maribaya No. 149/252 RT. 03 / RW. 15 Babakan, Gentong, Cibodas, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
                "Setiap Hari 05.00–18.00",
                "The Lodge Maribaya adalah sebuah destinasi wisata alam dengan pemandangan" +
                        "alam pegunungan yang asri. Terletak di tengah area hutan pinus.\n",
                "https://2.bp.blogspot.com/-m811xUi5Hss/WRusSvQ74HI/AAAAAAAAOBQ/VFBTKI44POgiLrXfiIPiLd6D6BOEW9CDwCLcB/s1600/M3.JPG",
                "-6.829415", "107.687476"));

        databaseHelper.save(new Wisata(3, "Ranca upas",
                "Jl. Raya Ciwidey - Patengan No.KM. 11, Patengan, Kec. Rancabali, Bandung, Jawa Barat 40973",
                "24 Jam",
                "Ranca Upas atau Kampung Cai Ranca Upas adalah salah satu bumi perkemahan" +
                        "di Bandung, Jawa Barat, Indonesia. Terletak di Jalan Raya Ciwidey" +
                        "Patenggang KM. 11, Alam Endah, Ciwidey Kabupaten Bandung, dengan jarak" +
                        "sekitar 50 km dari pusat Kota Bandung.",
                "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1515282452/uqgvglexbzneyu7o9ayy.jpg",
                "-7.138180", "107.392338"));

        databaseHelper.save(new Wisata(4, "Curug Tilu Leuwi Opat",
                "Jl. Kp. Ciwangun Indah Camp, Cihanjuang Rahayu, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559",
                "24 Jam",
                "Mau trekking ringan di Lembang? anda bisa berkunjung ke curug tilu leuwi opat. " +
                        "tempatnya berada di area Parongpong lembang, " +
                        "Untuk menuju ke lokasi, anda harus berjalan menyusuri trek kurang lebih 30 menit. " +
                        "Tapi, banyak banget spot bagusnya lho. Suasananya juga hijau dan adem banget.",
                "https://www.jejakpiknik.com/wp-content/uploads/2017/07/@fakirpiknik-630x380.jpg",
                "-6.790573", "107.582628"));

        databaseHelper.save(new Wisata(8, "Curug Cimahi",
                "Jl. Kolonel Masturi No.325, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
                "Setiap Hari 08.00-18.00",
                "Glamping Lakeside di Rancabali – Ciwidey bisa dikatakan salah satu tujuan utama wisata di Bandung selatan saat ini. " +
                        "Dengan icon restoran berbentuk perahu yang besar yang ada di pinggir situ Patenggang, " +
                        "suasana disekitarnya indah sekali.",
                "https://barayakita.com/wp-content/uploads/2018/10/curug-cimahi-bandung.jpg",
                "-6.799271", "107.577530"));

        databaseHelper.save(new Wisata(5, "Gunung Tangkuban Perahu",
                "Cikahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                "24 Jam",
                "Gunung Tangkuban Perahu merupakan salah satu situs wisata terkenal di Indonesia. " +
                        "Terletak di daerah Lembang, sekitar 20 kilometer di utara Kota Bandung, " +
                        "gunung yang bentuknya menyerupai perahu terbalik ini selalu padat pengunjung pada akhir pekan dan waktu liburan.",
                "https://amazingindonesia.id/wp-content/uploads/2019/03/Keindahan-Wisata-Gunung-Tangkuban-Perahu-di-Jawab-Barat.jpg",
                "-6.760355", "107.609658"));

        databaseHelper.save(new Wisata(6, "Kawah Putih Ciwidey",
                "Sugihmukti, Kec. Pasirjambu, Bandung, Jawa Barat",
                "24 Jam",
                "Nama Kawah Putih Ciwidey sudah tidak asing di kalangan pecinta alam. " +
                        "Kawah yang terletak di daerah Ciwidey sekitar 50 Km di selatan Bandung ini merupakan kawah vulkanik " +
                        "dengan tanah yang berwarna putih akibat kandungan belerang pada tanahnya tersebut.",
                "https://4.bp.blogspot.com/-qrdZKa23QxY/VjR8GkNhziI/AAAAAAAACi4/FZeHMY4qSBY/s640/a15.jpg",
                "-7.166306", "107.402107"));

        databaseHelper.save(new Wisata(7, "Danau Situ Patenggang",
                "Patengan, Kec. Rancabali, Bandung, Jawa Barat",
                "24 Jam",
                "Danau Situ Patenggang terletak sekitar 7 Km dari Kawah Putih. " +
                        "Pemandangan yang disuguhkan danau ini sangat indah. Dikelilingi oleh lembah dan perkebunan teh yang hijau, " +
                        "banyak pengunjung menjadikan tempat ini sebagai tempat bersantai bersama keluarga dan teman.",
                "https://www.tourbandung.com/wp-content/uploads/2020/04/situ-patenggang.jpg",
                "-7.167027", "107.357507"));

        databaseHelper.save(new Wisata(10, "Situ Cisanti Bandung",
                "Tarumajaya, Kertasari, Bandung, Jawa Barat",
                "24 Jam",
                "Situ Cisanti merupakan hulu sungai Citarum. " +
                        "Siapa sangka, hulu sungai yang membelah Bandung ini ternyata indah sekali lho. " +
                        "Suasananya masih alami, Buat penggemar wisata alam pasti akan betah.",
                "https://1.bp.blogspot.com/-tOO3DtHJvJg/Xax5dB83hTI/AAAAAAAAumU/VWITdb541e4Wwzky21Kz9ZBzMQ3TplPyACNcBGAsYHQ/s640/062.jpg",
                "-7.208498", "107.657628"));


        databaseHelper.save(new Wisata(9, "Taman Hutan Raya Ir. H. Djuanda",
                "Kompleks Tahura, Jl. Ir. H. Juanda No.99, Ciburial, Kec. Cimenyan, Bandung, Jawa Barat 40198",
                "Setiap Hari 07.00-17.00",
                "Taman Hutan Raya terletak di kawasan Dago Pakar, membentang sampai ke daerah Maribaya. " +
                        "Di tempat yang merupakan taman hutan raya pertama di Indonesia ini terdapat kurang lebih 2500 jenis tanaman.",
                "https://lokawisatabandung.com/wp-content/uploads/2018/01/taman-hutan-raya-juanda.jpg",
                "-6.856595", "107.632647"));





    }



}
