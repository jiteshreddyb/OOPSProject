
package model;

public class Songs {
    private String title;
    private double duration;
    private String artist;
    private String genre;

    public Songs(String title, double duration, String artist, String genre) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be greater than zero.");
        }
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " mins, Genre: " + genre + ")";
    }
}
