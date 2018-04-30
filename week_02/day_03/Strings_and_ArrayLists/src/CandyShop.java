import java.util.*;

public class CandyShop {
    public static void main(String... args) {

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }

    public static ArrayList<Object> sweets(ArrayList<Object> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {

            if (i == 1) {
                arrayList.set(i, "Croissant");
            } else if (i == 3) {
                arrayList.set(i, "Ice cream");
            } else {
                continue;
            }
        }
        return arrayList;
    }
}
