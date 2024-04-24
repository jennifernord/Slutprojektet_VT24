import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Meny {
    public Meny() {
        MenuStart();
    }

    Scanner scan = new Scanner(System.in);

    ArrayList<RegularGuest> bookings = new ArrayList<>();

    private void MenuStart() {
        while (true) {
            System.out.println("1. Create booking\n" +
                    "2. See all bookings\n" +
                    "Enter option: ");
            try {
                int option = scan.nextInt();
                if (option == 1) {
                    try {
                        System.out.println("1. Regular guest\n" +
                                "2. VIP guest\n" +
                                "Choose type of guest: ");
                        int typeGuest = scan.nextInt();
                        if (typeGuest == 1) {
                            newGuest();
                        } else if (typeGuest == 2) {
                            newVipGuest();
                        } else {
                            throw new Exception("Please try again, only option '1' and '2' is available: ");
                        }
                    }catch (Exception ex){
                        scan.nextLine();
                        System.out.println("Please try again, only option '1' or '2' is available\n" +
                                "Only enter option with numbers: ");
                    }
                } else if (option == 2) {
                    for (RegularGuest guest : bookings) {
                        System.out.println(guest.name + " has phone number " + guest.phoneNr);
                    }
                }else {
                    throw new Exception("Please try again, only option '1' or '2' is available:");
                }break;
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Please try again, only option '1' or '2' is available\n" +
                        "Only enter option with numbers: ");
            }
        }
    }

    private void newVipGuest() {
        try {
            System.out.println("Enter name: ");
            String name = scan.nextLine();
            scan.next();
            System.out.println("Enter age: ");
            int age = scan.nextInt();
            System.out.println("Enter phone number: ");
            int phoneNr = scan.nextInt();
            System.out.println("Your name is: " + name + "\n" +
                    "Your age is " + age + "\n" +
                    "Your phone number is: " + phoneNr);
            VipGuest guest = new VipGuest(name, age, phoneNr);
            guest.addRoom();

            bookings.add(guest);
        }catch (Exception e){
            scan.nextLine();
            System.out.println("Error, please try again");
        }
    }

    private void newGuest() {
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Enter phone number: ");
        int phoneNr = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name + "\n" +
                "Your age is " + age + "\n" +
                "Your phone number is: " + phoneNr);
        RegularGuest guest = new RegularGuest(name, age, phoneNr);
        guest.addRoom();

        bookings.add(guest);
    }
}