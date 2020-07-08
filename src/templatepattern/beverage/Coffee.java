package templatepattern.beverage;

public class Coffee extends Beverage {


    @Override
    void brew() {
        System.out.println("Dripping coffee via filter.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk.");
    }
}
