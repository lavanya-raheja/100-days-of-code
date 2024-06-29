// Problem: Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array. 
// GEEKSFORGEEKS Question: Max Min

class MaxMin
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE; 
    	int max = Integer.MIN_VALUE; 
    	for(int i = 0; i < N; i++) {
    	    if(A[i]>max) {
    	        max = A[i]; 
    	    }
    	    if(A[i]<min) {
    	        min = A[i]; 
    	    }
    	}
    	return min + max; 
    }
}
