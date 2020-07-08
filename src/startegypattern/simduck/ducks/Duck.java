package startegypattern.simduck.ducks;

import startegypattern.simduck.behaviours.FlyingBehaviour;
import startegypattern.simduck.behaviours.QuackingBehaviour;

/**
 * Duck class is the super class of every duck. But we have pulled out flying and quacking into another class
 * structure.
 */
public abstract class Duck {

    /**
     * Since not all the subclasses will have flying or quacking behaviour.
     * We want to assign behaviours to duck at runtime.
     * Duck behaviours live in a separate class, Duck classes won't require implementation details of these.
     * Duck classes don't implement these behaviours instead there are classes which represent these behaviours.
     * Each duck object will set these behaviours polymorphically to reference the specific behaviour type.
     */

    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;

    /**
     * Delegation to behavior class.
     */
    public void performQuack() {
        quackingBehaviour.quack();
    }

    /**
     * Delegation to behavior class.
     */
    public void performFly() {
        flyingBehaviour.fly();
    }

    /**
     * Change flyingBehaviour at run time.
     */
    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    /**
     * Change quackBehaviour at run time.
     */
    public void setQuackingBehaviour(QuackingBehaviour quackingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
    }

    public void swim() {
        System.out.println("All ducks swim.");
    }

    public abstract void display();
}
