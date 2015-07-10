public class Circle {
    private double myRadius;

    public Circle(double radius) {
        myRadius = radius;
    }

    private double formatNumber(double number, int placesAfterDecimal) {
        double multiplier = Math.pow(10, placesAfterDecimal);
        return Math.floor(number * multiplier) / multiplier;
    }

    public double getRadius() {
        return formatNumber(myRadius, 2);
    }

    /**
     * gets the area of the circle
     */
    public double area() {
        return formatNumber(Math.PI * Math.pow(myRadius, 2), 2);
    }

    public double circumference() {
        return formatNumber(Math.PI * myRadius * 2, 2);
    }

    public Circle() {
        this(0.0);
    }
}
