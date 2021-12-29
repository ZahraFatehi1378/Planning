package com.example.myapplication.db;



import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.myapplication.model.MyPlanning;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

@Dao
public interface PlanningDAO {

    @Query("select * from myplanning where id = :id")
    MyPlanning getMyPlanning(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertMyPlanning(MyPlanning myPlanning);

    @Query("SELECT * FROM myplanning")
    List<MyPlanning> getAllMyPlannings();

    @Query("delete from myplanning where id =:id")
    Completable deleteMyPlanning(int id);

    @Query("update myplanning set plannings =:plannings where id =:id")
    void updatePlanning(ArrayList<String>  plannings , int id);


}


