package algorithm.sort;
// Time Complexity: O(f(n))= O(n^2)
public class Insertion {
    //method sort: sort elements in array a
    //sort
    public static void sort(Comparable[] a) {
        //current element is a[i] at the beginning, loop through the sorted elements a[j-1] and compare it with them until
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0 ; j--) { //current a[i]=a[j]
                if(greater(a[j-1], a[j])){
                    exch(a, j-1,j);
                }else{
                    //there is a[j] < a[i], else stops
                    break;
                }
            }
        }
    }

    //method greater: determine if v>w
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    //method exch: exchange the value of a[i] and a[j]
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
