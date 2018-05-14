public class Student extends Person {

    String prevOrganization;
    int skippedDays;

    public Student() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.prevOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String prevOrganization) {
        super(name, age, gender);
        this.prevOrganization = prevOrganization;
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("My goal is to be a junior software developer.");
    }

    public void introduce() {
        System.out.printf("Hello, I'm %s, a %d year old %s from %s who skipped %d days from the course already. ",
                name, age, gender, prevOrganization, skippedDays);
    }

    public void skipDays(int numberOfDays) {

        this.skippedDays += numberOfDays;
    }


}
