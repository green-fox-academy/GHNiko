import java.util.Scanner;

public class AppendAFunc {
    public static void main(String[] args) {

        String am = "kuty";
        System.out.println(appendA(am));
    }

    public static String appendA(String am) {
        am = am.concat("a");
        return am;
    }
}
