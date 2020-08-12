package com.example.tugas_uas_akb_if3_10117087.Database;

import android.database.Cursor;

import java.util.ArrayList;

/** NIM : 10117087
    Nama : AhmadMaula
    Kelas : IF-3
 **/

public class MapsHelper {
    public static ArrayList<Wisata> mapCursorToArrayList(Cursor TourPlaceCursor) {
        ArrayList<Wisata> wisataList = new ArrayList<>();

        while (TourPlaceCursor.moveToNext()) {
           int id = TourPlaceCursor.getInt(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.id));
           String nama = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.nama));
           String alamat = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.alamat));
            String waktuBuka = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.waktubuka));
            String deskripsi = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.deskripsi));
            String foto = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.foto));
            String lang = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.lang));
            String leng = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.leng));
            wisataList.add(new Wisata(id, nama, alamat, waktuBuka, deskripsi, foto, lang, leng));

        }
        return wisataList;
    }

}
