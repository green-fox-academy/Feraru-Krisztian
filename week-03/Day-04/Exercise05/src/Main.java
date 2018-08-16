public class Main {
    public static void main(String[] args) {

        Car toyota = new Car();
        Station OMW = new Station(5000);

        OMW.refill(toyota);
        System.out.println(toyota.gasAmount);
        System.out.println(OMW.gasAmount);

    }
}
