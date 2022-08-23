class Solution {
    public List<Integer> findDisappearedNumbers(int[] A) {
        int N=A.length;
        for(int i=0;i<N;i++){
         	int current=Math.abs(A[i]);
         	A[current-1]=Math.abs(A[current-1])*-1;
         }
          List<Integer> Ans=new ArrayList<>();
         for(int i=0;i<N;i++)
         {
         	if(A[i]>0){
         		Ans.add(i+1);
         	}
         }
        return Ans;
        
    }
}