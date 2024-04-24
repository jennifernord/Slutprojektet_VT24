//Klass som skapar ett vanligt rum
public class RegularRoom extends Room{
    Hotel hotel;

    //Rummets attribut
    protected RegularRoom(int beds, Hotel hotel){
        super(beds, hotel);
    }
}
