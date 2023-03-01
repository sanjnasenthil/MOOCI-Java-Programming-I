
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> people = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> year = new ArrayList<Integer>();
        int longestLength = 0;
        String longestName = "";
        int sum = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            people.add(input);
        }

        for (int i = 0; i < people.size(); i++) {
            String[] parts = people.get(i).split(",");
            names.add(parts[0]);
            year.add(Integer.parseInt(parts[1]));
        }

        for (int x = 0; x < names.size(); x++) {
            if (names.get(x).length() > longestLength) {
                longestLength = names.get(x).length();
                longestName = names.get(x);
            }
        }

        for (int y = 0; y < year.size(); y++) {
            sum += year.get(y);
        }
 
        System.out.println("Longest name:" + longestName);
        System.out.println("Average of the birth years:" + (double) sum / names.size());

    }
}
