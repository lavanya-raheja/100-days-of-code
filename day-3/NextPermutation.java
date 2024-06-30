/*

LEETCODE: Next Permutation

PROBLEM: The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such an arrangement is not possible, the array must be rearranged in the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.

Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.
*/


class NextPermutation {
  public void nextPermutation(int[] nums) {
    
    // first find the first element in decreasing order from right
    int i = nums.length-2; 
    while(i>=0 && nums[i]>=nums[i+1]) {
      i--; 
    } 

    // now find first number from right j that is greater than value at i 
    if(i>=0) {
      int j = nums.length - 1; 
      while(nums[j]<=nums[i]) {
        j--; 
      }

      // swap i and j 
      int temp = nums[i]; 
      nums[i] = nums[j]; 
      nums[j] = temp; 
    }

    // reverse the entire subarray after displaced element
    int start = i+1; 
    int end = nums.length-1; 
    while(start<end) {
      int temp = nums[start]; 
      nums[start] = nums[end]; 
      nums[end] = temp; 

      start++;
      end--; 
    }
}
}

/*

EXPLANATION: 

1. The largest order is one which is in decreasing order. 
2. From right, it should be in increasing order ideally, so we must find the first decreasing element from right and swap it with a bigger number. 
3. First we find the first decreasing element from the right.
4. Then we find the first element from the right greater than the decreasing element so they can be swapped. 
5. We swap them. 
6. Then we reverse the subarray after the displaced element, and it becomes the next permutation. 
*/
