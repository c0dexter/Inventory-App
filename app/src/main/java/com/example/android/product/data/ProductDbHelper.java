package com.example.android.product.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by dobry on 08.07.17.
 */

public final class ProductDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = ProductDbHelper.class.getSimpleName();

    /**
     * Name of the database file
     */
    private static final String DATABASE_NAME = "storehouse.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link ProductDbHelper}
     *
     * @param context of the app
     */
    public ProductDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ProductContract.ProductEntry.TABLE_NAME;


    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_PRODUCTS_TABLE = "CREATE TABLE " +
                ProductContract.ProductEntry.TABLE_NAME + "(" +
                ProductContract.ProductEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ProductContract.ProductEntry.COLUMN_PRODUCT_NAME + " TEXT NOT NULL, " +
                ProductContract.ProductEntry.COLUMN_PRODUCT_MODEL + " TEXT, " +
                ProductContract.ProductEntry.COLUMN_PRODUCT_GRADE + " INTEGER NOT NULL, " +
                ProductContract.ProductEntry.COLUMN_PRODUCT_PRICE + " REAL NOT NULL, " +
                ProductContract.ProductEntry.COLUMN_SUPPLIER_NAME + " TEXT, " +
                ProductContract.ProductEntry.COLUMN_SUPPLIER_EMAIL + " TEXT NOT NULL, " +
                ProductContract.ProductEntry.COLUMN_PRODUCT_PICTURE + " TEXT NOT NULL, " +
                ProductContract.ProductEntry.COLUMN_PRODUCT_QUANTITY + " INTEGER DEFAULT 0);";
        Log.v(LOG_TAG, SQL_CREATE_PRODUCTS_TABLE);

        /**
         * Create table
         */
        db.execSQL(SQL_CREATE_PRODUCTS_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
