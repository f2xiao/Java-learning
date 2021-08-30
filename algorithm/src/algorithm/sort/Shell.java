package algorithm.sort;

public class Shell {
    //method sort: sort elements in array a
    public static void sort(Comparable[] a) {
        //1. decide the gap/interval's (h here) value based on the length of the array a first
        int h = 1;
        while(h< a.length /2){ // ex. if a.length = 10
            h = h*2+1; // h0 = 7 at the end of the while loop
        }

        //2. Shell sort algorithm
        while (h>=1){
            //sort
            //2.1 find the element to be inserted
            for (int i=h; i<a.length;i++){
                //2.2 insert the element into the sorted group
                for (int j=i; j-h>=0; j-=h){
                    //the element needs to be inserted is a[j], insertion sort
                    if(greater(a[j-h], a[j])){
                        exch(a, j, j-h);
                    }else{
                        break;
                    }
                }
            }

            //decrease the value of gap/interval(h)
            h /= 2;
        }

    }

    //method greater: compare v and w see if v > w
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    //method exch: switch the value of a[i] and a[j] in array a
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
