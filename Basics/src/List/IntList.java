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

}
