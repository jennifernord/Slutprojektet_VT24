public class VipRoom extends RegularRoom{
    int privilege;
    protected VipRoom(int beds, Hotel hotel, int privilege) {
        super(beds, hotel);
        this.privilege = privilege;
    }
}
