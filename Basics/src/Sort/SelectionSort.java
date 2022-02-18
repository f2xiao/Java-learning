package Sort;

public class SelectionSort {
    /* Find the smallest item.
     * Move it to the front.
     * Selection sort the remaining N-1 items (without touching the front item)*/

    public static int minIndex(int[] x, int i) {
        int minIndex = i;
        for (int j = i; j <x.length ; j++) {
            if(x[j]<x[minIndex]){
                minIndex = j;
            }
        }
        return minIndex;

    }

    public static void swap(int[] x, int i, int j){
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

    public static void sort(int[] x){
        for (int i = 0; i < x.length; i++) {
            int minIndex = minIndex(x,i);
            swap(x, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{5,4,3,2,1};
        sort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

    }

}
