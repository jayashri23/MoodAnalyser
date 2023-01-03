package com.moodanalyser;

public class MoodAnalyser {
        public String analyseMood(String message) {
            try {
                if (message.contains("Sad")) {
                    return "SAD";
                }
            } catch (NullPointerException e) {
                return "HAPPY";
            }
            return null;
        }
    }
