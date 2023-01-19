package moodanalyseruc2;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
        public void shouldReturnSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertSame("SAD", result);
    }

    @Test
    public void shouldReturnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertSame("HAPPY", result);
    }

    @Test
    public void shouldHandleNullMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood();
        Assert.assertSame("HAPPY", result);
    }
}
