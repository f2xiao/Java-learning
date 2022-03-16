package List;
/** An SLList with generics types
 */
public class SLList<T> implements List61B<T> {
    private class StuffNode {
        public T item;
        public StuffNode next;

        public StuffNode(T i, StuffNode n) {
            item = i;
            next = n;
        }
    }
    private StuffNode sentinel;
    private int size;

    /** Creates an empty SLList*/
    public SLList(){
        sentinel=new StuffNode(null,null);
        size=0;
    }

    public SLList(T x){
        sentinel = new StuffNode(null, null);
        sentinel.next = new StuffNode(x, null);
        size =1;
    }

    /** Add x to the front of the list*/
    public void addFirst(T x){
        sentinel.next = new StuffNode(x, sentinel.next);
        size++;
    }
    /** Returns the sentinel.next item in the list*/
    public T getFirst(){
        return sentinel.next.item;
    }

    public T getLast() {
        StuffNode p = getLastNode();
        return p.item;
    }

    public StuffNode getLastNode(){
        StuffNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        return p;
    }


    public T removeLast() {
        StuffNode back = getLastNode();
        if (back == sentinel) {
            return null;
        }

       StuffNode p = sentinel;

        while (p.next != back) {
            p = p.next;
        }
        p.next = null;
        return back.item;
    }

    /** Add x to the end of the list*/
    public void addLast(T x){
        size ++;
        StuffNode p = getLastNode();
        p.next = new StuffNode(x, null);
    }
    /** Returns the size of the list*/
    public int size(){
        return size;
    }

    /** Returns the ith item in the list*/
    public T get(int x){
        if (this.size()==0 || x > this.size){
           return null;
        }else{
            StuffNode p = sentinel.next;
            for (int i = 0; i <x ; i++) {
                p = p.next;
            }
            return p.item;
        }
    }
    public void insert(T item, int position) {
        StuffNode p = sentinel;
        while (position > 1 && p.next != null) {
            position--;
            p = p.next;
        }
        StuffNode newNode = new StuffNode(item, p.next);
        p.next = newNode;
    }

    @Override
    public void print() {
        for(StuffNode p = sentinel.next; p != null ; p=p.next) {
            System.out.print(p.item+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SLList<Integer> L = new SLList<>();
        L.addLast(10);
        System.out.println(L.size());
        L.removeLast();
        System.out.println(L.getLast());
    }

}

