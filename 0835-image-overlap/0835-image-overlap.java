class Solution {
    int n;
    public int largestOverlap(int[][] img1, int[][] img2) {
        n = img1.length;        
        int ans = 0;
        
        int N = img1.length;
    int[][] count = new int[2 * N + 1][2 * N + 1];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (img1[i][j] == 1) {
          for (int i2 = 0; i2 < N; i2++) {
            for (int j2 = 0; j2 < N; j2++) {
              if (img2[i2][j2] == 1) {
                count[i-i2+N][j-j2+N] += 1;
              }
            }
          }
        }
      }
    }
    //int ans = 0;
    for (int[] row: count) {
      for (int v: row) {
        ans = Math.max(ans, v);
      }
    }
    
        
        //for(int i = 0; i < n; i++) { //row shift
        //    for(int j = 0; j < n; j++) {  //col shift
        //        ans = Math.max(ans, count(img1, img2, i, j));
        //        ans = Math.max(ans, count(img2, img1, i, j));
        //    }
        //}
        return ans;
    }    
    int count(int[][] img1, int[][] img2, int r, int c) {        
        int over1 = 0, over2 = 0;        
        for(int i = r; i < n; i++) {
            for(int j = c; j < n; j++) {
                over1 += img1[i-r][j-c] & img2[i][j]; //right 
                over2 += img1[i-r][j] & img2[i][j-c]; //left 
            }
        }
        return Math.max(over1, over2);
    }
}