package likeLionTestQ.inheritance.Q3;

public class ShapeManager {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        Shape[] shapes3 = new Shape[2];

        shapes3[0] = new Circle();
        shapes3[1] = new Rectangle();

        for (Shape shapes : shapes3) {
            shapes.draw();
        }
    }
}
