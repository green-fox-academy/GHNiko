import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Enter an integer:"));
        int input = scanner.nextInt();

        if (input <= 0) {
            System.out.println(("Not enough."));
        } else if (input == 1) {
            System.out.println(("One."));
        } else if (input == 2) {
            System.out.println(("Two."));
        } else {
            System.out.println(("A lot."));
        }
    }
}
