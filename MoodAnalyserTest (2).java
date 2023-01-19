package Constructor.tc1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {
    static MoodAnalyser moodAnalyser;

    @Before
    public static void init() {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    public void shouldReturnSadMood() {
        String result = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertSame("SAD", result);
    }
}
