
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here

        System.out.println("Give the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }
}
