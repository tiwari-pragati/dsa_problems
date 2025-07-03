class Solution {
    public void rotateMatrix(int[][] mat) {
       int n = mat.length;
       // traverse a matrix
       for(int i = 0; i < n; i ++){
           for(int j = 0; j < i; j ++){
               int temp = mat[i][j];
               mat[i][j] = mat[j][i];
               mat[j][i] = temp;
           }
       }
       // reverse that matrix 
       for(int col = 0 ; col < n; col ++){
           int i = 0, j = n-1;
           while(i<j){
               int temp = mat[i][col];
               mat[i][col] = mat[j][col];
               mat[j][col] = temp;
               i ++;
               j --;
           }
       }
    }
}