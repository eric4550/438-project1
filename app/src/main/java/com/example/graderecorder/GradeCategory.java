package com.example.graderecorder;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.graderecorder.DB.GradeDatabase;

import java.io.Serializable;
import java.util.Date;

@Entity(tableName = GradeDatabase.GRADELOG_TABLE)
public class GradeCategory implements Serializable {
    /**Title
     Weight
     GradeID*
     AssignedDate*
     categoryID
     */

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int categoryId;
    private String title;
    private char grade;

    public GradeCategory(String title, char grade) {
    }


//    private Date Date;




    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @NonNull
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


//    public Date getDate() {
//        return Date;
//    }
//
//    public void setDate(Date mDate) {
//        this.Date = mDate;
//    }
}
