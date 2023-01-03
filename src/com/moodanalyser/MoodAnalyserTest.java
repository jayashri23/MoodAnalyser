package com.moodanalyser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.analyseMood("I am in Sad Mood");
        assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.analyseMood("I am in Happy Mood");
        assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.analyseMood(null);
        assertEquals("HAPPY",mood);
    }
}