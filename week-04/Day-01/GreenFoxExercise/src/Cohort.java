import java.util.ArrayList;

public class Cohort {
    private String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public String getName() {
        return name;
    }

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.mentors = new ArrayList<Mentor>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
