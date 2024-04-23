import java.util.Scanner;

public class Hotel {
    Scanner scan = new Scanner(System.in);
    String hotelName;
    City city;

    Hotel(String hotelName){
        this.hotelName = hotelName;
    }

    private void addCity(){
        System.out.println("Vilken stad?: ");
        String cityName = scan.nextLine();
        this.city = new City(cityName, this);
    }

}
