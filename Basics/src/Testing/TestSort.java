package Testing;
import Sort.Sort;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {
    @Test
    public void testSort() {
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
        assertArrayEquals(expected1, input1);

        String[] input2 = {"my", "cat","likes","tuna"};
        String[] expected2 = {"cat", "likes","my","tuna"};

        Sort.sort(input2);
        assertArrayEquals(expected2, input2);

    }
    @Test
    public void testFindSmallest(){
        String[] input = {"i", "have","a","cat", "called", "pixie"};
        int expected = 4;
        int actual=Sort.findSmallest(input, 3);
        assertEquals(expected, actual);
    }
    @Test
    public void testSwap(){
        String[] input = {"i", "have","a","cat", "called", "pixie"};
        String[] expected = {"a", "have","i","cat", "called", "pixie"};

        Sort.swap(input, 0, 2);
        assertArrayEquals(expected, input);
    }

}
