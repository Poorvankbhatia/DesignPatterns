package factorypattern.pizzaproduction.pizza;

import factorypattern.pizzaproduction.ingredients.ChicagoPizzaIngredientFactory;
import factorypattern.pizzaproduction.ingredients.PizzaIngredientFactory;

/*
The pizza code uses the factory to produce ingredients used in Pizza.
Ingredients produced depends on the factory we are using.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    PizzaIngredientFactory chicagoPizzaIngredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory chicagoPizzaIngredientFactory) {
        this.chicagoPizzaIngredientFactory = chicagoPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        sauce = chicagoPizzaIngredientFactory.createSauce();
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
