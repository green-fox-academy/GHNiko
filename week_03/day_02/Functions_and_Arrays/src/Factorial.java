import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter an integer: ");
        int enteredNumber = scanner.nextInt();

        System.out.println(factorio(enteredNumber));
    }

    public static int factorio(int enteredNumber) {

        int factorial = 1;

        for (int i = 1; i <= enteredNumber; i++) {

            factorial *= i;
        }
        return factorial;
    }
}
