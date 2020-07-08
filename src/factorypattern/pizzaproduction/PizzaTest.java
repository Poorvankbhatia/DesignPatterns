package factorypattern.pizzaproduction;

import factorypattern.pizzaproduction.pizza.Pizza;
import factorypattern.pizzaproduction.pizzastore.ChicagoStylePizzaStore;
import factorypattern.pizzaproduction.pizzastore.NYStylePizzaStore;

public class PizzaTest {

    public static void main(String[] args) {
        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
        pizza = chicagoStylePizzaStore.orderPizza("cheese");

    }

}
