package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;

        int c = 30000;

        int l = 2;
        double m = l;

        System.out.println(l + m );

        double n = 10.8;
        int s = (int) n;

        System.out.println(n + ":" + s);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + ": " + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1);








    }
}
