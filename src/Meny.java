import java.awt.*;
import java.util.Scanner;

public class Meny {
    Scanner scan = new Scanner(System.in);
    private void meny(){
        System.out.println("1. Create booking\n" +
                "2. ...\n" +
                "3. ...\n" +
                "Enter option: ");
        int option = scan.nextInt();
        if (option == 1){
            new Guest();
        }
    }
}
