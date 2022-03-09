package List;

/** Array based list.
 *  @author Josh Hug
 */

/* Invariants
* The position of the next item to be inserted(using addLAst) is always size.
* The number of the items in the Alist is always size
* The position of the last item in the list is always size-1
* */
public class AList<Item> implements List61B<Item> {
    private Item[] items;
    private int size;
    /** Creates an empty list. */
    public AList() {
       items = (Item []) new Object[100];
       size =0;
    }
    public AList(Item x) {
       items = (Item []) new Object[100];
       items[0] = x;
       size = 1;
    }


    private void resize(int capacity){
        Item[] a= (Item []) new Object[size+capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void addFirst(Item x) {
        if(size>0){
            Item[] a= (Item []) new Object[size+1];
            System.arraycopy(items, 0, a, 1, size);
            items = a;
        }
        items[0]=x;
    }

    public Item getFirst() {
        return items[0];
    }


    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if(size==items.length) {
           resize(size*2);
        }
        items[size] = x;
        size++;
    }



    /** Returns the item from the back of the list. */
    public Item getLast() {
        return items[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast() {
        Item last = items[size-1];
        items[size-1] = null;
        size--;
        return last;
    }
}