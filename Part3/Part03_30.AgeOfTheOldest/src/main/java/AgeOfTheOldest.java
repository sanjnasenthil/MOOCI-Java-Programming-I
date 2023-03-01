
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> people = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        int oldest = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            people.add(input);
        }

        for (int i = 0; i < people.size(); i++) {
            String[] parts = people.get(i).split(",");
            ages.add(Integer.parseInt(parts[1]));
        }

        for (int x = 0; x < ages.size(); x++) {
            if (ages.get(x) > oldest) {
                oldest = ages.get(x);
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
