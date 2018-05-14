import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int numOfChickens = scanner.nextInt();

        System.out.println("Enter another integer: ");
        int numOfPiggies = scanner.nextInt();

        int legs = numOfChickens * 2 + numOfPiggies * 4;
        System.out.printf("The %d chickens and the %d piggies have %d legs in total.", numOfChickens, numOfPiggies, legs);
    }
}
