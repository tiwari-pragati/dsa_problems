// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
       ArrayList<Integer> ans = new ArrayList<>();
       int m = matrix.length, n = matrix[0].length;
       for(int i = 0; i < m ; i ++){
           if(i % 2 == 0){
               for(int j = 0; j < n; j ++){
                   ans.add(matrix[i][j]);
               }
           }
           else{
               for(int j = n-1; j >= 0; j --){
                   ans.add(matrix[i][j]);
               }
           }
       }
       return ans;
    }
}