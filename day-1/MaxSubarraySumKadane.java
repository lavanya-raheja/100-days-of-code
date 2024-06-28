// Most Efficient Method: To find maximum subarray sum in a given array 

public class MaxSubarraySumKadane {
    public static void findMaxSubarraySum(int arr[]) { 
        int maxSum = Integer.MIN_VALUE; 
        int currSum = 0; 
        for(int i = 0; i<arr.length; i++) {
            if(currSum < 0) {
                currSum = 0; 
            }
            currSum += arr[i]; 
            if(currSum > maxSum) {
                maxSum = currSum; 
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3}; 
        findMaxSubarraySum(arr); 
    }
}

// EXPLANATION: Kadane's algorithm suggests that in order to find maximum sum in a subarray, we must discard negative results. So each time the currSum is negative, it becomes zero to ensure maximum sum is found. 
// Time Complexity - O(n)
