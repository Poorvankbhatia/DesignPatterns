package factorypattern.pizzaproduction.pizza;
import factorypattern.pizzaproduction.ingredients.PizzaIngredientFactory;

/*
Encapsulates all the knowledge on how to produce NYStyleCheesePizza.
 */
public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory nyPizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory nyPizzaIngredientFactory) {
        this.nyPizzaIngredientFactory = nyPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = nyPizzaIngredientFactory.createDough();
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
