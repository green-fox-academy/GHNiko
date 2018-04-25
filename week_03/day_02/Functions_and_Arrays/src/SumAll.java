import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {

        int[] ai = {3, 4, 5, 6, 7};
        int sum = 0;

        for (int i = 0; i < ai.length; i++) {
            sum += ai[i];
        }

    //  An alternative:
        int sum1 = 0;
        for (int i : ai) {
            sum1 += i;
        }

        System.out.println(sum);
        System.out.println(sum1);
    }
}
