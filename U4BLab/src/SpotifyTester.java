import java.util.Calendar;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args){
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
            int choice = inF.nextInt();
            inF.nextLine();
            switch (choice) {
                case (1):
                    //
                case (2):
                    //
                case (3):
                    //
                case (4):
                    //
                case (5):
                    //
                case (6):
                    pressedQuit = true;
                default: System.out.println("can you count?");
            }
        }
    }
}
