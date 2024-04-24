import java.util.Scanner;

public class RegularRoom extends Room{

    Scanner scan = new Scanner(System.in);
    Hotel hotel;

    protected RegularRoom(int beds, Hotel hotel){
        super(beds, hotel);
    }
}
