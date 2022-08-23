class Solution {
    public int subarraysWithKDistinct(int[] A, int k) {
        int N=A.length;
        int res=At_Most_K_Distinct(A,N,k)-At_Most_K_Distinct(A,N,k-1);
        
        return res;
    }
    
    
    public  int At_Most_K_Distinct(int A[],int N,int k){

		int start=0;
		int end=0;
		int counter=0;

		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

		while(end<N){
          
          map.put(A[end],map.getOrDefault(A[end],0)+1);
          
          while(map.size()>k){
              if(map.get(A[start])==1)
              	map.remove(A[start]);
              else
              	map.put(A[start],map.get(A[start])-1);

              start++;
          }

          counter+=(end-start+1);
           end++;
          }//

		return counter;

	}
}