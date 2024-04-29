//Klass som skapar ett VIP rum
public class VipRoom extends RegularRoom {
    int privilege;

    //Konstruktor
    protected VipRoom(int beds, Hotel hotel, int privilege) {
        super(beds, hotel);
        this.privilege = privilege;
    }
}
