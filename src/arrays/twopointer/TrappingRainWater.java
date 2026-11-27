package arrays.twopointer;

// https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingRainWater {
//    public int trap(int[] height) {
    // Write your solution here
//        int[] prefix = prefixMax(height);
//        int[] suffix = suffixMax(height);
//        int totalWater = 0;
//        for (int i = 0; i < height.length; i++) {
//            totalWater += Integer.min(prefix[i], suffix[i]) - height[i];
//
//        }
//        return totalWater;
//    }

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        int totalMax =0;
        while (left < right) {
            if(height[left]<=height[right]){
                leftMax = Integer.max(leftMax, height[left]);
                totalMax+=leftMax-height[left];
                left++;
            }else {
                rightMax = Integer.max(rightMax,height[right]);
                totalMax+=rightMax-height[right];
                right++;
            }
        }
        return totalMax;
    }


    private int[] prefixMax(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Integer.max(nums[i], max);
            prefixSum[i] = max;
        }
        return prefixSum;
    }

    private int[] suffixMax(int[] nums) {
        int[] suffixSum = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            max = Integer.max(nums[i], max);
            suffixSum[i] = max;
        }
        return suffixSum;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();

        System.out.println(solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})); // Expected: 6
        System.out.println(solution.trap(new int[]{4, 2, 0, 3, 2, 5}));                      // Expected: 9
    }
}