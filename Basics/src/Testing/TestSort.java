package Testing;
import Sort.Sort;

public class TestSort {
    public static void testSort() {
        String[] input = {"i", "have","a","cat", "called", "pixie"};
        String[] expected = {"a", "called","cat","have", "i", "pixie"};

        Sort.sort(input);
        for (int i = 0; i < input.length; i++) {
            if(!input[i].equals(expected[1])){
                System.out.println("Mismatch at position " + i + ", expected: " + expected[i] + ", but got " + input[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        testSort();
    }
}
