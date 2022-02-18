package Testing;
import Sort.SelectionSort;

public class TestSort {
    public static void testSort() {
        int[] input = new int[]{5,4,3,2,1};
        int[] expected = new int[]{1,2,3,4,5} ;

        SelectionSort.sort(input);
        // without junit library
        /*for (int i = 0; i < input.length; i++) {
            if(!input[i].equals(expected[1])){
                System.out.println("Mismatch at position " + i + ", expected: " + expected[i] + ", but got " + input[i]);
                return;
            }
        }*/

        // with junit library
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void main(String[] args) {
        testSort();
    }
}
