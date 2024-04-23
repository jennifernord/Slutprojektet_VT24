import java.util.ArrayList;
import java.util.Scanner;
public class RegularGuest extends Guest{
    Scanner scan = new Scanner(System.in);
    protected RegularGuest(String name, int age, int phoneNr){
        super(name, age, phoneNr);
    }

    protected void addRoom(){
        System.out.println("1. Regular Room\n" +
                "2. VIP Room\n" +
                "Enter option here: ");
        int option = scan.nextInt();
        if (option == 1){
            System.out.println("Enter number of beds needed: ");
            int beds = scan.nextInt();
            this.room = new RegularRoom(beds,);
            System.out.println("You have booked a room with " +beds +" beds");
        }
    }
}
