package com.example.myapplication.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.myapplication.model.MyPlanning;

@Database(entities = { MyPlanning.class },version = 1)
@TypeConverters({Converters.class})
public abstract class PlanningDataBase extends RoomDatabase {

    private static PlanningDataBase instance;


    public abstract PlanningDAO planningDAO();

    public static PlanningDataBase getInstance(Context context) {
        if (instance == null)
            instance = Room.databaseBuilder(context, PlanningDataBase.class, "RoomDb")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries() // this code may block the main thread, every database transaction must be executed on background thread no
                    .build();// as long as this method is called no, if you remove this method then you should call every single method of your DAOs on a background thread
        return instance;
    }
}
