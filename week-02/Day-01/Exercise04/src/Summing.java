public class Summing {
    public static void main(String[] args) {

        System.out.println(sum(5));
    }
    public static int sum(int number) {
        int sum = 0;

        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
