package adapterpattern.turkeyadaptor;

/*
Implement the interface of the type you are adapting to..

 */
public class TurkeyAdapter implements Duck {

    /*
    Reference of the object that we are adapting.
     */
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0;i<5;i++) {
            turkey.fly();
        }
    }
}
