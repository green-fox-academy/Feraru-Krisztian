public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public String getCompany() {
        return company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm" + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents += 1;
    }

    @Override
    public void getGoal() {
        System.out.print("Hire brilliant junior software developers.");
    }
}
