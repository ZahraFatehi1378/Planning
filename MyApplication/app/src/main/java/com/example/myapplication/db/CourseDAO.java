package com.example.myapplication.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.myapplication.model.Course;
import com.example.myapplication.model.MyPlanning;
import java.util.List;

@Dao
public interface CourseDAO {

    @Query("select * from course where id = :id")
    Course getCourse(int id);

    @Query("select * from course")
    List<Course> getAllCourses();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCourse(Course course);

    @Query("SELECT * FROM course WHERE categoryId =:categoryID")
    List<Course> getCourseByCategory(int categoryID);

    @Query("delete from course where id =:id")
    void deleteCourse(int id);

    @Query("SELECT EXISTS(SELECT * FROM course WHERE name = :courseName AND instructor = :instructor AND startTime = :startTime AND endTime =:endTime AND startTimeExam =:startExam AND endTimeExam =:endExam AND dayOfExam=:examDay AND monthOfExam=:examMonth)")
    Boolean courseExist(String courseName, String instructor, String startTime, String endTime, String startExam, String endExam, String examDay, String examMonth);

}
