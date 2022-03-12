package List;
/** An SLList with generics types
 */
public class GSLList<T> implements List61B<T> {
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

    public GSLList(T x){
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
        StuffNode p = sentinel.next;
        while(p.next!=null){
            p=p.next;
        }
        return p.item;
    }


    public T removeLast() {
        StuffNode p = sentinel.next;
        StuffNode secondLast = p;
        while(p.next!=null){
            secondLast = p;
            p=p.next;
        }
        secondLast.next = null;
        return p.item;
    }

    /** Add x to the end of the list*/
    public void addLast(T x){
        size ++;
        StuffNode p = sentinel.next;
        while(p.next != null){
            p = p.next;
        }
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

    @Override
    public void print() {
        for(StuffNode p = sentinel.next; p != null ; p=p.next) {
            System.out.print(p.item+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GSLList<String> gs1 = new GSLList<>("hello");
        gs1.addFirst("world");
        gs1.addLast("Pixie");
        System.out.println(gs1.get(2));
    }

}

