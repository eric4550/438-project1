package com.example.graderecorder;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AssignmentTest {
    @Test
    public void testAssignment() {
        //Testing Getters
        Assignment assignment = new Assignment(100, 50 );

        assertEquals(assignment.getMaxScore(), 100);
        assertEquals(assignment.getEarnedScore(), 50);

        //Testing Setters
        assignment.setMaxScore(50);
        assignment.setMaxScore(25);

        assertEquals(assignment.getMaxScore(), 50);
        assertEquals(assignment.getEarnedScore(), 25);
    }
}
