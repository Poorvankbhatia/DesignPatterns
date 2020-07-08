package factorypattern.shapes.factory;

import factorypattern.shapes.shape.Circle;
import factorypattern.shapes.shape.Line;
import factorypattern.shapes.shape.Shape;
import factorypattern.shapes.ShapeType;

public class GeometricShapeFactory extends ShapeFactory {
    @Override
    Shape getShape(ShapeType shapeName) {
        switch (shapeName) {
            case LINE:
                return new Line();
            case CIRCLE:
                return new Circle();
            default:
                return null;
        }
    }
}
