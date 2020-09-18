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
    private int weight;

    private Date Date;



    public GradeCategory( int weight) {
//        this.title = title;
        this.weight = weight;

        Date = new Date();
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date mDate) {
        this.Date = mDate;
    }
}
