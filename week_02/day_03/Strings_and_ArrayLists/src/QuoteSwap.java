import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        System.out.println(quoteSwap(list));
    }

    public static String quoteSwap(ArrayList<String> list) {

        String temp = list.get(2);
        list.set(2, (list.get(5)));
        list.set(5, temp);

        String quote = String.join(" ", list);
        return quote;
    }
}
