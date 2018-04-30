import java.util.*;

public class ElementFinder {
    public static void main(String... args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        containsSeven(arrayList);
    }

    public static void containsSeven(ArrayList<Integer> arrayList) {

        if (arrayList.contains(7)) {
            System.out.println("Horrayyy");
        } else {
            System.out.println("Nooooooo");
        }
    }
}

