package TwoNumberSum;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        int[] nums = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int[] x = twoNumberSum(nums, 163);
        System.out.println(Arrays.toString(x));
    }

    private static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int lowerIndex = 0;
        int higherIndex= array.length-1;

        while( lowerIndex < higherIndex){
            if (array[lowerIndex] + array[higherIndex] == targetSum){
                return new int[]{array[lowerIndex], array[higherIndex]};
            }else if(array[lowerIndex] + array[higherIndex] < targetSum){
                lowerIndex++;
            }else {
                higherIndex--;
            }
        }

        return new int[0];
    }
}
