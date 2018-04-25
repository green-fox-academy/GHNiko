import java.util.ArrayList;
import java.util.Scanner;

// I used int variables (instead of String ones) for some mysterious reason

public class Printer {
    public static void main(String[] args) {

        printer();
    }

    public static void printer() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userArray = new ArrayList<>();

        System.out.println("Type in the text you would like to add to the list. Type 'done' (without ' ') " +
                "if you finished adding elements to your list.");
        String input = scanner.nextLine();

        while (!input.equals("done")) {
            userArray.add(input);
            input = scanner.nextLine();
        }

        System.out.println(userArray);
    }
}