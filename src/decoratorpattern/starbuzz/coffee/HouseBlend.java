package decoratorpattern.starbuzz.coffee;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 2.32;
    }

}
