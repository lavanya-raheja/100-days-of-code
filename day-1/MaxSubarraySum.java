// Brute Force Method: To find maximum subarray sum in a given array

public class MaxSubarraySum {
    public static void findMaxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE; 
        for(int i = 0; i<arr.length; i++) {
            for(int j = i; j<arr.length; j++) {
                int sum = 0; 
                for(int k = i; k<=j; k++) {
                    sum+=arr[k];
                }
                if(maxSum<sum) {
                    maxSum = sum; 
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
   
