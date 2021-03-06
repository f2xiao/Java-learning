package List;

public class NSLList {
    private static class IntNode{
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
    public NSLList(){
        sentinel=new IntNode(22,null);
        size=0;
    }
    /** Creates a SLList with x as the first item*/
    public NSLList(int x){
        sentinel=new IntNode(22,null);
        sentinel.next = new IntNode(x, null);
        size =1;
    }

    /** Create a SLList with an int[] array*/
    public NSLList(int[] arr){
        sentinel=new IntNode(22,null);
        for (int i = arr.length-1; i >= 0; i--) {
            addFirst(arr[i]);
        }
    }

    /** Add x as the first item in the list*/
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }
    /** Add x as the last item in the list*/
    public void addLast(int x){
        IntNode p = sentinel;

        /* Advance p to the end of the list*/
        while(p.next !=null){
            p = p.next;
        }
        p.next = new IntNode(x,null);

        size++;
    }
    /** Returns the first item in the list*/
    public int getFirst(){
        return sentinel.next.item;
    }


    /** Returns the size of the list, using iterative method*/
//    public int size(){
//        int totalSize =1;
//        IntNode p = first;
//        while(p.next !=null){
//            totalSize ++;
//            p=p.next;
//        }
//        return totalSize;
//    }

    // Recursive helper function
    /** Returns the size of the list that starts at IntNode p.*/
    private static int size(IntNode p){
        if(p.next == null){
            return 1;
        }
        return size(p.next)+1;
    }
    /** Returns the size of the list, without caching*/
    public int size (){
        return size(sentinel.next);
    }
    /** Returns the size of the list, with caching*/
    public int fastSize(){
        return size;
    }

    /** Delete the first element in the list*/
    public void deleteFirst(){
       if(sentinel.next == null) return;
        sentinel.next = sentinel.next.next;
        size--;
    }

    public static void main(String[] args) {
        NSLList L = new NSLList(new int[]{});
//        L.addFirst(10);
//        L.addFirst(5);
//        L.addLast(20);
//        L.deleteFirst();
        int s = L.fastSize();
//        int first = L.getFirst();
//        System.out.println(first);
        System.out.println(s);
    }

}
