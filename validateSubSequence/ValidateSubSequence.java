package validateSubSequence;

import java.util.Arrays;
import java.util.List;

class Solution1 {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIndex = 0;
        int arrayIndex = 0;

        while (seqIndex < sequence.size() && arrayIndex < array.size()) {
            if (sequence.get(seqIndex) == array.get(arrayIndex)) {
                seqIndex++;
            }
            arrayIndex++;
        }
        return seqIndex == sequence.size();
    }
}
