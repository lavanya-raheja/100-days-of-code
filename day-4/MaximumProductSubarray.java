// LEETCODE PROBLEM: Maximum Product Subarray

/*

Description: Given an integer array nums, find a subarray that has the largest product, and return the product. 

The test cases are generated so that the answer will fit in a 32-bit integer.

*/

class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0]; 
        int minProd = nums[0]; 
        int result = nums[0]; 

        for(int i=1; i<nums.length; i++) {
            if(nums[i]<0) {
                int temp = maxProd; 
                maxProd = minProd; 
                minProd = temp; 
            }

            maxProd = Math.max(nums[i], maxProd*nums[i]); 
            minProd = Math.min(nums[i], minProd*nums[i]); 
            
            result = Math.max(maxProd, result); 
        }
        return result; 
    }
}

/*

EXPLANATION:

In this, we initialise minproduct, maxproduct, and result all as same number. We keep track of minProd also in case of negative numbers. Min and max are two extremes, and when a negative number multiplies, bigger number becomes smaller and smaller becomes bigger so we swap min and max each time negative number appears.   
*/
