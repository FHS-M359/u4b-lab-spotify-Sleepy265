import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) throws FileNotFoundException {
        Playlist songs = new Playlist();
        songs.makePlaylist();

        boolean pressedQuit = false;
        Scanner inF = new Scanner(System.in);
        while (!pressedQuit) {
            System.out.println("\n--- Music Menu ---");
            System.out.println("1. Sort by Artist (A-Z)");
            System.out.println("2. Sort by Artist (Z-A)");
            System.out.println("3. Sort by Year (Old-New)");
            System.out.println("4. Sort by Year (New-Old)");
            System.out.println("5. Search by Genre");
            System.out.println("6. Quit");
            System.out.print("Enter choice: ");
            try {
            int choice = inF.nextInt();
            System.out.println(choice);
            inF.nextLine();

            switch (choice) {
                case (1):
                    //
                    songs.artistSortAZ();
                    System.out.println(songs.toString());
                    break;
                case (2):
                    //
                    songs.artistSortZA();
                    System.out.println(songs.toString());
                    break;

                case (3):
                    //
                    songs.releaseYear();
                    System.out.println(songs.toString());
                    break;

                case (4):
                    //
                    songs.releaseYearRev();
                    System.out.println(songs.toString());
                    break;

                case (5):
                    //
                    System.out.println("Which Genre");
                    System.out.println("Pop,Rock,Hip-Hop,R&B,Electronic,Country Rap(ikr what),Synth Pop(Diva much?)");
                    songs.genreSort(inF.nextLine());

                    break;

                case (6):
                    pressedQuit = true;
                    break;

                default: System.out.println("can you count?");
            }
            } catch (InputMismatchException e) {
                System.out.println("JUST ENTER A NUMBER, NOTHING ELSE, LIKE PLEASE I MEAN IF ITS A TYPO I UNDERSTAND BUT DID YOU GENUINELY THINK A BACKSLASH WAS A VALID INPUT????????");
                inF.nextLine();
            }
        }
    }
}
