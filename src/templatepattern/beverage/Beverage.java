package templatepattern.beverage;

public abstract class Beverage {

    /**
     * This is our template method.
     * It serves as a template for our algorithm, in our case an algorithm to make caffeinated beverages.
     * Each step is represented as a method, some handled by this class some by subclasses.
     * Used to make both tea and coffee.
     * Declared final so that subclasses won't be able to override this method and change recipe.
     */
    // This method controls the algorithm. No one can change this , and it counts on the subclasses to provide some or
    // all of the implementations.
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // Subclasses will handle below abstract functions.

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water.");
    }

    void pourInCup() {
        System.out.println("pouring to cup.");
    }

    // This is a hook because the subclass can override this method if it wants to.
    boolean customerWantsCondiments() {
        return true;
    }

}
