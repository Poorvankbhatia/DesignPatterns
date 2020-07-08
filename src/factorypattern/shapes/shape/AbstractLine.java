package factorypattern.shapes.shape;

public class AbstractLine extends Shape {
    @Override
    public void draw() {
        System.out.println("Abstract line.");
    }
}
