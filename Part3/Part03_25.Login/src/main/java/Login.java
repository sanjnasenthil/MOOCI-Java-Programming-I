
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        int userIndex = 0;

        System.out.print("Enter username:");
        String username = scanner.nextLine();

        System.out.print("Enter password:");
        String password = scanner.nextLine();

        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i])) {
                userIndex = i;
            }
        }

        if (password.equals(passwords[userIndex])) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }


    }
}
