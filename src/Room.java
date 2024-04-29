//Klass som skapar rum
public abstract class Room {
    protected int beds;
    protected Hotel hotel;

    //Konstruktor
    protected Room(int beds, Hotel hotel) {
        this.beds = beds;
        this.hotel = hotel;
    }
}
