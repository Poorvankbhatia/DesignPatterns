package factorypattern.shapes.factory;

import factorypattern.shapes.ShapeType;
import factorypattern.shapes.shape.Shape;

public abstract class ShapeFactory {

    public Shape drawShape(ShapeType shapeName) {
        Shape s = getShape(shapeName);
        s.display();
        s.draw();
        return s;
    }

    abstract Shape getShape(ShapeType shapeName);

}
