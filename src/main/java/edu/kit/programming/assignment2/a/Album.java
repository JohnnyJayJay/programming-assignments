package edu.kit.programming.assignment2.a;

/**
 * A class representing an album with a title, a performer, the date, a label and the genre.
 *
 * @author Jana, Johnny, Christof
 * @version 1.0
 */
public class Album {

    private final String title;
    private final Artist performer;
    private  final Date date;
    private final Label label;
    private final Genre genre;

    /**
     * Creates a new album initialized with the provided values.
     *
     * @param title The title of the album.
     * @param performer The performer of the album.
     * @param date The release date of the album .
     * @param label The label that published the album.
     * @param genre The genre of the album.
     */
    public Album(String title, Artist performer, Date date, Label label, Genre genre) {
        this.title = title;
        this.performer = performer;
        this.date = date;
        this.label = label;
        this.genre = genre;
    }

    /**
     * Returns the title of the album.
     *
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the performer of the album.
     *
     * @return The performer.
     */
    public Artist getPerformer() {
        return performer;
    }

    /**
     * Returns the release date of the album.
     *
     * @return The date.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Returns the label that published the album.
     *
     * @return The label.
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Returns the genre of the album.
     *
     * @return The genre.
     */
    public Genre getGenre() {
        return genre;
    }
}
