class Solution {
    public int totalFruit(int[] A) {
        int N=A.length;
        int start=0;
		int end=0;
		int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();

		while(end<N){
             
           map.put(A[end],map.getOrDefault(A[end],0)+1);
           if(map.size()<=2){
           	int windowLength=end-start+1;
            max=Math.max(max,windowLength);
            
           }

           else if(map.size()>2){

           	while(map.size()>2 && start<end){
           		int val=map.get(A[start]);
           		if(val==1)
           			map.remove(A[start]);
           		else
           			map.put(A[start],val-1);

           		start++;
           	}

           }  
               end++;
		}//
return max;
    }
}