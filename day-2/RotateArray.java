// PROBLEM: Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// LEETCODE: Rotate the array by k elements. 

class RotateArray {
    public void rotate(int[] nums, int k) {
        int arr[] = new int[nums.length]; 
        for(int i=0; i<nums.length; i++) {
            arr[(i+k)%nums.length] = nums[i]; 
        }
        for(int i=0; i<nums.length; i++) {
            nums[i]=arr[i];
        }
    }
}
