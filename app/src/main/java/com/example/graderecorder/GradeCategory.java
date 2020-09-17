package com.example.graderecorder;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

import java.io.Serializable;

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

    public GradeCategory(String title, int weight) {
        this.title = title;
        this.weight = weight;
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
}
