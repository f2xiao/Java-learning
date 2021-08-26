package algorithm.sort;

public class Bubble {
    public static void sort(Comparable[] a) {
        for (int i = a.length-1; i >0; i--) {
            for (int j = 0; j <i ; j++) {
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }

    }
//    compare if ele v is greater than ele m
    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w)>0;
    }
//Switch the value of a[i] and a[j]
    private static void exch(Comparable[] a, int i, int j) {
      Comparable temp;
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }

}
