package List;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }


//    public void addIntList(int data){
//        IntList newIntList = new IntList(data, null);
//        this.rest = newIntList;
//    }

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


    /** Returns an IntList identical to L, but with all values incremented by x. */
    public static IntList dincrList(IntList L, int x){
        IntList Q = L;
        while(L.rest != null){
            L.first += x;
            L = L.rest;
        }
        L.first += x;

        return Q;
    }

    /** Add x as the first item in the list*/
    public IntList addFirst(int x){
        return new IntList(x, this);
    }

    /** If 2 numbers in a row are the same, add them together and make an large node */
    public void addAdjacent(){
        IntList p =this;
        while(p.rest != null){
            if(p.first==p.rest.first){
                first *= 2;
                rest = rest.rest;
            }else{
                p=p.rest;
            }
        }
    }

    /** Square the IntList everytime x is added to the end of the list*/
    public void squareList(int x){
        IntList p =this;
        while(p.rest != null){
            IntList p2 = p.rest;
            p.rest = new IntList(p.first * p.first, p2);
            p = p2;
        }
        p.rest = new IntList(p.first * p.first, p.rest);
        p.rest.rest = new IntList(x, null);
    }

    public static void main(String[] args) {
         IntList L = new IntList(2, null);
//         L = L.addFirst(2);
         L= L.addFirst(1);
//         L= L.addFirst(1);
//         L.addAdjacent();
//         L = new IntList(10, L);
//         L = new IntList(5, L);
        L.squareList(5);
        for (int i = 0; i < L.size(); i++) {
            System.out.println(L.get(i));
        }
        System.out.println("Add 7 to the end");
        L.squareList(7);
        for (int i = 0; i < L.size(); i++) {
            System.out.println(L.get(i));
        }




//        IntList Q = incrList(L, 1);
//        System.out.println(Q.get(0));
//        System.out.println(Q.get(1));
//        System.out.println(Q.get(2));

//        IntList q = dincrList(L, 1);
//        System.out.println(q.get(0));
//        System.out.println(q.get(1));
//        System.out.println(q.get(2));
    }

}
