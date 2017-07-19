package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by dobry on 08.07.17.
 */

public final class PetDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    /**
     * Name of the database file
     */
    private static final String DATABASE_NAME = "shelter.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link PetDbHelper}
     *
     * @param context of the app
     */
    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + PetContract.PetEntry.TABLE_NAME;


    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " +
                PetContract.PetEntry.TABLE_NAME + "(" +
                PetContract.PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PetContract.PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
                PetContract.PetEntry.COLUMN_PET_BREED + " TEXT, " +
                PetContract.PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, " +
                PetContract.PetEntry.COLUMN_PET_WEIGHT + " INTEGER DEFAULT 0);";
        Log.v(LOG_TAG, SQL_CREATE_PETS_TABLE);

        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
