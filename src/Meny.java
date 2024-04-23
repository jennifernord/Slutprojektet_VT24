import java.util.ArrayList;
import java.util.Scanner;

public class Meny {
    public Meny(){MenuStart();}
    Scanner scan = new Scanner(System.in);

    ArrayList<RegularGuest> bookings = new ArrayList<>();
    private void MenuStart(){
        while(true){
            System.out.println("1. Create booking\n" +
                    "2. See all bookings\n" +
                    "3. ...\n" +
                    "Enter option: ");
            int option = scan.nextInt();
            if (option == 1) {
                System.out.println("1. Regular guest\n" +
                        "2. VIP guest\n" +
                        "Choose type of guest: ");
                int typeGuest = scan.nextInt();
                if (typeGuest == 1) {
                    newGuest();
                }
                if (typeGuest == 2) {
                    newVipGuest();
                }
            }
            if (option == 2) {
                for (RegularGuest guest : bookings) {
                    System.out.println(guest.name + " has phone number " + guest.phoneNr);
                }
            }
        }
        }

    private void newGuest() {
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        scan.next();
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Enter phone number: ");
        int phoneNr = scan.nextInt();
        System.out.println("Your name is " +name +"\n" +
                "Your age is " +age +"\n" +
                "Your phone number is: " +phoneNr);
        RegularGuest guest = new RegularGuest(name, age, phoneNr);
        guest.addRoom();

        bookings.add(guest);
    }

    private void newVipGuest(){
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        scan.next();
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Enter phone number: ");
        int phoneNr = scan.nextInt();
        System.out.println("Your name is: " +name +"\n" +
                "Your age is " +age +"\n" +
                "Your phone number is: " +phoneNr);
        VipGuest guest = new VipGuest(name, age, phoneNr);
        guest.addRoom();

        bookings.add(guest);
    }
}
