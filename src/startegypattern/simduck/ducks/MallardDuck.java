package startegypattern.simduck.ducks;
import startegypattern.simduck.behaviours.FlyWithWings;
import startegypattern.simduck.behaviours.Squeak;

public class MallardDuck extends Duck {

    /**
     * Mallard duck uses Squeak behaviour for quack and FlyWithWings behaviour for flying.
     */
    public MallardDuck() {
        quackingBehaviour = new Squeak();
        flyingBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
