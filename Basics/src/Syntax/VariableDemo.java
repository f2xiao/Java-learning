package Syntax;
/*
dataType variableName = value;
Basic data types: byte, short, char, int, long, float, double, boolean

 */
public class VariableDemo {
    public static void main(String[] args) {
        byte a = 10;
        System.out.println(a);
        System.out.println("-------------------");

        short b = 22;
        System.out.println(b);
        System.out.println("-------------------");

        char c ='A';
        System.out.println(c);
        System.out.println("-------------------");

        int d = 220;
        System.out.println(d);
        System.out.println("-------------------");

        long e = 100000010L;
        System.out.println(e);
        System.out.println("-------------------");

        float f = 3.14f;
        System.out.println(f);
        System.out.println("-------------------");

        double g = 1.333333333;
        System.out.println(g);
        System.out.println("-------------------");

        boolean h = false ;
        System.out.println(h);
        System.out.println("-------------------");

        h = true;
        System.out.println(h);
        System.out.println("-------------------");

        float f1 = 35.5e3f;
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println("-------------------");

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        char myVar4 = 97, myVar5 = 98, myVar6 = 99;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        // multiple cursors:  Alt and then Shift and click
        System.out.println(myVar4);
        System.out.println(myVar5);
        System.out.println(myVar6);
        System.out.println("-------------------");
    }

}
