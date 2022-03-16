package List;

public class ArrayBasics2 {
    public static void main(String[] args) {
        int[][] pascalTriangle;
        pascalTriangle = new int[4][];
        pascalTriangle[0] = new int[]{1};
        pascalTriangle[1] = new int[]{1,1};
        pascalTriangle[2] = new int[]{1,2,1};
        pascalTriangle[3] = new int[]{1,3,3,1};
        int[] rowZero = pascalTriangle[0];
        int[] rowTwo = pascalTriangle[2];

        int[][] matrix;
        matrix = new int[4][];
        matrix = new int[4][4];

    }
}
