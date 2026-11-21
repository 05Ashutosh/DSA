package arrays.twopointer;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/
class SortColors {
    public void sortColors(int[] nums) {
        // Write your solution here
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }


    }

    public static void main(String[] args) {
        SortColors solution = new SortColors();

        int[] case1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(case1);
        System.out.println(Arrays.toString(case1)); // Expected: [0, 0, 1, 1, 2, 2]

        int[] case2 = {2, 0, 1};
        solution.sortColors(case2);
        System.out.println(Arrays.toString(case2)); // Expected: [0, 1, 2]
    }
}