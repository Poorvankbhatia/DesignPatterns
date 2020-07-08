package factorypattern.pizzaproduction.pizzastore;

import factorypattern.pizzaproduction.pizza.Pizza;

/*
Abstract class which defines the abstract factory method that the subclass implement to produce product.
it contains code that depends on an abstract class (Pizza) It never really knows which concrete product was
produced.
 */
public abstract class PizzaStore {

    /*
    This method in the superclass has no clue which Pizza we are creating; it just knows it can prepare, bake, cut, and box it!
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // Factory method in abstract PizzaStore
    public abstract Pizza createPizza(String type);

}
