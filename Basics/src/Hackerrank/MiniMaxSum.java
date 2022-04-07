package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = arr.get(0);
        long max = arr.get(0);
        long sum = 0;
        for (Integer i : arr){
            if(i<=min){
                min = i;
            }
            if(i>=max){
                max = i;
            }
            sum += i;
        }
        long minSum = sum - max;
        long maxSum = sum - min;
        System.out.print(minSum);
        System.out.print(" ");
        System.out.print(maxSum);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(5);
        arr.add(769082435);
        arr.add(210437958);
        arr.add(673982045);
        arr.add(375809214);
        arr.add(380564127);
        miniMaxSum(arr);
    }


}
