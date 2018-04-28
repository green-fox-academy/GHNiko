public class TakesLonger {

    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String missingWords = "always takes longer than ";
        StringBuilder addWords = new StringBuilder(quote);
        addWords.insert(21, missingWords);
        addWords.insert()

        System.out.println(addWords);
    }
}
