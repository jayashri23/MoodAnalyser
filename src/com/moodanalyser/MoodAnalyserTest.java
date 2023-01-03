package com.moodanalyser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {    @Test
public void givenMessage_SadMood_Should_Return_Sad() {
    MoodAnalyser moodAnalyzer = new MoodAnalyser("I am In a Sad Mood");
    String mood;
    try {
        mood = moodAnalyzer.analyseMood();
        assertEquals("SAD", mood);
    } catch (MoodAnalysisException e) {
        e.printStackTrace();
    }
}
    @Test
    public void givenMessage_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}