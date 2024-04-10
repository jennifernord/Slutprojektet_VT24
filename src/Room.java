public class Room {
    protected int roomNr;
    protected int roomPin;
    protected boolean cleanlinessStatus;
    protected Guest guest;

    protected Room(int roomNr, int roomPin, boolean cleanlinessStatus, Guest guest){
        this.roomNr = roomNr;
        this.roomPin = roomPin;
        this.cleanlinessStatus = cleanlinessStatus;
        this.guest = guest;
    }

    public void addRoom(){
        System.out.println("");
    }

    protected boolean cleanRoom(int roomNr, boolean cleanlinessStatus){
        return cleanlinessStatus;
    }
}
