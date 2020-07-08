package factorypattern.pizzaproduction.pizzastore;

import factorypattern.pizzaproduction.ingredients.ChicagoPizzaIngredientFactory;
import factorypattern.pizzaproduction.ingredients.PizzaIngredientFactory;
import factorypattern.pizzaproduction.pizza.ChicagoStyleCheesePizza;
import factorypattern.pizzaproduction.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese" : return new ChicagoStyleCheesePizza(pizzaIngredientFactory);
            default: return null;
        }
    }
}
