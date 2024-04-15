public class Room {
    protected int roomNr;
    protected Guest guest;
    protected Hotel hotel;

    protected Room(int roomNr, Guest guest, Hotel hotel){
        this.roomNr = roomNr;
        this.guest = guest;
        this.hotel = hotel;
    }

    public void addRoom(){
        System.out.println();
    }
}
