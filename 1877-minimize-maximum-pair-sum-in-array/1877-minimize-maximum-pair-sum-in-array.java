class Solution {
    public int minPairSum(int[] A) {
        Arrays.sort(A);
        int N=A.length;
        int Pointer2=N-1;
        int Pointer1=0;
        int maxm=0;
        while(Pointer1<Pointer2){
            int Sum=A[Pointer1]+A[Pointer2];
            maxm=Math.max(maxm,Sum);
            Pointer1++;
            Pointer2--;
        }
        return maxm;
    }
}