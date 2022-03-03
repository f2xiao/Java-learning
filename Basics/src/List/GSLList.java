package List;
/** An SLList with generics types
 */
public class GSLList<T> {
    private class StuffNode {
        public T item;
        public StuffNode next;

        public StuffNode(T i, StuffNode n) {
            item = i;
            next = n;
        }
    }
    private StuffNode first;
    private int size;

    public GSLList(T x){
        first = new StuffNode(x, null);
        size =1;
    }

    /** Add x to the front of the list*/
    public void addFirst(T x){
        first = new StuffNode(x, first);
        size++;
    }
    /** Returns the first item in the list*/
    public T getFirst(){
        return first.item;
    }
    /** Add x to the end of the list*/
    public void addLast(T x){
        size ++;
        StuffNode p = first;
        while(p.next != null){
            p = p.next;
        }
        p.next = new StuffNode(x, null);
    }
    /** Returns the size of the list*/
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        GSLList<String> gs1 = new GSLList<>("hello");
        gs1.addFirst("world");
        gs1.addLast("Pixie");
    }

}

