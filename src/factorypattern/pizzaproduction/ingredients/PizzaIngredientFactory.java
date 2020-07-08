package factorypattern.pizzaproduction.ingredients;

/*
This factory is responsible for creating each ingredient in the ingredient family.

 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Veggies[] createVeggies();
    Cheese createCheese();

}
