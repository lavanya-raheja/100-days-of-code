// PROBLEM: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// LEETCODE Problem: Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==nums[i+1]) {
                return true; 
            }
        }
        return false;
    }
}

// EXPLANATION: Sort the array so if there exist duplicate values they will come one after another, and then check if curr value = next value
 
