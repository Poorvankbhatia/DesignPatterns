package startegypattern.simduck;

import startegypattern.simduck.behaviours.FlyWithWings;
import startegypattern.simduck.ducks.Duck;
import startegypattern.simduck.ducks.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.setFlyingBehaviour(new FlyWithWings());
        mallardDuck.performFly();
    }

}
