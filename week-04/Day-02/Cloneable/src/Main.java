public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("John", 20, "male", "BME");

        try {
            Student stud2 = stud1.clone();
            System.out.println(stud2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
