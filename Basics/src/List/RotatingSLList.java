package List;

public class RotatingSLList<Item> extends SLList<Item>{
    /** Rotates list to the right. */
    public void rotateRight(){
        this.addFirst(this.removeLast());
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> list = new RotatingSLList<>();
        list.addLast(5);
        list.addLast(9);
        list.addLast(15);
        list.addLast(22);
        list.rotateRight();
    }
}
