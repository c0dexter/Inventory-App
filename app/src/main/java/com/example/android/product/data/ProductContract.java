package com.example.android.product.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by dobry on 08.07.17.
 */

public final class ProductContract {

    public static final String LOG_TAG = ProductProvider.class.getSimpleName();

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ProductContract() {
    }


    /**
     * Building URI
     */
    // authority
    public static final String CONTENT_AUTHORITY = "com.example.android.product";
    // base content URI
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    // path to table name
    public static final String PATH_PRODUCTS = "products";

    /**
     * Inner class that defines constant values for the products database table.
     * Each entry in the table represents a single product.
     */

    public static abstract class ProductEntry implements BaseColumns {

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of products.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single product.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;


        /**
         * The content URI to access the product data in the provider
         */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PRODUCTS);

        /**
         * Name of database table for products
         */
        public final static String TABLE_NAME = "products";

        /**
         * Unique ID number for the product (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the product.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME = "name";

        /**
         * Model of the product.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_MODEL = "model";

        /**
         * Grade of the product.
         * <p>
         * The only possible values are {@link #GRADE_UNKNOWN}, {@link #GRADE_NEW},
         * or {@link #GRADE_USED}.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PRODUCT_GRADE = "grade";

        /**
         * Quantity of the product.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";

        /**
         * Quantity of the product.
         * <p>
         * Type: TEXT
         */
        public static final String COLUMN_PRODUCT_PICTURE = "picture";

        /**
         * Price of the product.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PRODUCT_PRICE = "price";

        /**
         * Name of the supplier.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_NAME = "supplierName";

        /**
         * Name of the supplier.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_EMAIL = "supplierEmail";

        /**
         * Possible values for the grade of the product.
         */
        public static final int GRADE_UNKNOWN = 0;
        public static final int GRADE_NEW = 1;
        public static final int GRADE_USED = 2;

        /**
         * Returns whether or not the given grade is {@link #GRADE_UNKNOWN}, {@link #GRADE_NEW},
         * or {@link #GRADE_USED}.
         */
        public static boolean isValidGrade(int grade) {
            if (grade == GRADE_UNKNOWN || grade == GRADE_NEW || grade == GRADE_USED) {
                return true;
            }
            return false;
        }
    }

}
