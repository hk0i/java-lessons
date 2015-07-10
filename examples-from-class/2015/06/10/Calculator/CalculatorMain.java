import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pick an operation: +, *");
        char operation;

        while (!input.hasNextChar()) {
            input.nextLine();
        }
        input.nextChar();

    }

}
