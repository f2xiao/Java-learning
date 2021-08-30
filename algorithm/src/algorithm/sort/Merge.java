package algorithm.sort;

public class Merge {
    //method sort: sort elements in an array a
    private static Comparable[] assist;
    public static void sort(Comparable[] a) {
        //1. initialize array assist
        //2. define lo and hi, to store the min index and max index in array a
        //3. call sort method to sort elements from index lo to hi
        assist = new Comparable[a.length];
        int lo = 0;
        int hi = a.length-1;
        sort(a, lo, hi);
    }

    //method sort: sort elements a[lo]~a[hi] by sorting two subset a[lo]~a[mid] and a[mid+1]~a[hi]
    private static void sort(Comparable[] a, int lo, int hi) {
        //make sure lo<hi first
        if(hi<=lo){
            return;
        }

        //divide a[lo]~a[hi] into two subsets
        int mid = lo+(hi-lo) /2;
        //sort each subset
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        //merge each subset
        merge(a, lo, mid,hi);
    }

    //method merge: merge two subsets with index from lo~mid and mid~hi
    private static void merge(Comparable[] a, int lo,int mid, int hi) {
        //1. Define 3 pointers
        int i = lo;
        int p1 = lo;
        int p2 = mid+1;

        //2. sort two subsets and copy the smaller value to the assist array
        while (p1<= mid && p2 <= hi){
            if (less(a[p1],a[p2])){
                assist[i++] = a[p1++];
            }else {
                assist[i++] = a[p2++];
            }
        }

        //if pointer p1 is at the end of a[lo]~a[mid], just copy the left values in a[mid+1]~a[hi] to assist
        while (p2<=hi){
            assist[i++]=a[p2++];
        }

        //if pointer p2 is at the end of a[mid+1]~a[hi], just copy the left values in a[lo]~a[mid] to assist
        while (p1<=mid){
            assist[i++]=a[p1++];
        }

        //3. copy the assist array to the array a
        for (int index = lo; index <= hi; index++){
            a[index] = assist[index];
        }

    }
    //method less: check if v<w;
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w)<0;
    }
    //method exch: switch values of a[i] and a[j]
    private static void exch(Comparable[] a,int i, int j) {
        Comparable t = a[i];
        a[i] =a[j];
        a[j]=t;
    }
}
