public class Geometry {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20.0, 10.0);
        Rectangle r2 = new Rectangle();
        Circle c1 = new Circle(5.0);

        System.out.println("Rectangle 1: " + r1.getLength() + "x" + r1.getHeight());
        System.out.println("Rectangle 2: " + r2.getLength() + "x" + r2.getHeight());
        System.out.println("Circle 1: Radius: " + c1.getRadius()
                + " area: " + c1.area() + ", circumference: " + c1.circumference());

        Square s1 = new Square(25.0);
        System.out.println("Square 1: " + s1.getLength()
                + ", area: " + s1.area()
                + ", perimeter: " + s1.perimeter());

        Rectangle r3 = new Square(12.0);
        System.out.println("Rectangle 3: " + r3.getLength()
                + "x" + r3.getHeight()
                + ", area: " + r3.area()
                + ", perimeter: " + r3.perimeter());

    }
}
