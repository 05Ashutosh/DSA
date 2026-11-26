package arrays.twopointer;

// https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        // Write your solution here
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;
        while (low<high){
            int tempArea = Integer.min(height[low],height[high]) * (high-low);
            maxArea = Integer.max(maxArea, tempArea);

            if (height[high]<height[low]) high--;
            else low++;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); // Expected: 49
        System.out.println(solution.maxArea(new int[]{1, 1}));                      // Expected: 1
    }
}