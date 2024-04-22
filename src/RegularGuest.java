import java.util.Scanner;
public class RegularGuest extends Guest{
    Scanner scan = new Scanner(System.in);
    protected RegularGuest(String name, int age, int phoneNr, Room room){
        super(name, age, phoneNr, room);
        System.out.println("Enter name: ");
        this.name = scan.nextLine();
        System.out.println("Enter age: ");
        this.age = scan.nextInt();
        System.out.println("Enter phone number: ");
        this.phoneNr = scan.nextInt();
        addRoom();
    }

    protected void addRoom(){
        System.out.println("What hotel do you want to book a room in?\n" +
                "1. Grand Hotel, Stockholm\n" +
                "2. Hotel Royal, Göteborg\n" +
                "3. Vejby Hotel, Skåne\n" +
                "Enter hotel: ");
        int hotelOption = scan.nextInt();
        if (hotelOption == 1){
            System.out.println("You have chosen Grand Hotel in Stockholm");
        }
    }
}
