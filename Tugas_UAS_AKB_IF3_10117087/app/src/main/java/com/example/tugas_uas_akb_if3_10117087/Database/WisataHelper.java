package com.example.tugas_uas_akb_if3_10117087.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import static com.example.tugas_uas_akb_if3_10117087.Database.DatabaseHelper.MyColumns.id;

/** NIM : 10117087
   Nama : AhmadMaula
   Kelas : IF-3
 **/

public class WisataHelper {
    private static final String DATABASE_TABLE = "tempatWisata";
    private static DatabaseHelper databaseHelper;
    private static WisataHelper INSTANCE;
    private static SQLiteDatabase db;
    private static TambahWisata li;

    private WisataHelper(Context context){

        databaseHelper = new DatabaseHelper(context);

         li = new TambahWisata(context);

    }

    public static WisataHelper getInstance(Context context){
        if (INSTANCE == null){
            synchronized (SQLiteOpenHelper.class){
                if (INSTANCE == null){
                    INSTANCE = new WisataHelper(context);
                }
            }
        }
        return INSTANCE;
    }

    public void open() throws SQLException {
        db = databaseHelper.getWritableDatabase();
    }

    public void close(){
        databaseHelper.close();

        if (db.isOpen()){
            db.close();
        }
    }

    public Cursor queryAll(){
        return db.query(DATABASE_TABLE,
                null,
                null,
                null,
                null,
                null,
                 id +" Desc");

    }

    public Cursor queryById(String id){
        return db.query(
                DATABASE_TABLE,
                null,
                id + " = ?",
                new String[]{id},
                null,
                null,
                null,
                null);
    }


}
