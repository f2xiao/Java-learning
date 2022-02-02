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
 public static void printStarsReversed(int n){
        for (int i = 1; i <= n; i++) {
            int j=n;
           while(j>i){
               System.out.print("*");
               j--;
           }
            System.out.print("\n");
        }
    }

    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static int max(int[] m){
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            if(m[i]>max){
                max = m[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
//         sum(10);
//         boolean isPrime = isPrime(10);
//        System.out.println(isPrime);
//        printPrime(10);
//        printStars(5);
//        printStarsReversed(5);
//        printStars(10);
//        printArray(new int[]{4, 7, 10});
//        printArray(new int[3]);
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
