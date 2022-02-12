package List;

public class SLList {
    private class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size;
    public SLList(int x){
        first = new IntNode(x, null);
        size =1;
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
        size++;
    }

    public void addLast(int x){
        IntNode p = first;
        while(p.next !=null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
        size++;
    }

    public int getFirst(){
        return first.item;
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

/** Returns the size of the list that starts at IntNode p.*/
private static int size(IntNode p){
    if(p.next == null){
        return 1;
    }
    return size(p.next)+1;
}

public int size (){
    return size(first);
}
public int fastSize(){
    return size;
}
    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        int s = L.fastSize();
        System.out.println(s);
    }

}
