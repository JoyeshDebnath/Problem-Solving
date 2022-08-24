class Solution {
    public int numberOfSubarrays(int[] A, int k) {
        int N=A.length;
       //convert into odd --->>1 and even -->> 0 because of mod 2 
		  for(int i=0;i<N;i++)
		  {
		  	A[i]=(A[i]%2==0)?0:1;
		  }

		  //now find the subarrays sum equal to k .. 
          int counter=0;

          HashMap<Integer,Integer> map=new HashMap<>();
          map.put(0,1);
          int Sum=0;
          for(int i=0;i<N;i++)
          {
          	   Sum+=A[i];
               int diff=Sum-k;
               if(map.containsKey(diff)==true)
               	       counter+=map.get(diff);

               map.put(Sum,map.getOrDefault(Sum,0)+1);
          }
        
        return counter;
    }
}