package com.example.graderecorder;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

import java.io.Serializable;

public class Grade implements Serializable {
    /**
     * Grade
     * score
     * AssigmentID
     * studentID
     * CourseID
     * date earned
     * gradeID
     */

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int gradeId;
    private char grade;
    private int score;
    private int assingmentID;
    private int studentID;
    private int courseID;
    private String dateEarned;

    public Grade(char grade, int score, int assingmentID, int studentID, int courseID, String dateEarned) {
        this.grade = grade;
        this.score = score;
        this.assingmentID = assingmentID;
        this.studentID = studentID;
        this.courseID = courseID;
        this.dateEarned = dateEarned;
    }

    @NonNull
    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAssingmentID() {
        return assingmentID;
    }

    public void setAssingmentID(int assingmentID) {
        this.assingmentID = assingmentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getDateEarned() {
        return dateEarned;
    }

    public void setDateEarned(String dateEarned) {
        this.dateEarned = dateEarned;
    }
}
