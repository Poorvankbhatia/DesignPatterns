package adapterpattern.boatadapter;

public class Captain {

    public RowBoat rowBoat;

    public Captain(RowBoat rowBoat) {
        this.rowBoat = rowBoat;
    }

    public void row() {
        rowBoat.row();
    }
}
