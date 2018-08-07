import java.util.ArrayList;
import java.util.Arrays;

public class quotesWap {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().
        quoteSwap(list);

        // Also, print the sentence to the output with spaces in between.
        // Expected output: "What I cannot create I do not understand."

    }
    public static ArrayList<String> quoteSwap(ArrayList<String> list) {

        list.set(2, "cannot");
        list.set(5, "do");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        return list;
    }
}
