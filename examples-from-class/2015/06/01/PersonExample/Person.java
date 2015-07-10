public class Person {
    private String myFirstName;
    private String myLastName;

    private String myDateOfBirth;
    private double myHeight;
    private String myEyeColor;

    public Person(String firstName, String lastName) {
        myFirstName = firstName;
        myLastName = lastName;

        myDateOfBirth = "";
        myEyeColor = "";
        myHeight = 0.0;
    }

    public Person(String firstName) {
        myFirstName = firstName;
        myLastName = "";

        myDateOfBirth = "";
        myEyeColor = "";
        myHeight = 0.0;
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

