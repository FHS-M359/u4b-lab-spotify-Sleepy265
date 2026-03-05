import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) throws FileNotFoundException {
        Playlist songs = new Playlist();
        songs.makePlaylist();
        //using a while statement is completely useless here after all the code is finished since I can realistically just
        //manually go in and terminate at all termination points, and it would remove the computing monster which is
        //this run time while loop, but I think its quite charming no?
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
            //handles inputMismatchException
            try {
            int choice = inF.nextInt();
            System.out.println(choice);
            inF.nextLine();
            // evals the number inputted and responds accordingly
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
                    if(!songs.genreSort(inF.nextLine())){
                        System.out.println("Not a genre, look at the list I lovingly made");
                    }

                    break;

                case (6):
                    pressedQuit = true;
                    break;
                //default handles any other non-exception cases
                default: System.out.println("know what? Lets count to 6. \n 1 \n 2 \n 3 \n 4 \n 5 \n 6 \n not whatever you put");
            }
            } catch (InputMismatchException e) {
                System.out.println("JUST ENTER A NUMBER, NOTHING ELSE, LIKE PLEASE I MEAN IF ITS A TYPO I UNDERSTAND BUT DID YOU GENUINELY THINK A BACKSLASH WAS A VALID INPUT????????");
                //next line here prevents the program from taking another incorrect data peice, such as if someone put 2 values separated by a space (e.g // /// // / / /)
                inF.nextLine();
            }
        }
    }
}
