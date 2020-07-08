package adapterpattern.turkeyadaptor;

public class DuckTestDrive {

    public static void main(String[] args) {
        TurkeyAdapter newDuck = new TurkeyAdapter(new WildTurkey());
        newDuck.fly();
        newDuck.quack();
    }

}
