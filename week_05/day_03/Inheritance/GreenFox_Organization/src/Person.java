public class Person {

    String name;
    int age;
    String gender;

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {

        System.out.printf("Hi, I'm %s, a %d year old %s. ", name, age, gender);
    }

    public void getGoal() {

        System.out.println("My goal is to live for the moment!");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.gender);
    }
}
