package com.zakar.ncaung.myapplication.model.util;

import android.support.annotation.NonNull;

import com.zakar.ncaung.myapplication.model.db.AppDatabase;
import com.zakar.ncaung.myapplication.model.entity.User;

/**
 * Created by ncaung on 11/11/17.
 */

public class DatabaseInitializer {
    public static void populateSync(@NonNull final AppDatabase db){
        populateWithTestData(db);
    }


    private static User addUser(final AppDatabase db, final String name,
                                final String lastName, final int age) {
        User user = new User();
        user.age = age;
        user.firt_name = name;
        user.last_name = lastName;
        db.UserModel().insertUser(user);
        return user;
    }


    private static void populateWithTestData(AppDatabase db) {
        db.UserModel().deleteAll();

        User user1 = addUser(db, "Jason", "Seaver", 40);
        User user2 = addUser(db, "Mike", "Seaver", 12);
        addUser(db, "Carol", "Seaver", 15);
    }
}
