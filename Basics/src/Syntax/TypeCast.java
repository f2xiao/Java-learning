package Syntax;

public class TypeCast {
    public static void main(String[] args) {
        int myInt = 9;

        System.out.println(myInt);      // Outputs 9
        System.out.println((double) myInt);   // Outputs 9.0
        System.out.println("---------------------------------");

        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;
        System.out.println(myInt1);      // Outputs 9
        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println("---------------------------------");

    }

}
