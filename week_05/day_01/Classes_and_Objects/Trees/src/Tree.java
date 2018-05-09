import java.util.ArrayList;
import java.util.Arrays;

public class Tree {

    String type;
    ArrayList<String> leafColor = new ArrayList<>(Arrays.asList());
    int age;
    boolean sex;

    public Tree(){}

    public void print() {
        System.out.printf("This is a(n) %s tree. ", type);
        System.out.printf("The leaf colors of the %s tree are the following: %s. ", type, leafColor);
        System.out.printf("The age of the %s tree is %d years. ", type, age);
        System.out.printf("The sex of the %s tree is '%s'. Wait. I have no idea.", type, sex);
    }
}
