package algorithm.test;

import java.util.Arrays;

import algorithm.sort.Quick;

public class QuickTest {
    public static void main(String[] args) {
        Integer[] a = { 6, 1, 2, 7, 9, 3, 4, 5, 8,10 };
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
        
    }
}
