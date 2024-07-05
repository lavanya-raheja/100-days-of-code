// LEETCODE PROBLEM: Given an m x n matrix, return all elements of the matrix in spiral order.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>(); 

        if(matrix.length==0) {
            return res; 
        }

        int rowBegin = 0; 
        int rowEnd = matrix.length - 1; 
        int colBegin = 0; 
        int colEnd = matrix[0].length - 1; 

        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            // traverse right 
            for(int j = colBegin; j <= colEnd; j++) {
                res.add(matrix[rowBegin][j]); 
            }
            rowBegin++; 

            // traverse down right
            for(int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--; 

            // traverse left
            if(rowBegin <= rowEnd) {
                for(int j = colEnd; j >= colBegin; j--) {
                    res.add(matrix[rowEnd][j]); 
                }
            }
            rowEnd--; 

            // traverse up left
            if(colBegin <= colEnd) {
                for(int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }

        return res; 
    }
}

/*

Approach: I used four different for loops for traversing the matrix from top to bottom, from left to right, bottom to top, and right to left using variables rowBegin, rowEnd, colBegin, and colEnd to navigate through edges and switch directions. 

*/
