package edu.kit.programming.assignment2.a;

/**
 * A class representing a duration consisting of a minute and a second part.
 *
 * @author Jana, Johnny, Christof
 * @version 1.0
 */
public class Duration {

    private final int minutes;
    private final int seconds;

    /**
     * Creates a new duration initialized with the provided values.
     *
     * @param minutes The minute part of this duration as an integer.
     * @param seconds The second part of this duration as an integer.
     */
    public Duration(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * Returns the minute part of this duration.
     *
     * @return The minutes.
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Returns the second part of this duration.
     *
     * @return The seconds.
     */
    public int getSeconds() {
        return seconds;
    }
}
