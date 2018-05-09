public class Main {

    public static void main(String[] args) {

        Sharpie sharpie = new Sharpie("red", 45);
        System.out.println(sharpie.inkAmount);
        sharpie.use(5);
        System.out.println(sharpie.inkAmount);

        Sharpie sharpie1 = new Sharpie();
        sharpie1.color = "black";
        System.out.println(sharpie1.color);

    }
}
