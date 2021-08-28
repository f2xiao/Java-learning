package algorithm.sort;

public class Selection {
    //1.method sort: sort elements in array a
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length-2; i++) {
            // assume the index of the min value is at the beginning of the unsorted part
            int minsIndex = i;
            for (int j = i+1; j < a.length ; j++) {
                // if the assumed min > a[j], update the minsIndex
                if (greater(a[minsIndex], a[j])) {
                    minsIndex = j;
                }
                // exch the value of the a[i] and a[minsIndex]
                exch(a, i, minsIndex);
            }
        }
    }

    //2.method greater: determine if element v > w
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    //3.method exch: exchange the value of a[i] and a[j]
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;

    }


}
