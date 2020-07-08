package adapterpattern.boatadapter;

public class RowBoatAdapter extends RowBoat {

    private SailBoat sailBoat;

    public RowBoatAdapter(SailBoat sailBoat) {
        this.sailBoat = sailBoat;
    }


    @Override
    public void row() {
        sailBoat.sail();
    }
}