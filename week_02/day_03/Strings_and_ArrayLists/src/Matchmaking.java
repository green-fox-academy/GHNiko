import java.lang.reflect.Array;
import java.util.*;

public class Matchmaking {
    public static void main(String... args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

        String[] girl = new String[girls.size()];
        girl = girls.toArray(girl);
        String[] boy = new String[boys.size()];
        boy = boys.toArray(boy);

        String[] matched = new String[girls.size() + boys.size()];

        System.out.println(Matchmaking(girl, boy, matched));
    }

    public static ArrayList<String> Matchmaking(String[] girl, String[] boy, String[] matched) {

        for (int i = 0; i < matched.length; i++) {
            if (i % 2 == 0 && i / 2 < girl.length) {
                matched[i] = girl[i / 2];
            } else {
                matched[i] = boy[i / 2];
            }
        }

        ArrayList<String> matchedToAL = new ArrayList<>(Arrays.asList(matched));
        return matchedToAL;
    }
}
