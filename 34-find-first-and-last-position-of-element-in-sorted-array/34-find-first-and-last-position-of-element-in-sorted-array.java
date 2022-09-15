class Solution {
    public int[] searchRange(int[] A, int target) {
        
        int Ans[]=new int[2];
        if(A.length==0){
          Ans[0]=-1;
            Ans[1]=-1;
            return Ans;
        }
        
        
        Ans[0]=firstOccurance(A,target);
        Ans[1]=LastOccurance(A,target);
        return Ans;
    }
    public  int  LastOccurance(int A[],int target){
		int lo=0;
		int hi=A.length-1;
		int last=-1;
		
		while(lo<=hi){
			int mid=lo+(hi-lo)/2;
			
			if(A[mid]==target){
				last=mid;
				lo=mid+1;
			}
			if(target<A[mid]){
				hi=mid-1;
			}
			if(target>A[mid])
				  lo=mid+1;
		}
		
		return last;
	} 
    
    public  int firstOccurance(int A[],int target){
		int lo=0;
		int hi=A.length-1;
		int first=-1;
		while(lo<=hi){
		int mid=lo+(hi-lo)/2;
			if(A[mid]==target){
				 first=mid;
				 hi=mid-1;
			}
				  
			if(A[mid]<target)
				   lo=mid+1;
			
			if(A[mid]>target)
				   hi=mid-1;
	}
	return first;
	}
}