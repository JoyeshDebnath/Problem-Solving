class Solution {
    public int findBestValue(int[] A, int target) {
       int start=1;
		int end =0;
		for(int val:A)
			  end=Math.max(val,end);
		
		return FindMinm(A,start,end,target); 
    }//main
    
    public  int FindMinm(int[] A,int start,int end,int target){
		int SUMMATION=0;
		
		while(start<end){
			int mid=start+(end-start)/2;
			 SUMMATION=check(A,target,mid);
			if(SUMMATION==target)
			{
				  return mid;
			}
			if(SUMMATION>=target)
				  end=mid;
			
			if(SUMMATION<target)
				   start=mid+1;
		}
	    
        System.out.println("Value of start="+start);
        System.out.println("Value of end="+end);
        // if((start==end) && SUMMATION>target)
        //        return start-1;
        int absolute_Diff_If_Start_Taken=Math.abs(target-check(A,target,start));
        int absolute_Diff_If_End_Taken=Math.abs(target-check(A,target,start-1));
        if(absolute_Diff_If_End_Taken<absolute_Diff_If_Start_Taken)
               return start-1;
        
        if(absolute_Diff_If_End_Taken==absolute_Diff_If_Start_Taken)
                return start-1;
        
        
        // if(absolute_Diff_If_Start_Taken<absolute_Diff_If_End_Taken)
                return start;
        
        // return end;
        // return start;
	}//binary Search function  to find the thresold
    
    public  int check(int A[],int target,int mid){
		int sum=0;
		for(int i=0;i<A.length;i++){
			if(A[i]>mid){
				sum+=mid;
			}
			else
				sum+=A[i];
		}
		return sum;
	}//check for the  validity of the number chosen ..
}