import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    private ArrayList<Song> songs;
    public Playlist() {
        songs = new ArrayList<Song>();
    }
    public void makePlaylist() {
        //wrong
        Scanner inF = new Scanner("H:\\M359 Milanov\\M359-Repo\\u4b-lab-spotify-Sleepy265\\U4BLab\\spotify_unique_years_artists.txt");
        while (inF.hasNextLine()) {
            String str = inF.nextLine();
            String[] arr = str.split(",");
            Song song = new Song(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            songs.add(song);
        }
        inF.close();
    }


    public String toString() {
        String str = "";
        for (Song s : songs) {
            str += s.toString();
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
    public void artistSort(){
        for (int i = 0; i < songs.size(); i++) {
                Song min = songs.get(i);
            for (int j = i; j < songs.size(); j++) {

                // 3. Loop through the remaining elements (starting from the second element at index 1)
                for (int i = 1; i < songs.size(); i++) {
                    Song currentElement = songs.get(i);

                    if (currentElement.getArtist().com) {
                        // 5. If the current element is smaller, update 'min'
                        min = currentElement;
                    }
                }
            }
        }
    }
}
