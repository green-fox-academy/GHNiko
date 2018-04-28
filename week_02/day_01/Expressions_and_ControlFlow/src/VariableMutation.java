public class VariableMutation {
    public static void main(String [] args) {

        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        double cube = Math.pow(e, 3);
        System.out.println(cube);

        int f1 = 123;
        int f2 = 345;
        boolean greater = f1 > f2;
        System.out.println((greater));

        // if (f1 > f2) {
        //    System.out.println("f1 is greater than f2.");
        // } else {
        //    System.out.println(("f1 is not greater than f2"));
        // }

        int g1 = 350;
        int g2 = 200;
        boolean greater1 = (g2 * 2) > g1;
        System.out.println((greater1));

        // if ((g2 * 2) > g1) {
        //    System.out.println(("The double of g2 is greater than g1."));
        //}

        int h = 135798745;
        boolean divisable = (h % 11) == 0;
        System.out.println((divisable));

        // if (h % 11 == 0){
        //     System.out.println(("True"));
        // } else {
        //     System.out.println(("False"));
        // }

        int i1 = 10;
        int i2 = 3;
        boolean allConditions = (i1 > i2) && (i1 < Math.pow(i2, 3));
        System.out.println((allConditions));

        int j = 1521;
        boolean divisable1 = (j % 15) == 0;
        System.out.println(divisable1);

        String k = "Apple";
        k += k + k + k;
        System.out.println(k);
    }
}
