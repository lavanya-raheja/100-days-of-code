// LEETCODE PROBLEM: Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.

class Solution {
    public void setZeroes(int[][] arr) {
        boolean firstRow = false, firstCol = false; 

        // set markers for 0 in first row and column
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == 0) {
                    if(i==0) {
                        firstRow = true; 
                    }
                    if(j==0) {
                        firstCol = true; 
                    }
                    arr[0][j] = 0; 
                    arr[i][0] = 0; 
                }
            }
        }

        // replace inner matrix 
        for(int i=1; i<arr.length; i++) {
            for(int j=1; j<arr[0].length; j++) {
                if(arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0; 
                }
            }
        }


        // last remaining checks
        if(firstRow) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[0][j] = 0;
            }
        }
        if(firstCol) {
            for(int i = 0; i < arr.length; i++) {
                arr[i][0] = 0; 
            }
        }
    }
}

/*

Approach: I solved this question with 3 different approaches: brute force, better time complexity and optimal solution. 

- Brute Force: If an element was equal to 0, I marked its given row and column as -1, and later changed all -1 elements to 0s. However, this approach only works for positive elements. 

- Better Time Complexity: I used two boolean arrays (one for rows and one for columns) and if an element was equal to 0, its corresponding row and column would be set to true in the boolean arrays. Then for all values of rows and columns which are true, the element would be set to 0. 

- Optimal Solution: Instead of creating two additional arrays, I marked the rows and columns that must be set to 0 using the matrix's first row and first column. And for marking for the first row and column, I used two additional variables instead. 


*/
