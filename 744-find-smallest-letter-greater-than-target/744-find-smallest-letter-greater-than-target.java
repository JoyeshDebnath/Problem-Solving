class Solution {
    public char nextGreatestLetter(char[] Letters, char target) {
        //corner Case ..
		if(Letters[Letters.length-1]<=target)
			     return Letters[0];
        
        return Search(Letters,target);
    }
    
    	public static char Search(char[] Letters,char target){
		int left=0;
		int right=Letters.length-1;
		while(left<right){
			int mid=left+(right-left)/2;
			// if(Letters[mid]==target)
			// 	     return Letters[mid];
			
			if(Letters[mid]<=target){
				left=mid+1;
			}
			
			else 
				right=mid;
			
		}//
		
		return Letters[right];
		
	}//search the target in the letters[]
}