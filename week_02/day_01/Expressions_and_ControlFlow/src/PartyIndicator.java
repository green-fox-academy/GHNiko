import java.util.Scanner;

public class PartyIndicator {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of girls who come to the party:");
        int numberOfGirls = scanner.nextInt();

        System.out.println("Enter the number of boys who come to the party:");
        int numberOfBoys = scanner.nextInt();

        if (numberOfGirls == 0) {
            System.out.println("Sausage party.");
        } else if ((numberOfGirls + numberOfBoys >= 20) && (numberOfGirls == numberOfBoys)) {
            System.out.println("It is an excellent party!");
        } else if ((numberOfGirls + numberOfBoys >= 20) && (numberOfGirls != numberOfBoys)) {
            System.out.println("It is quite a cool party!");
        } else if (numberOfGirls + numberOfBoys < 20) {
            System.out.println("It is an average party.");
        }
        // --> this category should be the 2nd condition after the (numberOfGirls == 0)
        // } else if (numberOfBoys == 0) {
        //     System.out.println("Something else.");
        // }
    }
}
