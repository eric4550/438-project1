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
public class CourseTest {
    @Test
    public void testCourse() {
        //Testing Getters
        Course course = new Course("Dr C.", "Sith101", "How to kill Jedi for dummies");

        assertEquals(course.getInstructor(), "Dr C.");
        assertEquals(course.getTitle(), "Sith101");
        assertEquals(course.getDescription(), "How to kill Jedi for dummies");

        //Testing Setters
        course.setInstructor("Bob");
        course.setTitle("Unsuspicious Class");
        course.setDescription("Just a normal class");

        assertEquals(course.getInstructor(), "Bob.");
        assertEquals(course.getTitle(), "Unsuspicious Class");
        assertEquals(course.getDescription(), "Just a normal class");
    }
}
