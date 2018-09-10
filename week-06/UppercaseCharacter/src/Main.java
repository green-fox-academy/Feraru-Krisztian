import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string = new String("UppercaseCharacter");
        String uppercaseCharacters = string
                .chars()
                .filter((c) -> Character.isUpperCase(c))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println("The uppercase characters are " + uppercaseCharacters);
    }
}
