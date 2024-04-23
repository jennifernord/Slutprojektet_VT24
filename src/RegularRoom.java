import java.util.Scanner;

public class RegularRoom extends Room{

    Scanner scan = new Scanner(System.in);

    public RegularRoom(int beds, Hotel hotel){
        super(beds, hotel);
        System.out.println("Enter how many beds you need: ");
        this.beds = scan.nextInt();
        addHotel();
    }

    protected void addHotel(){
        System.out.println("Enter hotel you want to book the room in: ");
        String hotelName = scan.nextLine();

        this.hotel = new Hotel(hotelName,);
    }
}
