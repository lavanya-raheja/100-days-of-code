/*
PROBLEM: 
Given an array of N integers where each value represents the number of chocolates in a packet. 
Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
*/

// GEEKSFORGEEKS: Chocolate Distribution Problem 

import java.util.*; 
public class ChocolateDistribution {

    public static int chocolateDistribution(int arr[], int m) {
        // if no of packets or no of students is 0 
        if(arr.length == 0 || m == 0) {
            return 0;
        }
        // if no of packets is not enough for m students
        if(arr.length-1 < m) {
            return -1; 
        }

        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE; 
        for(int i=0; i<=m+i-1; i++) {
            if(m+i-1 >= arr.length) {
                break; 
            }
            int diff = arr[m+i-1]-arr[i];

            if(diff<min_diff) {
                min_diff = diff; 
            }
        }
        return min_diff; 
    }
    public static void main(String[] args) {
        // Example input
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
 
        // Calculate the result using the chocolateDistribution method
        int result = chocolateDistribution(arr, m);
 
        // Print the result or indicate an invalid input
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}

/* 
EXPLANATION: 
If there are 0 students or number of packets, we return 0.
If number of packets is less than number of students, input is invalid because each student must have 1 packet so return -1.
First, sort the array using sort function.
Start a loop from i which runs m amount of times (from i to m+i-1).
The min in this subarray of m elements is i and max is m+i-1.
To prevent out of bounds exception, break if max > arr.length-1. 
Now subtract max and min of the subarray (elements i and m+i-1) and update min_diff as needed. 
*/
