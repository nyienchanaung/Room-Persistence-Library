package com.zakar.ncaung.myapplication.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by ncaung on 11/11/17.
 */
@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    @ColumnInfo(name = "first_name")
    public String firt_name;
    @ColumnInfo(name = "last_name")
    public String last_name;
    @ColumnInfo(name = "age")
    public int age;
}
