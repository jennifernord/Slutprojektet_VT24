import java.util.Scanner;

public class Guest {
    Scanner scan = new Scanner(System.in);
    protected String name;
    protected int age;
    protected int phoneNr;
    protected Room room;

    public Guest(String name, int age, int phoneNr, Room room){
        createGuest();
    }

    protected void createGuest(){
        System.out.println("Enter name: ");
        this.name = scan.nextLine();
        System.out.println("Enter age: ");
        this.age = scan.nextInt();
        System.out.println("Enter phoneNr");
        this.phoneNr = scan.nextInt();
        System.out.println("Your name is: " +name + "\n" +
                "Your age is: " +age +"\n" +
                "Your phone number is: " +phoneNr);
    }

    protected void addHotel(){
        System.out.println("Enter hotel: ");

    }
}
