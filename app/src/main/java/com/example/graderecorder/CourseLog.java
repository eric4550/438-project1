package com.example.graderecorder;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.graderecorder.DB.CourseDatabase;

import java.util.Date;

@Entity(tableName = CourseDatabase.COURSELOG_TABLE)


public class CourseLog {

    @PrimaryKey(autoGenerate = true)
    private int mCourseID;


    private String mCST;
    private String mEnglish;
    private String mMath;
    private String mSpanish;


    private Date Date;

    public CourseLog(String cst, String english, String math, String spanish){

        mCST = cst;
        mEnglish = english;
        mSpanish = spanish;

        Date = new Date();
    }

    public int getmCourseID() {
        return mCourseID;
    }

    public void setmCourseID(int mCourseID) {
        this.mCourseID = mCourseID;
    }

    public String getmCST() {
        return mCST;
    }

    public void setmCST(String mCST) {
        this.mCST = mCST;
    }

    public String getmEnglish() {
        return mEnglish;
    }

    public void setmEnglish(String mEnglish) {
        this.mEnglish = mEnglish;
    }

    public String getmMath() {
        return mMath;
    }

    public void setmMath(String mMath) {
        this.mMath = mMath;
    }

    public String getmSpanish() {
        return mSpanish;
    }

    public void setmSpanish(String mSpanish) {
        this.mSpanish = mSpanish;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date mDate) {
        this.Date = mDate;
    }


    @Override
    public String toString() {
        return "CourseLog{" +
                "mCourseID=" + mCourseID +
                ", mCST='" + mCST + '\'' +
                ", mEnglish='" + mEnglish + '\'' +
                ", mMath='" + mMath + '\'' +
                ", mSpanish='" + mSpanish + '\'' +
                '}';
    }
}
