package model;

import java.time.Instant;

public class Timer {
    private static long startTime = Instant.now().toEpochMilli();;

    private Timer() { }

    public static long getStartTime() {
        return startTime;
    }
}
