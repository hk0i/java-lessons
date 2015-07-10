public class PersonExample {
    public static void main(String[] args) {
        Person miguel = new Person("Miguel", "Acosta");
        Person thomas = new Person("Thomas", 1.0);
        Person gregory = new Person("Gregory", "McQuillan");

        System.out.println(miguel.getFirstName() + " " + miguel.getLastName());
        System.out.println(thomas.getFirstName() + " " + thomas.getLastName());
        System.out.println(gregory.getFirstName() +  " " + gregory.getLastName());
    }
}

