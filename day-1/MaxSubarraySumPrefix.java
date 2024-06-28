// More Efficient Than Brute Force 
// Prefix Method: To Find Maximum Subarray Sum in a given array 

public class MaxSubarraySumPrefix {
    public static void findMaxSubarraySum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0]; 

        // to create a prefix array 

        for(int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i]; 
        }

        int maxSum = Integer.MIN_VALUE;
        // use prefix array to calculate maximum sum amongst subarrays

        for(int i = 0; i < arr.length; i++) {
            int currSum = 0; 
            for(int j = i; j < arr.length; j++) {
                if(i==0) {
                    currSum = prefix[j]; 
                } else {
                    currSum = prefix[j] - prefix[i-1]; 
                }
                if(currSum > maxSum) {
                    maxSum = currSum; 
                }
            }
        }

        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3}; 
        findMaxSubarraySum(arr); 
    }
}

// EXPLANATION: This method creates a prefix array that stores the sum of entire subarray upto that index. To retrieve sum of a subarray, just subtract prefix[start-1] part from prefix[end] to find sum of that subarray.
// Time Complexity = O(n)^2 
