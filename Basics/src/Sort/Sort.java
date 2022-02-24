package Sort;

public class Sort {
    /** Sorts strings destructively. */
    /*
    * Find the smallest item.
    * Move it to the front.
    * Selection sort the remaining N-1 items (without touching the front item)*/
    public static void sort(String[] x) {
        sort(x, 0);
    }
    private static void sort(String[] x, int i){
        if(i>=x.length) return;
        int smallestIndex = findSmallest(x, i);
        swap(x, i, smallestIndex);
        sort(x,i+1);
    }
    public static int findSmallest(String[] x, int i){
        int smallestIndex = i;
        for (int j = i; j < x.length; j++) {
            if(x[j].compareTo(x[smallestIndex])<0){
                smallestIndex = j;
            }
        }
        return smallestIndex;
    }
    public static void swap(String[] x, int i, int j){
        String temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

}
