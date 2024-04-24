import java.util.ArrayList;
import java.util.Scanner;
public class RegularGuest extends Guest{
    Scanner scan = new Scanner(System.in);
    protected RegularGuest(String name, int age, int phoneNr){
        super(name, age, phoneNr);
    }

    protected void addRoom(){
        System.out.println("Enter hotel you want to book the room in: ");
        String hotelName = scan.nextLine();
        Hotel hotel = new Hotel(hotelName);
        try {
            System.out.println("1. Regular Room\n" +
                    "2. VIP Room\n" +
                    "Enter option here: ");
            int option = scan.nextInt();
            if (option == 1){
                try {
                    System.out.println("Enter number of beds needed: ");
                    int beds = scan.nextInt();
                    this.room = new RegularRoom(beds, hotel);
                    System.out.println("You have booked a room with " + beds + " beds");
                }catch (Exception e){
                    scan.nextLine();
                    System.out.println("Please try again, only option '1' or '2' is available\n" +
                            "Only enter option with numbers: ");
                }
            }
            if (option == 2){
                try {
                    System.out.println("Enter number of beds needed: ");
                    int beds = scan.nextInt();
                    System.out.println("Choose a privilege: \n" +
                            "1. Breakfast in bed\n" +
                            "2. Poolside view\n" +
                            "3. Balcony\n" +
                            "Enter option here: ");
                    int privilege = scan.nextInt();
                    System.out.println("You have chosen option " + privilege);
                    this.room = new VipRoom(beds, hotel, privilege);
                    System.out.println("You have booked a room with " + beds + " beds and privilege nr " + privilege);
                }catch (Exception e){
                    scan.nextLine();
                    System.out.println("Only enter option with numbers: ");
                }
            } else {
                throw new Exception("Please try again, only option '1' or '2' is available");
            }
        }catch (Exception e){
            scan.nextLine();
            System.out.println("Please try again, only option '1' or '2' is available\n" +
                    "Only enter option with numbers: ");
        }

    }
}