package uc3;

public class MoodAnalyserException extends Exception {
    public enum ExceptionType {
        NULL
    }

    public ExceptionType type;

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;

    }
}
