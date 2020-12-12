package edu.kit.programming.assignment2.a;

/**
 * A class that represents the attributes of a song.
 *
 * @author Jana, Johnny, Christof
 * @version 1.0
 */
public class Song {

    private final String title;
    private final Duration duration;
    private final Artist performer;
    private final Artist composer;
    private final Artist songwriter;
    private final Album album;

    /**
     * Creates a new song initialized with provided values.
     *
     * @param title The title of the song.
     * @param duration The duration of the song.
     * @param performer The performer of the song.
     * @param composer The composer of the song.
     * @param songwriter The songwriter of the song.
     * @param album The album in which the song is included.
     */
    public Song(String title, Duration duration, Artist performer, Artist composer, Artist songwriter, Album album) {
        this.title = title;
        this.duration = duration;
        this.performer = performer;
        this.composer = composer;
        this.songwriter = songwriter;
        this.album = album;
    }

    /**
     * Returns the title of the song.
     *
     * @return song title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the duration of the song.
     *
     * @return song duration.
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Returns the performer of the song.
     *
     * @return performer of the song.
     */
    public Artist getPerformer() {
        return performer;
    }

    /**
     * Returns the composer of the song.
     *
     * @return composer of the song.
     */
    public Artist getComposer() {
        return composer;
    }

    /**
     * Returns the songwriter of the song.
     * 
     * @return songwriter of the song.
     */
    public Artist getSongwriter() {
        return songwriter;
    }

    /**
     * Returns the album that includes the song.
     *
     * @return album that includes song.
     */
    public Album getAlbum() {
        return album;
    }
}
