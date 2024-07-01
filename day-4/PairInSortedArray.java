// LEETCODE PROBLEM: Pairs With Given Sum In Sorted Array

/* 
Description: You are given an array Arr of size N. You need to find all pairs in the array that sum to a number K. If no such pair exists then output will be -1. The elements of the array are distinct and are in sorted order.
*/

class Solution {
    int Countpair(int a[], int n, int sum) {
        if (n < 2) {
            return -1; // Not enough elements to form a pair
        }

        int count = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int currentSum = a[left] + a[right];
            if (currentSum == sum) {
                count++;
                left++;
                right--;

                // Skip duplicates from left side
                while (left < right && a[left] == a[left - 1]) {
                    left++;
                }

                // Skip duplicates from right side
                while (left < right && a[right] == a[right + 1]) {
                    right--;
                }
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }

        return count == 0 ? -1 : count;
    }
}



/*

So we use two pointer approach to find the pairs and increment count each time currSum == sum. If 1 appears twice in array, it shouldn't count as two different pairs, so we also check for duplicates from right and left to ensure same element is not counted twice for the pairs. 
*/
