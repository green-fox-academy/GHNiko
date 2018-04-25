import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer: ");
        int parameter = scanner.nextInt();

        System.out.println(sum(parameter));
    }

    private static int sum(int parameter) {
        int sum = 0;

        for (int i = 0; i < parameter; i++) {

            sum += i;
        }
        return sum;
    }
}
