public class PrintParams {
    public static void main(String[] args) {

        printParams("first");
        System.out.println();
        printParams("first", " second");
        System.out.println();
        printParams("first", " second", " third", " fourth");
        System.out.println();
    }
    public static void printParams(String... input) {

        for(String a : input) {
            System.out.print(a);
        }
    }
}
