//Klass som skapar en vanlig gäst

import java.util.Scanner;

public class RegularGuest extends Guest {
    Scanner scan = new Scanner(System.in);

    //Vanliga gästens attribut
    protected RegularGuest(String name, int age, int phoneNr) {
        super(name, age, phoneNr);
    }

    //Metod där den vanliga gästen kan äga ett rum
    protected void addRoom() {
        enterHotel();
        System.out.println("1. Regular Room\n" +
                "2. VIP Room\n" +
                "Enter option here: ");
        int option = scan.nextInt();
        if (option == 1) {
            try {
                System.out.println("Enter number of beds needed: ");
                int beds = scan.nextInt();
                this.room = new RegularRoom(beds, hotel);
                System.out.println("You have booked a room with " + beds + " beds");
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Error beds");
                System.out.println("Please try again, only option '1' or '2' is available\n" +
                        "Only enter option with numbers: ");
            }
        }
        if (option == 2) {
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
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Error vip");
                System.out.println("Only enter option with numbers: ");
            }
        }
    }

    private void enterHotel() {
        System.out.println("Enter hotel you want to book the room in: ");
        String hotelName = scan.nextLine();
        Hotel hotel = new Hotel(hotelName);
    }

    private void chooseRoom() {

    }
}