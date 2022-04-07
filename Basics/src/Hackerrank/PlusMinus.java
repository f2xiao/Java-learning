package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float[] ratios =new float[3];
        // loop through arr and check the sign of the values
        for (Integer item : arr) {
            if (item>0) {
                ratios[0]++;
            } else if (item < 0){
                ratios[1]++;
            } else{
                ratios[2]++;
            }
        }

        for (Float ratio : ratios) {
            ratio = ratio / arr.size();
            System.out.printf("%.6f", ratio);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(6);
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        plusMinus(arr);
    }
}
