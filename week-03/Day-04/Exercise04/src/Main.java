public class Main {
    public static void main(String[] args) {

        Teacher prof = new Teacher("Mr. John");
        Student elev = new Student("Ben");

        prof.teach();
        elev.learn();

        elev.question(prof);
        System.out.println("How many is 2" + " + " + "2 ?");
        prof.answer(elev);
        System.out.println("2" + " + " + "2 is 4 !");


    }
}
