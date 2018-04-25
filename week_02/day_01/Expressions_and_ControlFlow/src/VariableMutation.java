public class VariableMutation {
    public static void main(String [] args) {

        int a = 3;
        // make it bigger by 10
        a += 10;
        System.out.println(a);

        int b = 100;
        // make it smaller by 7
        b -= 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        double cube = Math.pow(e, 3);
        System.out.println(cube);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean greater = f1 > f2;
        System.out.println((greater));

        // if (f1 > f2) {
        //    System.out.println("f1 is greater than f2.");
        // } else {
        //    System.out.println(("f1 is not greater than f2"));
        // }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean greater1 = (g2 * 2) > g1;
        System.out.println((greater1));

        // if ((g2 * 2) > g1) {
        //    System.out.println(("The double of g2 is greater than g1."));
        //}


        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean divisable = (h % 11) == 0;
        System.out.println((divisable));

        // if (h % 11 == 0){
        //     System.out.println(("True"));
        // } else {
        //     System.out.println(("False"));
        // }

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean allConditions = (i1 > i2) && (i1 < Math.pow(i2, 3));
        System.out.println((allConditions));


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean divisable1 = (j % 15) == 0;
        System.out.println(divisable1);

        String k = "Apple";
        //fill the k variable with its content 4 times
        k += k + k + k;
        System.out.println(k);
    }
}
