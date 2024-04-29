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
        chooseRoom();
    }

    private void chooseRoom() {
        while (true) {
            System.out.println("1. Regular Room\n" +
                    "2. VIP Room\n" +
                    "Enter option here: ");
            try {
                int option = scan.nextInt();
                if (option == 1) {
                    roomOption1();
                    break;
                } else if (option == 2) {
                    roomOption2();
                    break;
                }
            } catch (Exception e) {
                scan.next();
                System.out.println("Please try again, only option '1' and '2' is available\n" +
                        "Only enter option with numbers");
            }
        }
    }

    private void roomOption1() {
        while (true) {
            System.out.println("Enter hotel you want to book the room in: ");
            String hotelName = scan.nextLine();
            scan.nextLine();
            Hotel hotel = new Hotel(hotelName);
            try {
                System.out.println("Enter number of beds needed: ");
                int beds = scan.nextInt();
                this.room = new RegularRoom(beds, hotel);
                System.out.println("You have booked a room with " + beds + " beds");
                break;
            } catch (Exception e) {
                //System.out.println("Error beds");
                System.out.println("Please try again, only enter number of beds with numbers: ");
            }
        }
    }

    private void roomOption2() {
        while (true) {
            try {
                System.out.println("Enter hotel you want to book the room in: ");
                String hotelName = scan.nextLine();
                scan.nextLine();
                Hotel hotel = new Hotel(hotelName);
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
                break;
            }catch (Exception e) {
            System.out.println("VIP beds error");
            System.out.println("Error, please try again. Only enter number of beds with numbers.");
        }
}
