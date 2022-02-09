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

}
