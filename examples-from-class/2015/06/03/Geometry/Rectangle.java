public class Rectangle {
    protected double myLength;
    protected double myHeight;

    public Rectangle(double length, double height) {
        myLength = length;
        myHeight = height;
    }

    public Rectangle() {
        this(0.0, 0.0);
    }

    public double getLength() {
        return myLength;
    }

    public double getHeight() {
        return myHeight;
    }

    public double area() {
        return myHeight * myLength;
    }

    public double perimeter() {
        return (myHeight * 2) + (myLength * 2);
    }

}
