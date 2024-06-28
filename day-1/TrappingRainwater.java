// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 /* 
EXPLANATION: 
Two auxiliary arrays right_max and left_max each calculates right and left boundary of each bar
The minimum of that will be the water level (height of bar included) 
Subtract height from water level to find trapped rainwater for the bar
Time Complexity: O(n) 
*/

class Solution {
    public int trap(int[] height) {
        // calculate left max boundary for each bar 
        int left_max[] = new int[height.length]; 
        left_max[0] = height[0]; 
        for(int i=1; i<height.length; i++) {
            left_max[i] = Math.max(height[i], left_max[i-1]); 
        }

        //calculate right max boundary for each bar
        int right_max[] = new int[height.length]; 
        right_max[height.length-1] = height[height.length-1]; 
        for(int i=height.length-2; i>=0; i--) {
            right_max[i] = Math.max(height[i], right_max[i+1]); 
        }

        // return trapped rainwater for each bar
        int trappedRainwater = 0; 
        for(int i=0; i<height.length; i++) {
            int waterLevel = Math.min(right_max[i], left_max[i]);
            trappedRainwater +=  waterLevel - height[i]; 
        }
        return trappedRainwater; 
    }
}
