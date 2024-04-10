import java.util.Scanner;

public class Guest {
    Scanner scan = new Scanner(System.in);
    protected String name;
    protected int age;
    protected Room room;

    protected Guest(String name, int age, Room room){
        this.name = name;
        this.age = age;
        this.room = room;
    }

    protected void addRoom(){
        System.out.println("What type of room do you want to book?");
        System.out.println("1. Regular Room /" +
                "2. VIP Room");
        int roomOption = scan.nextInt();
        System.out.println("You have chosen option nr. " +roomOption);
        if(roomOption == 1){
            this.room = new RegularRoom(113, 1234, true, room.guest);
        } else if (roomOption == 2) {
            this.room = new VipRoom(5, 2356, true, room.guest);
        }
    }

    protected void seeBooking(String name, int roomNr){
    }
}
