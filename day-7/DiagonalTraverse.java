// LEETCODE PROBLEM: Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

 class Solution {
    public int[] findDiagonalOrder(int[][] arr) {
        int m = arr.length; 
        int n = arr[0]. length; 
        int ans[] = new int[m*n]; 
        
        int i = 0; 
        int j = 0;
        int idx = 0; 
        boolean up = true;

        while(i < m && j < n) {
            if(up==true) {
                while(i > 0 && j < n-1) {
                    ans[idx++] = arr[i][j]; 
                    i--; 
                    j++; 
                }

                ans[idx++] = arr[i][j]; 
                if(j == n-1) {
                    i++; 
                } else {
                    j++; 
                }
            } else {
                while(i < m-1 && j > 0) {
                    ans[idx++] = arr[i][j]; 
                    i++; 
                    j--; 
                }
                ans[idx++] = arr[i][j]; 
                if(i == m-1) {
                    j++; 
                } else {
                    i++; 
                }
            }

            up = !up; 
        }

        return ans; 

    }
}

/* Approach: I used a boolean variable to keep track of the direction of the array while traversing. Each time the array was traversed upwards, I decremented a row and incremented a column whereas each time the array was traversed downwards, I incremented a row and decremented a column.  */
