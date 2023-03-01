
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        if (input.equals("")) {
            return;
        }
        
        String[] pieces = input.split(" ");
        int index = 0;
        while (!(input.equals("")) && index < pieces.length) {
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
                index++;
            }
            input = scanner.nextLine();
            pieces = input.split(" ");
            index = 0;
        }

        
    }
}
