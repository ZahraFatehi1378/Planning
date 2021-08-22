package com.example.myapplication.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.myapplication.model.MyPlanning;

import java.util.List;

@Dao
public interface PlanningDAO {

    @Query("select * from myplanning where id = :id")
    MyPlanning getMyPlanning(int id);

    @Insert()
    void insertMyPlanning(MyPlanning myPlanning);

    @Query("SELECT * FROM myplanning")
    List<MyPlanning> getAllMyPlannings();

    @Query("delete from myplanning where id =:id")
    void deleteMyPlanning(int id);


}


