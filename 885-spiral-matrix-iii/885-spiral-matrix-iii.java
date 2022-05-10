class Solution {
    int size;
    int Ans[][];

    public void FormPair(int m, int n, int row, int col) {
        //check
        if (row < 0 || row >= m || col < 0 || col >= n) return;

        Ans[size] = new int[] { row, col };
        size++;
    }

    public int[][] spiralMatrixIII(int m, int n, int rStart, int cStart) {
        // int size = 0;
        Ans = new int[m * n][2];
        Ans[0] = new int[] { rStart, cStart };
        int distance = 1;
        size = 0;
        size++;

        while (size < m * n) {
            //traverse left ---->>
            for (int i = 1; i <= distance; i++) {
                cStart++;
                FormPair(m, n, rStart, cStart);
            }

            //traverse Down
            for (int i = 1; i <= distance; i++) {
                rStart++;
                FormPair(m, n, rStart, cStart);
            }
            distance++;
            //traverse right
            for (int i = 1; i <= distance; i++) {
                cStart--;
                FormPair(m, n, rStart, cStart);
            }
            //traverse Up
            for (int i = 1; i <= distance; i++) {
                rStart--;
                FormPair(m, n, rStart, cStart);
            }
            distance++;
        } //while

        return Ans;
    }
}
