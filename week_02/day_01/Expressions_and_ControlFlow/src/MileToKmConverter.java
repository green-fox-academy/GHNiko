import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the distance in kilometers:");

        int kilometers = scanner.nextInt();
        double miles = kilometers * 0.62;

        System.out.println((kilometers + "km is " + miles + "mi."));
    }
}
