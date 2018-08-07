import java.util.ArrayList;
import java.util.Arrays;

public class solarSystem {
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        putSaturn(planetList);
        System.out.println(planetList);

        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
    }
    public static ArrayList<String> putSaturn(ArrayList<String> list) {

        list.add(7, "Saturn");

       return list;
    }
}
