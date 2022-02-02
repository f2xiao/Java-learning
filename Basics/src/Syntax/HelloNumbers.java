package Syntax;

public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0, sum = 0;
        while (x < 10) {
            System.out.print(sum + " ");
            x++;
            sum += x;
        }

        System.out.println("\n--------");
        String h = 5 + "horse";
        System.out.println(h);

    }

}
