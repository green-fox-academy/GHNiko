public class TwoNumbers {
    public static void main(String[] args) {

        int firstNumber = 22;
        int secondNumber = 13;

        int sum = firstNumber + secondNumber;
        int subtr = secondNumber - firstNumber;
        int mult = firstNumber * secondNumber;
        float divis = (float) firstNumber / (float) secondNumber;
        int wholeNumberDiv = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println(sum);
        System.out.println(subtr);
        System.out.println(mult);
        System.out.println(divis);
        System.out.println(wholeNumberDiv);
        System.out.println(remainder);
    }
}
