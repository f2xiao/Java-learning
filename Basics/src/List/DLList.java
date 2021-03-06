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

    /** Creates an empty DLList*/
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

    /** Create a DLList with an int[] array*/
    public DLList(int[] arr){
        sentinel=new IntNode(22,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
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
        DLList[] twoDList = new DLList[3];
        twoDList[0] = new DLList(new int[]{1,2,3});
        twoDList[1] = new DLList(new int[]{4,5,6});
        twoDList[2] = new DLList(new int[]{7,8,9});
    }
}
