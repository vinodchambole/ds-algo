package sortedSqueredArray;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 5, 6, 8, 9};

        System.out.println(Arrays.toString(sortedSquaredArray(x)));
    }

    // (nlogn time | o(n) space)
    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int length = array.length;
        int[] newArray = new int[length];
        for (int i = 0; i < array.length; i++ ) {
            int x = array[i] * array[i];
            newArray[i] = x;
        }
        Arrays.sort(newArray);
        return newArray;
    }
}
