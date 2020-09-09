package com.example.graderecorder;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Assignment implements Serializable {
    private int maxScore;
    private int earnedScore;


    public Assignment(int maxScore, int earnedScore) {
        this.maxScore = maxScore;
        this.earnedScore = earnedScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getEarnedScore() {
        return earnedScore;
    }

    public void setEarnedScore(int earnedScore) {
        this.earnedScore = earnedScore;
    }
}
