
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here

        System.out.println("Write something:");
        boolean response = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("True or false? " + response);
    }
}
