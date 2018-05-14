import java.util.ArrayList;

public class Cohort {

    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        students = new ArrayList<Student>();
        mentors = new ArrayList<Mentor>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.printf("The %s cohort has %d students and %d mentors.", name, students.size(), mentors.size());
    }
}