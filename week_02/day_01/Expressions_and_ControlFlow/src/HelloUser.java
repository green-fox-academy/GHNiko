import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(("What is your name?"));
        String userName = scanner.nextLine();
        String printName = Character.toUpperCase(userName.charAt(0)) + userName.substring(1);

        System.out.println("Hello, " + printName + "!");
    }
}
