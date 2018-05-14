import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter the second integer: ");
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            System.out.println("The second number should be bigger!");
        } else {
            for (int i = num1; i < num2; i++) {
                System.out.println(i);
            }
        }
    }
}
