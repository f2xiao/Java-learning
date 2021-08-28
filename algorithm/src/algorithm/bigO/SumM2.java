package algorithm.bigO;

public class SumM2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0; // step = 1;
        int n =1000; // step = 1;
        sum = (n+1)*n /2; //step = 1;
        System.out.println("sum="+sum);
        long end = System.currentTimeMillis();
        System.out.println("runtime: "+(end - start));
    }
}
// step = 3;