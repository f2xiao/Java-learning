package Syntax;

public class HelloNumbers {
    public static int sum(int num) {
        int x = 0, sum = 0;
        while (x < num) {
            System.out.print(sum + " ");
            x++;
            sum += x;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        int divisor = 2;
        while(divisor < n){
            if (n % divisor == 0){
                return false;
            }
            divisor++;
        }

        return true;
    }

    public static void main(String[] args) {
//         sum(10);
         boolean isPrime = isPrime(10);
        System.out.println(isPrime);
    }
}
