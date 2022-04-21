package Set;

import java.util.Iterator;

public class ArraySet<T> implements Iterable<T>  {
    private T[] items;
    private int size;


    public ArraySet() {
        items = (T[]) new Object[100];
        size=0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i++) {
            if(x.equals(items[i])){
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if (x == null) {
            throw new IllegalArgumentException("can't add null");
        }
        if (contains(x)){
            return;
        }
        items[size]=x;
        size++;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

       /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */

    private class ArraySetIterator implements Iterator<T> {

        private int wizPos;

        public ArraySetIterator(){
            wizPos = 0;
        }

        @Override
        public boolean hasNext() {
            return wizPos < size;
        }

        @Override
        public T next() {
            T returnedItem = items[wizPos];
            wizPos ++;
            return returnedItem;
        }
    }

    /** returns an iterator (a.k.a. seer) into ME */
    @Override
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    /** returns a string to be printed */
    @Override
    public String toString(){
        StringBuilder returnedStr = new StringBuilder("{");
        for (int i = 0; i < size - 1; i += 1) {
            returnedStr.append(items[i].toString());
            returnedStr.append(", ");
        }

        returnedStr.append(items[size-1]);
        returnedStr.append("}");

        return returnedStr.toString();
    }



    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
//        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");

        // iteration
        for (String str:s){
            System.out.println(str);
        }

        // print ArraySet
        System.out.println(s);
    }

}