class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //can be done by top-right approach or bottom-left approach

        //top-right
        int row = 0;
        int col = matrix[0].length-1;

        // T : O(m+n), S : O(1)
        while(row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            }
            else if (target > matrix[row][col])
                row++;
            else col--;
        }
        return false;
    }
}