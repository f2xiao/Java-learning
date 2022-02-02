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

    public static void printPrime(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static void printStars(int n){
        for (int i = 1; i <= n; i++) {
            int j=1;
           while(j<=i){
               System.out.print("*");
               j++;
           }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
//         sum(10);
//         boolean isPrime = isPrime(10);
//        System.out.println(isPrime);
//        printPrime(10);
        printStars(5);
    }
}
