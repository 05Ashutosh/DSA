package arrays.twopointer;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length-1;
            while (left<right){
                int tempSum = numbers[left] + numbers[right];
                if (target==tempSum) return new int[]{left+1,right+1};
                else if (tempSum<target) left++;
                else  right--;
            }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSumIIInputArrayIsSorted solution = new TwoSumIIInputArrayIsSorted();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));      // Expected: [1, 3]
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 3, 4}, 6)));      // Expected: [1, 3]
        System.out.println(Arrays.toString(solution.twoSum(new int[]{-1, 0}, -1)));       // Expected: [1, 2]
    }
}
