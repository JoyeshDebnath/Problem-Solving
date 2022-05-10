class Solution {

    public List<Integer> spiralOrder(int[][] mat) {
        int k = 0; //start row
        int l = 0; //start col
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> Ans = new ArrayList<>();

        while (k< m && l < n) {
            //print the 1st col
            for (int i = l; i < n; i++) {
                Ans.add(mat[k][i]);
            }
            k++; //increase the row start >>
            //print the last coln
            for (int i = k; i < m; i++) {
                Ans.add(mat[i][n - 1]);
            }
            n--; //decrease the coln

            //print the last row ..
            if (k < m) {
                for (int i = n - 1; i >= l; i--) {
                    Ans.add(mat[m - 1][i]);
                }
                m--; //decreae the row no :::
            }

            //print the 1st  coln
            if (l < n) {
                for (int i = m - 1; i >= k; i--) {
                    Ans.add(mat[i][l]);
                }
                l++; //increae the col start
            }
        } //iter
        
        return Ans;
    }
}
