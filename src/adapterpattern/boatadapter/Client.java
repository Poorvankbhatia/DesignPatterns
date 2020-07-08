package adapterpattern.boatadapter;

public class Client {

    public static void main(String[] args) {
        Captain captain = new Captain(new RowBoatAdapter(new SailBoat()));
        captain.row();
    }

}
