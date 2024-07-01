// LEETCODE PROBLEM: Contains Water

/*

Description: You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container, such that the container contains the most water. Return the maximum amount of water a container can store.

*/

class Solution {
    public int maxArea(int[] height) {
        int left = 0; 
        int right = height.length-1;
        int maxWater = Integer.MIN_VALUE; 

        while(left<right ) {
            int water = Math.min(height[left], height[right])*(right-left); 
            maxWater = Math.max(water, maxWater); 

            if(height[left]<height[right]) {
                left++; 
            } else {
                right--; 
            }
        }

        return maxWater; 
    }
}

// To find maximum water we simply use the two pointer technique, and move whichever pointer is at the lowest line. 
