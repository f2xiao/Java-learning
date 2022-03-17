package List;

public class VengefulSLList<Item> extends SLList<Item> {
    SLList<Item> deletedItems;
    public void printLostItems(){
        deletedItems.print();
    }

    public VengefulSLList(){
        deletedItems = new SLList<>();
    }

    public VengefulSLList(Item x){
        super(x);
        deletedItems = new SLList<>();
    }

@Override
    public Item removeLast(){
        Item removedItem = super.removeLast();
        deletedItems.addLast(removedItem);
    return removedItem;
}

    public static void main(String[] args) {
        VengefulSLList<Integer> vsl = new VengefulSLList<>(0);
        vsl.addLast(1);
        vsl.addLast(5);
        vsl.addLast(9);
        vsl.addLast(13);
        // vsl is now [1,5,9,13]
        vsl.removeLast();
        vsl.removeLast();
       vsl.printLostItems();
    }
}
