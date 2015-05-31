public class Person {
    private String myFirstName;
    private String myLastName;

    private String myDateOfBirth;
    private double myHeight;
    private String myEyeColor;

    public Person(String firstName) {
        myFirstName = firstName;
    }

    public String getFirstName() {
        return myFirstName;
    }

    public String getLastName() {
        return myLastName;
    }

    public String getDateOfBirth() {
        return myDateOfBirth;
    }

    public double getHeight() {
        return myHeight;
    }

    public String getEyeColor() {
        return myEyeColor;
    }
}
