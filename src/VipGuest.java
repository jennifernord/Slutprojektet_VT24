//Klass som skapar VIP gäst
public class VipGuest extends RegularGuest {

    int privilege;

    //Konstruktor
    protected VipGuest(String name, int age, int phoneNr) {
        super(name, age, phoneNr);
    }

    //Ger "VIP" gästen ett "VIP" rum
    protected void addRoom() {
        System.out.println("Enter hotel you want to book the room in: ");
        String hotelName = scan.nextLine();
        Hotel hotel = new Hotel(hotelName);
        while (true) {
            try {
                System.out.println("Enter number of beds needed: ");
                int beds = scan.nextInt();
                System.out.println("Choose a privilege: \n" +
                        "1. Breakfast in bed\n" +
                        "2. Poolside view\n" +
                        "3. Balcony\n" +
                        "Enter option here: ");
                int privilege = scan.nextInt();
                System.out.println("You have chosen option " + privilege);
                this.room = new VipRoom(beds, hotel, privilege);
                System.out.println("You have booked a room with " + beds + " beds and privilege nr " + privilege);
                break;
            } catch (Exception e) {
                scan.next();
                System.out.println("Error, please try again\n" +
                        "Number of beds and privilege option should be entered with numbers");
            }
        }
    }
}