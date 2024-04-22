import java.util.ArrayList;
import java.util.Scanner;

public class Meny {
    public Meny(){MenuStart();}
    Scanner scan = new Scanner(System.in);
    private void MenuStart(){
        //Skapar listor på hotell och städer
        ArrayList<Hotel> hotelList = new ArrayList<>();
        ArrayList<City> cityList = new ArrayList<>();
        ArrayList<RegularRoom> regularRooms = new ArrayList<>();

        //Skapar olika städer och hotell
        cityList.add(new City("Sweden", "Stockholm"));
        cityList.add(new City("Sweden", "Göteborg"));
        cityList.add(new City("Sweden", "Skåne"));

        hotelList.add(new Hotel("Grand Hotel", cityList.get(0)));
        hotelList.add(new Hotel("Hotel Royal", cityList.get(1)));
        hotelList.add(new Hotel("Vejby Strand Hotel", cityList.get(2)));

        regularRooms.add(new RegularRoom(1, hotelList.get(0)));
        regularRooms.add(new RegularRoom(2, hotelList.get(0)));
        regularRooms.add(new RegularRoom(1, hotelList.get(1)));
        regularRooms.add(new RegularRoom(2, hotelList.get(1)));
        regularRooms.add(new RegularRoom(1, hotelList.get(2)));
        regularRooms.add(new RegularRoom(2, hotelList.get(2)));

        System.out.println("1. Create booking\n" +
                "2. See available hotels\n" +
                "3. ...\n" +
                "Enter option: ");
        int option = scan.nextInt();
        if (option == 1){
            System.out.println("1. Regular guest\n" +
                    "2. VIP guest\n" +
                    "Choose type of guest: ");
            int typeGuest = scan.nextInt();
            if (typeGuest == 1){
                new RegularGuest();
            }
            if (typeGuest == 2){

            }
        }
        if (option == 2){
            for (Hotel hotel : hotelList){
                System.out.println(hotel.hotelName +" is in the city " +hotel.city.name +", " +hotel.city.country);
            }
        }
    }
}
