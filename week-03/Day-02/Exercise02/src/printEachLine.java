import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class printEachLine {
    public static void main(String[] args) throws FileNotFoundException {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"

        try {
            File myFile = new File("C:/Users/ferar/Desktop/greenfox/kovkrasz/week-03/Day-02/Exercise02/my-file.txt");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        } catch (NoSuchElementException e) {
            System.out.println("Missing file: my-file.txt");
        }
    }
}