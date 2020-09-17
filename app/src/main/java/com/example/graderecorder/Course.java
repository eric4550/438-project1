package com.example.graderecorder;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Course implements Serializable {
/**
 Course
 Instructor
 Title
 Description
 Start Date*
 End Date*
 courseID
 */

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int courseID;
    private String instructor;
    private String title;
    private String description;


    public Course(String instructor, String title, String description) {
        this.instructor = instructor;
        this.title = title;
        this.description = description;
    }

    @NonNull
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
