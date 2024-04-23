public class VipRoom extends RegularRoom{
    int privilege;
    protected VipRoom(int beds, int privilege) {
        super(beds);
        this.privilege = privilege;
    }
}
