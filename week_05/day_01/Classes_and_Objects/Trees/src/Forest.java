public class Forest {
    public static void main(String[] arngs) {

        Tree oak = new Tree();
        oak.type = "oak";
        oak.age = 45;
        oak.leafColor.add(0, "red");
        oak.leafColor.add(1, "yellow");
        oak.leafColor.add(1, "green");
        oak.sex = false;

        oak.print();
    }
}
