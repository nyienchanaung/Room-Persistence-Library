package com.zakar.ncaung.myapplication.model.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.zakar.ncaung.myapplication.model.dao.UserDao;
import com.zakar.ncaung.myapplication.model.entity.User;

/**
 * Created by ncaung on 11/11/17.
 */
@Database(entities = {User.class},version = 1)
public abstract class AppDatabase extends RoomDatabase{
    private static AppDatabase INSTANCE;
    private static String DATABASE_NAME = "MyDatabase";
    public abstract UserDao UserModel();

    public static AppDatabase getDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance(){
        INSTANCE = null;
    }
}
