package edu.kit.programming.assignment2.a;

/**
 * A class representing a Gregorian date consisting of a year,
 * a month and a day of the month.
 *
 * @author Jana, Johnny, Christof
 * @version 1.0
 */
public class Date {

    private final int year;
    private final Month month;
    private final int day;

    /**
     * Creates a new date initialized with the provided values.
     *
     * @param year The year of the date.
     * @param month The month of the date.
     * @param day The day of the month.
     */
    public Date(int year, Month month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Returns the year of this date.
     *
     * @return The year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns the month of this date.
     *
     * @return The month.
     */
    public Month getMonth() {
        return month;
    }

    /**
     * Returns the day of the month of this date.
     *
     * @return The day.
     */
    public int getDay() {
        return day;
    }

    /**
     * An enum representing the 12 months of the Gregorian calendar.
     */
    public enum Month {
        /**
         * The first month.
         * @see <a href="https://de.wikipedia.org/wiki/January">Wikipedia</a>
         */
        JANUARY,
        /**
         * The second month
         * @see <a href="https://en.wikipedia.org/wiki/February">Wikipedia</a>
         */
        FEBRUARY,
        /**
         * The third month.
         * @see <a href="https://en.wikipedia.org/wiki/March">Wikipedia</a>
         */
        MARCH,
        /**
         * The fourth month.
         * @see <a href="https://en.wikipedia.org/wiki/April">Wikipedia</a>
         */
        APRIL,
        /**
         * The fifth month.
         * @see <a href="https://en.wikipedia.org/wiki/May">Wikipedia</a>
         */
        MAY,
        /**
         * The sixth month.
         * @see <a href="https://en.wikipedia.org/wiki/June">Wikipedia</a>
         */
        JUNE,
        /**
         * The seventh month.
         * @see <a href="https://en.wikipedia.org/wiki/July">Wikipedia</a>
         */
        JULY,
        /**
         * The eighth month.
         * @see <a href="https://en.wikipedia.org/wiki/August">Wikipedia</a>
         */
        AUGUST,
        /**
         * The ninth month.
         * @see <a href="https://en.wikipedia.org/wiki/September">Wikipedia</a>
         */
        SEPTEMBER,
        /**
         * The tenth month.
         * @see <a href="https://en.wikipedia.org/wiki/October">Wikipedia</a>
         */
        OCTOBER,
        /**
         * The eleventh month.
         * @see <a href="https://en.wikipedia.org/wiki/November">Wikipedia</a>
         */
        NOVEMBER,
        /**
         * The twelfth month.
         * @see <a href="https://en.wikipedia.org/wiki/December">Wikipedia</a>
         */
        DECEMBER;
    }
}
