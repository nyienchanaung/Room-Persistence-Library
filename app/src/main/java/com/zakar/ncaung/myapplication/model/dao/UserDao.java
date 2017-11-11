package com.zakar.ncaung.myapplication.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.zakar.ncaung.myapplication.model.entity.User;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.IGNORE;

/**
 * Created by ncaung on 11/11/17.
 */
@Dao
public interface UserDao {
    @Insert
    void insetAll(User... users);

    @Insert(onConflict = IGNORE)
    void insertUser(User user);

    @Delete
    void delete(User user);

    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND "
            + "last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);

    @Query("DELETE FROM User")
    void deleteAll();

}
