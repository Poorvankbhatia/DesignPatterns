package decoratorpattern.starbuzz.decorator;

import decoratorpattern.starbuzz.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
