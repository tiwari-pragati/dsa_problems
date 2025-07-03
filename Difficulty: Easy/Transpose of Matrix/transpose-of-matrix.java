class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int j = 0; j < cols; j++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                newRow.add(mat[i][j]);
            }
            result.add(newRow);
        }

        return result;
    }
}