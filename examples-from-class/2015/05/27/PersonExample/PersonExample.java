public class PersonExample {
    public static void main(String[] args) {
        Person miguel = new Person("Miguel");
        Person thomas = new Person("Thomas");
        Person gregory = new Person("Gregory");

        System.out.println(miguel.getFirstName());
        System.out.println(thomas.getFirstName());
        System.out.println(gregory.getFirstName());
    }
}
