package com.example.mini_library_project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

class database_helper extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME="Booklibrary.db";
    private static final int DATABASE_VERSION=1;
    private static final String TABLE_NAME="librayr";
    private static final String  COLUMN_ID="_id";
    private static final String  COLUMN_TITLE="book_title";
    private static final String  COLUMN_AUTHOR="author_name";
    private static final String  COLUMN_PAGES="book_pages";

    public database_helper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                        " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_TITLE + " TEXT, " +
                        COLUMN_AUTHOR + " TEXT, " +
                        COLUMN_PAGES + " INTEGER);";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}
