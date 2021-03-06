package List;

public class WordUtils {
    public static String longest(List61B<String> list){
        int dexOfLongest = 0;
        int size = list.size();
        for(int i = 0; i < size; i++) {
            String longest = list.get(dexOfLongest);
            String thisStr = list.get(i);
            if(longest.length()<thisStr.length()){
                dexOfLongest = i;
            }
        }
        return list.get(dexOfLongest);
    }

    public static void main(String[] args) {
        List61B<String> gs1 = new SLList<>("Hello");
        gs1.addLast("world");
        gs1.addLast("pixie");
        gs1.addLast("is");
        gs1.addLast("a");
        gs1.addLast("nice");
        gs1.addLast("kitten");
        gs1.print();
    }
}
