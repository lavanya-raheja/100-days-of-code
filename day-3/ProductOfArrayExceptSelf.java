/*
LEETCODE: Product of Array Except Self 

PROBLEM: Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer. You must write an algorithm that runs in O(n) time and without using the division operation.
*/

/*
EXPLANATION: 

First we initialise every value in prod array as 1 so it can be multiplied. Then we use a for loop to calculate and store product of all elements on left of a number starting from left. Then we repeat the same procedure from right for calculating product of elements at the right of a number. Multiplied together, each element gives product of array except self. 
*/

class ProductOfArrayExceptJava {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length]; 
        for(int i=0; i<nums.length; i++) {
            ans[i] = 1; 
        }

        int right = 1, left = 1; 
        for(int i = 0; i < nums.length; i++) {
            ans[i] *= left; 
            left *= nums[i]; 
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= right; 
            right *= nums[i]; 
        }
        
        return ans; 
    }
}
