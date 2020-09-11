package com.example.graderecorder;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class GradeTest{
    @Test
    public void testGrade(){
        //Testing Getters
        Grade grade = new Grade('A', 100, 100, 101, 102, "12/25/2020");

        assertEquals(grade.getGrade(), 'A');
        assertEquals(grade.getAssingmentID(), 100);
        assertEquals(grade.getStudentID(), 101);
        assertEquals(grade.getCourseID(), 102);
        assertEquals(grade.getDateEarned(), "12/25/2020");

        //Testing Setters
        grade.setGrade('F');
        grade.setScore(0);
        grade.setAssingmentID(200);
        grade.setStudentID(201);
        grade.setCourseID(202);
        grade.setDateEarned("01/10/2010");

        assertEquals(grade.getGrade(), 'F');
        assertEquals(grade.getAssingmentID(), 200);
        assertEquals(grade.getStudentID(), 201);
        assertEquals(grade.getCourseID(), 202);
        assertEquals(grade.getDateEarned(), "01/10/2010");


    }
}