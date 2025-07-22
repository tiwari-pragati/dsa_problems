class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int rows = mat.length, cols = mat[0].length;
        int lo = 0,  hi = rows * cols - 1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            int midRow = mid/cols, midCol = mid%cols;
            if(mat[midRow][midCol] == x) return true;
            else if(mat[midRow][midCol] > x) hi = mid - 1;
            else 
            lo = mid + 1;
        }
        return false;
    }
}
