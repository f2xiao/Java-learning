package algorithm.sort;

public class Quick {
    //1. sort method
    public static void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    //2. method less
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
        
    }
    //3. method exch
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    private static void sort(Comparable[] a, int lo, int hi) {
        // safety check also the condition to exit the recursion
        if (hi <= lo) {
            return;
        }

        //divide the array a(with index of lo~hi) into two groups: left and right, and return the key value's new index after division
        int partition = partition(a, lo, hi);

        //sort the left group
        sort(a, lo, partition - 1);

        //sort the right group
        sort(a, partition + 1, hi);
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        //set the first value in the array as the key value
        Comparable key = a[lo];
        
        //set two pointers, left and right, left points to the beginning(lo) of the array and right points to the end(hi+1) of the array
        int left = lo;
        int right = hi + 1;

        //scan the arrays and find and rearrange so that  all values < key are on the left side while all values > key are on the right side

        while (true) {
            //firstly, scan from the right to the left by moving the right pointer to the left, find a value that is smaller than the key, and stops
            while (less(key, a[--right])) {
                if (right == lo) {
                    break;
                }
            }
            //Secondly, scan from the left to the right by moving the left pointer to the right, find a value that is bigger than the key, and stops
            while (less(a[++left], key)) {
                if (left == hi) {
                    break;
                }
            }

            //check if left >= right, if yes, then the whole array is scanned, end the loop, otherwise, exchange the values where left and right point to
            if (left >= right) {
                break;
            } else {
                exch(a, left, right);
            }
        }
        exch(a, lo, right);
        return right;
    }
}
