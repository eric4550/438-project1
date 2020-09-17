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
public class GradeCategoryTest {
    @Test
    public void testGradeCategory() {
        //Testing Getters
        GradeCategory gc = new GradeCategory("Exams", 45);

        assertEquals(gc.getTitle(), "Exams");
        assertEquals(gc.getWeight(), 45);

        //Testing Setters
        gc.setTitle("Labs");
        gc.setWeight(15);

        assertEquals(gc.getTitle(), "Labs");
        assertEquals(gc.getWeight(), 15);



    }
}
