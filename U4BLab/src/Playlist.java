import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    private ArrayList<Song> songs;
    public Playlist() {
        songs = new ArrayList<Song>();
    }
    public void makePlaylist() throws FileNotFoundException {
        //wrong
        Scanner inF = new Scanner(new File("H:\\M359 Milanov\\M359-Repo\\u4b-lab-spotify-Sleepy265\\U4BLab\\spotify_unique_years_artists.txt"));
        while (inF.hasNextLine()) {
            String str = inF.nextLine();
            String[] arr = str.split(",", 0);
            System.out.println(arr[0]);
            Song song = new Song(arr[0], arr[1], arr[2], arr[4], arr[5]);
            songs.add(song);
        }
        inF.close();
    }


    public String toString() {
        String str = "";
        for (Song s : songs) {
            str += s.toString() + "\n";
        }
        return str;
    }

    public void genreSort(String str){
        for (Song s : songs) {
            if (s.getGenre().equalsIgnoreCase(str)){
                System.out.println(s.toString());
            }
        }
    }
    public void artistSortAZ(){
        for (int i = 0; i < songs.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < songs.size(); j++) {
                if (songs.get(j).getArtist().compareToIgnoreCase(songs.get(minIndex).getArtist()) < 0) {

                    minIndex = j;
                }
            }
            songs.set(minIndex, songs.set(i, songs.get(minIndex)));
        }
        }
    public void artistSortZA(){
        for (int i = 0; i < songs.size(); i++) {
            int minIndex = i;
            for (int j = i; j < songs.size(); j++) {
                if (songs.get(j).getArtist().compareToIgnoreCase(songs.get(minIndex).getArtist()) > 0) {
                    minIndex = j;
                }
            }
            songs.set(minIndex, songs.set(i, songs.get(minIndex)));
        }
    }
    public void releaseYear() {
        for (int i = 1; i < songs.size(); i++) {
            //saves element val
            Song temp = songs.get(i);
            //saves pos
            int index = i;
            while (index > 0 && songs.get(index-1).getYear().compareToIgnoreCase(temp.getYear()) > 0){
                songs.set(index, songs.get(index - 1));
                index--;
            }
            //inserts val at loc
            songs.set(index, temp);
        }
    }
    public void releaseYearRev() {
        for (int i = 1; i < songs.size(); i++) {
            //saves element val
            Song temp = songs.get(i);
            //saves pos
            int index = i;
            while (index > 0 && songs.get(index-1).getYear().compareToIgnoreCase(temp.getYear()) < 0){
                songs.set(index, songs.get(index - 1));
                index--;
            }
            //inserts val at loc
            songs.set(index, temp);
        }
    }
    }

