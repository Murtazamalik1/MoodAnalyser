package uc3;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest_Uc3 {
        @Test
        public void shouldReturnSadMood() {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
            try {
                String result = moodAnalyser.analyseMood();
                Assert.assertSame("SAD", result);
            } catch (MoodAnalyserException e) {
                Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL, e.type);
            }
        }

        @Test
        public void shouldReturnHappyMood() {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
            try {
                String result = moodAnalyser.analyseMood();
                Assert.assertSame("HAPPY", result);
            } catch (MoodAnalyserException e) {
                Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL, e.type);
            }
        }

        @Test
        public void ShouldHandleNullMessage() {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            try {
                String result = moodAnalyser.analyseMood();
                Assert.assertSame("HAPPY", result);
            } catch (MoodAnalyserException e) {
                Assert.assertEquals("Message is Null", e.getMessage());
            }
        }
}
