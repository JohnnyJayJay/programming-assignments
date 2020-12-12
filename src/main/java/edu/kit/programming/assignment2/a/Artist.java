package edu.kit.programming.assignment2.a;

/**
 * A class representing an artist with their first and last name and the release date of their first song.
 *
 * @author Jana, Johnny, Christof
 * @version 1.0
 */
public class Artist {

    private final String firstName;
    private final String lastName;
    private final Date firstRelease;

    /**
     * Creates a new artist initialized with the provided values.
     *
     * @param firstName The first name of the artist.
     * @param lastName The last name of the artist.
     * @param firstRelease Release date of the first song.
     */
    public Artist(String firstName, String lastName, Date firstRelease) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstRelease = firstRelease;
    }

    /**
     * Returns the first name of the artist.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the last name of the artist.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the release date of their first song.
     *
     * @return The release date.
     */
    public Date getFirstRelease() {
        return firstRelease;
    }
}
