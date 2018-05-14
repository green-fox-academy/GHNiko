public class Sponsor extends Person{

    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        this.name = "Joan Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
    }

    public void introduce() {
        System.out.printf("Hello, I'm %s, a %d year old %s who repesents %s and has hired %d students this far. ",
                name, age, gender, company, hiredStudents);
    }

    public void hire() {

        this.hiredStudents = hiredStudents + 1;
    }

    public void getGoal() {

        System.out.println("My goal is to hire brilliant junior software developers.");
    }
}
