package TwoNumberSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// time complexity o(N) and space complexity o(N)
public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] x = twoNumberSum(nums, 7);
        System.out.println(Arrays.toString(x));
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int temp = targetSum - array[i];
            if (map.containsKey(temp) && temp != array[i]) {
                return new int[]{temp, array[i]};
            }
        }
        return new int[]{};
    }
}
