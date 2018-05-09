public class Animal {

    int hunger;
    int thirst;

    public Animal() {

        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {

        this.hunger -= 1;
    }

    public void drink() {

        this.thirst -= 1;
    }

    public void play() {

        this.hunger += 1;
        this.thirst += 1;
    }


// Test:
    public static void main(String[] args) {

        Animal cheetah = new Animal();
        System.out.println(cheetah.thirst);
        cheetah.play();
        System.out.println(cheetah.thirst);
        System.out.println(cheetah.hunger);
        cheetah.eat();
        cheetah.drink();
    }
}