public class Mentor extends Person {

    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }

    public void getGoal() {
        System.out.println("My goal is to educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.printf("Hello, I'm %s, a %d year old %s, %s level mentor. ", name, age, gender, level);
    }

}