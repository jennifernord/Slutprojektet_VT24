import java.util.Scanner;

public class RegularRoom extends Room{

    Scanner scan = new Scanner(System.in);
    Hotel hotel;

    protected RegularRoom(int beds, Hotel hotel){
        super(beds, hotel);
    }

    protected void addHotel(){
        System.out.println("Enter hotel you want to book the room in: ");
        String hotelName = scan.nextLine();
        this.hotel = new Hotel(hotelName);
    }
}
