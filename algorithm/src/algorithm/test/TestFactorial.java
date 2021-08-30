package algorithm.test;

public class TestFactorial {
    public static void main(String[] args) {
        int result = Factorial(5);
        System.out.println(result);

    }

    public static int Factorial(int n) {
        if (n==1){
            return 1;
        }else{
            return n*Factorial(n-1);
        }
    }
}
