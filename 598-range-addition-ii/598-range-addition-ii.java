class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)
              return m*n;
        
        int smallestRowVal=m+1;
        
        int smallestColumnVal=n+1;
        
        for(int op[]:ops){
            int X=op[0];
            int Y=op[1];
            smallestRowVal=Math.min(smallestRowVal,X);
            smallestColumnVal=Math.min(smallestColumnVal,Y);
        }
        
        System.out.println("Value of smallest Row="+smallestRowVal);
        System.out.println("Value of Smallest Column="+smallestColumnVal);
       
        return smallestRowVal*smallestColumnVal;
//         int maxm=0;
//         int Mat[][]=new int[m][n];
        
//         for(int i=0;i<ops.length;i++){
                     
//                int M=ops[i][0];
//                int N=ops[i][1];
//               int CurrentVal=Mat[0][0];
//                ++CurrentVal;
//               maxm=Math.max(maxm,CurrentVal);
            
//             for(int x=0;x<M;x++){
//                 for(int y=0;y<N;y++){
//                      Mat[x][y]=CurrentVal;
//                 }
//             }
            
            
        }
}
       
        
