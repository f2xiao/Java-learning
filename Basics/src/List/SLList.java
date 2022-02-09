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

    public IntNode first;
    public SLList(int x){
        first = new IntNode(x, null);
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
    }

    public void addLast(int x){
        IntNode p = first;
        while(p.next !=null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
    }

    public int getFirst(){
        return first.item;
    }

    public int size(){
        int totalSize =1;
        IntNode p = first;
        while(p.next !=null){
            totalSize ++;
            p=p.next;
        }
        return totalSize;
    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
//        L.addFirst(10);
//        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
    }

}
