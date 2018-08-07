import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class matchMaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        ArrayList<String> output = new ArrayList<String>(makingMatches(girls, boys));

        System.out.println(output);


    }
    public static ArrayList<String> makingMatches(ArrayList<String> list1, ArrayList<String>list2) {

        ArrayList<String> matches = new ArrayList<String>();

        for(int i = 0; i < (list1.size() + list2.size()) /2; i++) {

            matches.add(list1.get(i));
            matches.add(list2.get(i));

        }

        return matches;
    }
}
