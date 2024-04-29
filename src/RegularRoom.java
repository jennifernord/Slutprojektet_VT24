//Klass som skapar ett "Regular" rum
public class RegularRoom extends Room {
    Hotel hotel;

    //Rummets attribut
    protected RegularRoom(int beds, Hotel hotel) {
        super(beds, hotel);
    }
}
