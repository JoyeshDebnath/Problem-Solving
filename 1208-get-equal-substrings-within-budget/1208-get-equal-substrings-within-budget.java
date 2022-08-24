class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
          char[] A=s.toCharArray();
          char[] B=t.toCharArray();
          
          int Ascii_Diff[]=new int[A.length];
		  for(int i=0;i<A.length;i++)
		  {
		  	Ascii_Diff[i]=Math.abs((int)A[i]-(int)B[i]);
		  	// System.out.print(Ascii_Diff[i]+" ");
		  }

		  int start=0;
		  int end=0;
		  int maxLength=Integer.MIN_VALUE;
		  int N=A.length;
		  int runningCost=0;

		  while(end<N)
		  {
		  	runningCost+=Ascii_Diff[end];

		  	if(runningCost>maxCost)
		  	{
		  		maxLength=Math.max(maxLength,end-start);

		  		while(runningCost>maxCost)
		  		{
		  			runningCost-=Ascii_Diff[start];
		  			start++;
		  		}
		  	}
		  	end++;
		  }
        maxLength=Math.max(maxLength,end-start);
         return maxLength;
        
    }
}