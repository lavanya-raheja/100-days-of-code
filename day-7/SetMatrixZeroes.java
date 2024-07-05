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
