package templatepattern.beverage;

public class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon.");
    }
}
