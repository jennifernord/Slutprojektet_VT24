import java.util.Scanner;

public class RegularRoom extends Room{

    Scanner scan = new Scanner(System.in);

    protected RegularRoom(int beds){
        super(beds);
        this.beds = beds;
    }

    public void addHotelRegularGuest(){
        addHotel();
    }
    protected void addHotel(){
        System.out.println("Enter hotel you want to book the room in: ");
        String hotelName = scan.nextLine();
        this.hotel = new Hotel(hotelName);
    }
}
