import java.util.*;

public class SolarSystem{
    public static void main(String... args){

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        String saturn = "Saturn";
        planetList.add(5, saturn);

        putSaturn(planetList);
    }

    public static void putSaturn(ArrayList planetList) {

        System.out.println(planetList);
    }
}
