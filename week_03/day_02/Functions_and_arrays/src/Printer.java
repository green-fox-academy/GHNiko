import java.util.ArrayList;
import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourh")
        // ...

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