package Testing;
import Sort.Sort;


public class TestSort {
    public static void testSort() {
        String[] input1 = {"i", "have","a","cat", "called", "pixie"};
        String[] expected1 = {"a", "called","cat","have", "i", "pixie"};

        Sort.sort(input1);
        // without junit library
        /*for (int i = 0; i < input.length; i++) {
            if(!input[i].equals(expected[1])){
                System.out.println("Mismatch at position " + i + ", expected: " + expected[i] + ", but got " + input[i]);
                return;
            }
        }*/

        // with junit library
        org.junit.Assert.assertArrayEquals(expected1, input1);

        String[] input2 = {"my", "cat","likes","tuna"};
        String[] expected2 = {"cat", "likes","my","tuna"};

        Sort.sort(input2);
        org.junit.Assert.assertArrayEquals(expected2, input2);

    }

    public static void main(String[] args) {
        testSort();
    }
}
