class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force is n square
        // given m*n matrix
        int m = matrix.length;
        int n = matrix[0].length;
        
        int col = n -1;
        int row = 0;

        


        while(row < m && col>= 0){
            if(matrix[row][col] == target){return true;}
            else if ( matrix[row][col] > target){col--;}
            else {row++;}
        }

        
        return false;
        

        
    }
}
