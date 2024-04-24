public abstract class Room {
    protected int beds;
    protected Hotel hotel;

    protected Room(int beds, Hotel hotel){
        this.beds = beds;
        this.hotel = hotel;
    }
}
