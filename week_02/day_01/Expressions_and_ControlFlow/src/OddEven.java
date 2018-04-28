import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Enter an integer:"));
        int input = scanner.nextInt();

        if ((input % 2) == 0) {
            System.out.println(("The entered number is even."));
        } else {
            System.out.println(("The entered number is odd."));
        }
    }
}
