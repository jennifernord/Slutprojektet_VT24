//Klassen låter användaren ta del av programmets funktioner

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Meny {
    Scanner scan = new Scanner(System.in);
    ArrayList<RegularGuest> bookings = new ArrayList<>();

    //All kod för att användarmenyn ska fungera
    public Meny() {
        menyOption();
    }

    //Låter användaren interagera med menyn
    private void menyOption() {
        while (true) {
            try {
                System.out.println("1. Create booking\n" +
                        "2. See all bookings\n" +
                        "3: quit\n" +
                        "Enter option: ");
                int option = scan.nextInt();
                if (option == 1) {
                    menyOption1();
                } else if (option == 2) {
                    menyOption2();
                } else if (option == 3) {
                    System.out.println("Have a nice day!");
                    break;
                }
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Please try again, only option '1' or '2' is available\n" +
                        "Only enter option with numbers: ");
            }
        }
    }

    //Skapa en ny bokning
    private void menyOption1() {
        while (true) {
            try {
                System.out.println("1. Regular guest\n" +
                        "2. VIP guest\n" +
                        "Choose type of guest: ");
                int typeGuest = scan.nextInt();
                if (typeGuest == 1) {
                    newGuest();
                    break;
                } else if (typeGuest == 2) {
                    newVipGuest();
                    break;
                }
            } catch (Exception e) {
                scan.next();
                System.out.println("Error, please try again\n" +
                        "Only option '1' and '2' is available, enter option with numbers only");
            }
        }
    }

    //Se alla tidigare bokningar
    private void menyOption2() {
        for (RegularGuest guest : bookings) {
            System.out.println(guest.name + " has phone number " + guest.phoneNr);
        }
    }

    //Skapar en "regular" gäst
    private void newGuest() {
        while (true) {
            try {
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
                break;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("line 101 error");
                System.out.println("Error, please try again\n" +
                        "Only use numbers while entering phone number and age\n");
            }
        }
    }

    //Skapar en "VIP" gäst
    private void newVipGuest() {
        while (true) {
            try {
                System.out.println("Enter age: ");
                int age = scan.nextInt();
                System.out.println("Enter phone number: ");
                int phoneNr = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter name: ");
                String name = scan.nextLine();
                System.out.println("Your name is: " + name + "\n" +
                        "Your age is " + age + "\n" +
                        "Your phone number is: " + phoneNr);
                VipGuest guest = new VipGuest(name, age, phoneNr);
                guest.addRoom();
                bookings.add(guest);
                break;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Error, please try again\n" +
                        "Only use numbers while entering phone number and age\n");
            }
        }
    }
}