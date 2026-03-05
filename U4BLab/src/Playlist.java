import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    //stores all Song objects in the playlist
    private ArrayList<Song> songs;
    //initialize a playlist
    public Playlist() {
        songs = new ArrayList<Song>();
    }
    //reads data from the file and fills arr with songs
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

    /**
     *
     * @return playlist array in formatted string
     */
    public String toString() {
        String str = String.format("%-25s %-20s %-25s %-20s %-10s \n","Title", "Artist", "Album", "Year", "Genre");;
        for (Song s : songs) {
            str += s.toString() + "\n";
        }
        return str;
    }

    /**
     *
     * @param str
     * @return boolean so can be used in if statement in case 5 in tester, also formats playlist
     */
    public boolean genreSort(String str){
        boolean present = false;
        for (Song s : songs) {
            if (s.getGenre().equalsIgnoreCase(str)){
                System.out.println(s.toString());
                present = true;
            }
        }
        return present;
    }

    /**
     * artist alphabetically
     */
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

    /**
     * artist sort reverse alphabetically
     */
    public void artistSortZA(){
        for (int i = 0; i < songs.size(); i++) {
            int minIndex = i;
            for (int j = i; j < songs.size(); j++) {
                //sets min index if the checked num is less than the first in iteration
                if (songs.get(j).getArtist().compareToIgnoreCase(songs.get(minIndex).getArtist()) > 0) {
                    minIndex = j;
                }
            }
            songs.set(minIndex, songs.set(i, songs.get(minIndex)));
        }
    }

    /**
     * sorts by release year chronologically
     */
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
    /**
     * sorts by release year reverse chronologically
     */
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

