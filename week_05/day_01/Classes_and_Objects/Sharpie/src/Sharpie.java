public class Sharpie {

    String color;
    float width;
    float inkAmount;

    public Sharpie () {
        this.inkAmount = 100f;
    }

    public Sharpie(String color, float width) {

        this.color = color;
        this.width = width;
        this.inkAmount = 100f;
    }

    public void use(float used) {

        this.inkAmount -= used;
    }
}
