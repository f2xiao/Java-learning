package List;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    /** Return size of this IntList, using recursion*/
    public int size(){
        if(rest == null){
            return 1;
        }
        return 1+ this.rest.size();
    }

    /** Return size of this IntList, using iteration, no recursion*/
    public int iterativeSize(){
        int totalSize =0;
        IntList p = this;
        while(p != null){
            totalSize ++;
            p = p.rest;
        }
        return totalSize;
    }

    /** Returns the ith item of the list, using recursion*/
    public int get(int i){
        if(i==0){
            return this.first;
        }
        i--;
        return this.rest.get(i);
    }

    /** Returns an IntList identical to L, but with all values incremented by x, using iterations  */

    public static IntList incrList(IntList L,int x){
        int size = L.size();
        IntList Q = new IntList(L.get(size-1)+x, null);

        for (int i = size-1; i >0 ; i--) {
            Q = new IntList(L.get(i-1)+x, Q);
        }

        return Q;

    }

    public static void main(String[] args) {
         IntList L = new IntList(15, null);
         L = new IntList(10, L);
         L = new IntList(5, L);
        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));
        System.out.println(L.size());

        IntList Q = incrList(L, 1);
        System.out.println(Q.get(0));
        System.out.println(Q.get(1));
        System.out.println(Q.get(2));
    }



}
