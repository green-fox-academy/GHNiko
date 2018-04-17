import java.util.Scanner;

public class PartyIndicator {
    public static void main(String [] args) {

        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

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
