public class Reverse {
    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // EZ:
        String reversedString = new StringBuilder(reversed).reverse().toString();
        System.out.println(reversedString);

        // Else:
        reverse(reversed);
        System.out.println(reverse(reversed));

    }
    public static String reverse(String reversed) {

        String reversedString2 = "";
        for (int i = 0; i < reversed.length(); i++) {
            reversedString2 += reversed.charAt(reversed.length() - 1 - i);
        }
        return reversedString2;
    }
}
