public class ToDo {
    public static void main(String[] args) {

        String todoText = " - Buy milk\n";

        StringBuilder newToDo = new StringBuilder(todoText);
        newToDo.insert(0, "My todo:\n");
        newToDo.append(" - Download games\n\t - Diablo");

        System.out.println(newToDo);
    }
}
