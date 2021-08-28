package algorithm.bigO;

public class SumM1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0; // step=1
        int n =1000; // step=1
        for (int i = 1; i < n; i++) { // step = n
            sum += i; // step=n;
        }
        System.out.println("sum=" + sum);
        long end = System.currentTimeMillis();
        System.out.println("runtime: "+(end - start));
    }
}
// O(f(n)) = O(2n+2)