package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;

public class findMaximumElement {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
        arr.add(new ArrayList<>(Arrays.asList(5, 25, 15)));
        arr.add(new ArrayList<>(Arrays.asList(40, 8, 12)));

        int max = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {

                if (arr.get(i).get(j) > max) {
                    max = arr.get(i).get(j);
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Maximum Element = " + max);
        System.out.println("Row = " + row);
        System.out.println("Column = " + col);
    }
}
