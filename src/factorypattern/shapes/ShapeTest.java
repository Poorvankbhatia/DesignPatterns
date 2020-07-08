package factorypattern.shapes;

import factorypattern.shapes.factory.AbstractShapeFactory;
import factorypattern.shapes.factory.GeometricShapeFactory;
import factorypattern.shapes.factory.ShapeFactory;
import factorypattern.shapes.shape.Shape;

public class ShapeTest {

    public static void main(String[] args) {
        GeometricShapeFactory geometricShapeFactory = new GeometricShapeFactory();
        geometricShapeFactory.drawShape(ShapeType.LINE);

        AbstractShapeFactory abstractShapeFactory = new AbstractShapeFactory();
        abstractShapeFactory.drawShape(ShapeType.LINE);
    }

}
