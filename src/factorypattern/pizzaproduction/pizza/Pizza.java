package factorypattern.pizzaproduction.pizza;

import factorypattern.pizzaproduction.ingredients.Dough;
import factorypattern.pizzaproduction.ingredients.Peporoni;
import factorypattern.pizzaproduction.ingredients.Sauce;
import factorypattern.pizzaproduction.ingredients.Veggies;

/*
Factories produce product in our pizza store , our product is pizza.

 */
public abstract class Pizza {

    String name;
    Dough dough;
    Veggies[] veggies;
    Sauce sauce;
    Peporoni peporoni;

    public void prepare() {}
    public void bake() {}
    public void cut(){};
    public void box(){};

}
