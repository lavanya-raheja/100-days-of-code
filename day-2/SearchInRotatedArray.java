/* 
PROBLEM: There is an integer array nums sorted in ascending order (with distinct values).
Before being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
*/

// LEETCODE Problem: Search In Rotated Array

class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1; 
        while(low<high) {
            int mid = low + (high-low)/2; 
            if(nums[mid]>nums[high]) {
                low = mid+1; 
            } else {
                high = mid; 
            }
        }

        // k = number of rotations

        int k = low; 
        low=0; 
        high=nums.length-1; 
        while(low<=high) {
            int mid = low + (high-low)/2;
            int realMid = (mid + k) % nums.length; 
            if(nums[realMid] == target) {
                return realMid; 
            } else if (nums[realMid] > target) {
                high = mid-1; 
            } else {
                low = mid+1; 
            }
        }

        return -1; 
    }
}

/* 
EXPLANATION: 
First, we conducted a binary search to search for the smallest element in the sorted array. 
In the binary search, the index of the smallest number when found will be equal to low, high and number of rotations. 
Now that we know number of rotations, we again write a proper while loop. In it, after calculating mid, we calculate the real mid after adjusting for the number of rotations and conduct the binary search. 
*/
