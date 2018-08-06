public class Factorio {
    public static void main(String[] args) {

        System.out.println(factorio(5));
    }
    public static int factorio(int input) {

        int num = 1;
        for(int i = 1; i <= input; i++) {
            num *= i;
        }
        return num;
    }
}
