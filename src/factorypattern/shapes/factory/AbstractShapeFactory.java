package factorypattern.shapes.factory;

import factorypattern.shapes.ShapeType;
import factorypattern.shapes.shape.AbstractLine;
import factorypattern.shapes.shape.Shape;

public class AbstractShapeFactory extends ShapeFactory {
    @Override
    Shape getShape(ShapeType shapeName) {
        switch (shapeName) {
            case LINE:
                return new AbstractLine();
            default:
                return null;
        }
    }
}
