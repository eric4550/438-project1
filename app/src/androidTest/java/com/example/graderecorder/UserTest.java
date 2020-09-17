package com.example.graderecorder;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(AndroidJUnit4.class)
public class UserTest {
    @Test
    public void TestUser() {

        //Testing Getters
        User user = new User("Bob123", "Secret", "Bob", "Bobinson");
        assertEquals("Bob", user.getFirst());
        assertEquals("Bobinson", user.getLast());
        assertEquals("Bob123", user.getUsername());
        assertEquals("Secret", user.getPassword());

        //Testing Setters
        user.setFirst("Alice");
        user.setLast("Alison");
        user.setPassword("Secret123");
        user.setUsername("Alice321");

        assertEquals("Alice", user.getFirst());
        assertEquals("Alison", user.getLast());
        assertEquals("Alice321", user.getUsername());
        assertEquals("Secret123", user.getPassword());


    }
}