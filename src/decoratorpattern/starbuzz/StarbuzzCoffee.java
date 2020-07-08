package decoratorpattern.starbuzz;

import decoratorpattern.starbuzz.coffee.Beverage;
import decoratorpattern.starbuzz.coffee.Expresso;
import decoratorpattern.starbuzz.decorator.Mocha;
import decoratorpattern.starbuzz.decorator.Soy;
import decoratorpattern.starbuzz.decorator.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage exp = new Expresso();

        Beverage mixedBeverage = new Mocha(exp);
        mixedBeverage = new Whip(mixedBeverage);
        mixedBeverage = new Soy(mixedBeverage);
        System.out.println(mixedBeverage.getDescription() +" "+mixedBeverage.cost());
    }

}


