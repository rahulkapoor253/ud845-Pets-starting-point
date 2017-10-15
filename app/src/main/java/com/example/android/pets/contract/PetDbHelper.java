package com.example.android.pets.contract;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rahulkapoor on 15/10/17.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    //we do mention the db name and version;
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "shelter.db";

    public PetDbHelper(final Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(final SQLiteDatabase db) {

        //create table statement;
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE" + PetContract.PetEntry.TABLE_NAME + "("
                + PetContract.PetEntry._id + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + PetContract.PetEntry.COLUMN_NAME + "TEXT NOT NULL, "
                + PetContract.PetEntry.COLUMN_BREED + "TEXT, "
                + PetContract.PetEntry.COLUMN_GENDER + "INTEGER NOT NULL, "
                + PetContract.PetEntry.COLUMN_WEIGHT + "INTEGER NOT NULL DEFAULT 0 );";

        //to execute this command we use execSQL();
        db.execSQL(SQL_CREATE_PETS_TABLE);

    }

    @Override
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int i, final int i1) {

    }
}
