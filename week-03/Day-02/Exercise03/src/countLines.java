import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class countLines {
    public static void main(String[] args) {

        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        System.out.println(numberOfLines("file.txt"));

    }

    public static int numberOfLines(String fileName) {
        int counter = 0;
        Path path = Paths.get(fileName);
        List<String> linesList;
        try {
            linesList = Files.readAllLines(path);
            for (int i = 0; i < linesList.size(); i++) {
                counter++;
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }
        return counter;
    }
}
