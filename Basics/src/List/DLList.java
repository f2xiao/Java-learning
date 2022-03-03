package List;

public class DLList {
    private static class IntNode{
        public IntNode prev;
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    /** The first item (if it exists) is at sentinel.next*/
    private IntNode sentinel;
    private int size;

    /** Creates an empty SLList*/
    public DLList(){
        sentinel=new IntNode(22,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size=0;
    }
    /** Creates a DLList with x as the first item*/
    public DLList(int x){
        sentinel=new IntNode(22,null);
        sentinel.next = new IntNode(x, sentinel);
        sentinel.next.prev = sentinel;
        sentinel.prev = sentinel.next;
        size =1;
    }

    /** Create a SLList with an int[] array*/
    public DLList(int[] arr){
        sentinel=new IntNode(22,null);
        for (int i = arr.length-1; i >= 0; i--) {
            addFirst(arr[i]);
        }
    }

    /** Add x as the first item in the list*/
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        sentinel.next.prev = sentinel;
        sentinel.next.next.prev = sentinel.next;
        size++;
    }
    /** Add x as the last item in the list*/

    /** Returns the first item in the list*/
    public int getFirst(){
        return sentinel.next.item;
    }


    public static void main(String[] args) {
        DLList d1 = new DLList(3);
        d1.addFirst(2);
        d1.addFirst(1);
        System.out.println(d1.getFirst());
    }
}
