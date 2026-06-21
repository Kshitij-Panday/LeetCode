class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                if (row == col) {
                    sum += mat[row][col];
                }

                else if (row + col == n - 1) {
                    sum += mat[row][col];
                }
            }
        }

        return sum;
    }
}