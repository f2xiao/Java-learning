package Syntax;

public class HelloNumbers {
    /** returns the cumulative sum of 0 to num*/
    public static int sum(int num) {
        int x = 0, sum = 0;
        while (x < num) {
            System.out.print(sum + " ");
            x++;
            sum += x;
        }
        return sum;
    }

    /** Check if n is prime or not*/
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
/** Print prime numbers between 2 to n*/
    public static void printPrime(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }

    /** Print * in a triangle shape*/
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
    /** Print * in a reversed triangle shape*/
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
/** Print elements in an array in one line */
    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
/** Return the max number in an array*/
    public static int max(int[] m){
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            if(m[i]>max){
                max = m[i];
            }
        }
        return max;
    }
    public static void printStr(String[] a){
        for (int i = 0; i < a.length; i += 1) {
            if (a[i].contains("horse")) {
                continue;
            }
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
            }
        }
    }

    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0){
                continue;
            }
            int sum =0;
            for (int j = 0; j <= n; j++) {
                if(i+j>=a.length){
                    break;
                }
                sum += a[i+j];
            }
            a[i] = sum;
        }
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
//        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
//        System.out.println(max(numbers));
//        printStr(new String[]{"cat", "dog", "laser horse", "ketchup", "horse", "horbse"});
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
