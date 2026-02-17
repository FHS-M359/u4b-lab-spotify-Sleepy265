import java.util.Scanner;

public class Song {
    private String title;
    private String artist;
    private String album;
    private String year;
    private String genre;
    private String secs;

    public Song(String t, String artist, String album, String y, String g, String s) {
        title = t;
        this.artist = artist;
        this.album = album;
        year = y;
        genre = g;
        secs = s;
    }
    public String toString(){
        return String.format("%20s %20s %20s %20d %10s",title, artist, album, year, genre);
    }
    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSecs() {
        return secs;
    }

    public void setSecs(String secs) {
        this.secs = secs;
    }

    public void setYear(String year) {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
