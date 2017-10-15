package com.example.android.pets.contract;

import android.provider.BaseColumns;

/**
 * Created by rahulkapoor on 15/10/17.
 */


public final class PetContract {
//contract class is helpful in updation of code at one place and centralises the whole concept of db;

    private PetContract() {}

    //inner class;
    public final static class PetEntry implements BaseColumns {

        //table name;
        public final static String TABLE_NAME = "pets";
        //columnns;
        public final static String _id = BaseColumns._ID;
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_BREED = "breed";
        public final static String COLUMN_GENDER = "gender";
        public final static String COLUMN_WEIGHT = "weight";

        //gender constants defined;
        public final static int GENDER_UNKNOWN = 0;
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE = 2;

    };


}
