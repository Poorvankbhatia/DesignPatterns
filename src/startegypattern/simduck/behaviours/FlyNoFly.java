package startegypattern.simduck.behaviours;

public class FlyNoFly implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly.");
    }
}
