package arrays.twopointer;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/description/
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int low =0;
        for (int high = 0; high < nums.length; high++) {
            if (nums[high]!=0) {
                int temp = nums[low];
                nums[low]=nums[high];
                nums[high]=temp;

                low++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();

        int[] case1 = {1,0, 1, 0, 3, 12};
        solution.moveZeroes(case1);
        System.out.println(Arrays.toString(case1)); // Expected: [1, 3, 12, 0, 0]

        int[] case2 = {0};
        solution.moveZeroes(case2);
        System.out.println(Arrays.toString(case2)); // Expected: [0]
    }
}
