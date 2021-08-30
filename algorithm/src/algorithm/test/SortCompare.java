package algorithm.test;

import algorithm.sort.Insertion;
import algorithm.sort.Shell;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortCompare {
    //method main: call different sort classes
    public static void main(String[] args) throws Exception{
        //1. create an ArrayList, to store the integers
        ArrayList<Integer> list = new ArrayList<>();
        //2. create cache data stream BufferedReader, to read the file and store them in the ArrayList
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("reverse_arr.txt")));
        String line;
        while((line=reader.readLine())!=null){
            //line is String, converts every line to Integer and store in the ArrayList
            int i = Integer.parseInt(line);
            list.add(i);
        }
        reader.close();
        //3. convert ArrayList to Integers[]
        Integer[] a = new Integer[list.size()];
        list.toArray(a);

        //4. use test methods for testing
        testInsertion(a);
        testShell(a);

    }
    //using post-mortem analysis to study the time complexity
    //test shell sort
    public static void testShell(Integer[] a) {
        //1.get the time before the test
        long start = System.currentTimeMillis();
        //2. shell sort
        Shell.sort(a);
        //3.get the time after the test
        long end = System.currentTimeMillis();
        System.out.println("Using Shell sort took:"+(end-start)+"ms");
    }

    //test insertion sort
    public static void testInsertion(Integer[] a) {
        //1.get the time before the test
        long start = System.currentTimeMillis();
        //2. insertion sort
        Insertion.sort(a);
        long end = System.currentTimeMillis();
        //3.get the time after the test
        System.out.println("Using Insertion sort took:"+(end-start)+"ms");
    }
}
