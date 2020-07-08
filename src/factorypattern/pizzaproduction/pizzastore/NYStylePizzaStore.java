package factorypattern.pizzaproduction.pizzastore;

import factorypattern.pizzaproduction.ingredients.NYPizzaIngredientFactory;
import factorypattern.pizzaproduction.ingredients.PizzaIngredientFactory;
import factorypattern.pizzaproduction.pizza.NYStyleCheesePizza;
import factorypattern.pizzaproduction.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese" : return new NYStyleCheesePizza(pizzaIngredientFactory);
            default: return null;
        }
    }
}
