class Solution {
    boolean IsValid(int a,int b,int c )
    {
        if((a+b)>c && (b+c)>a && (c+a)>b)
            return true;
        
        return false;
     }
    
    
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        int a=nums.length-1;
        int b=nums.length-2;
        int c=nums.length-3;
        if(nums.length<3)
              return 0;
        int n=nums.length;
        while(a>=0 && b>=0 && c>=0){
          boolean isValid=IsValid(nums[a],nums[b],nums[c]);
            System.out.println(isValid);
            if(isValid)
                 return (nums[a]+nums[b]+nums[c]);
            
            a--;
            b--;
            c--;
            
        }
        
        return 0;
        
        
    }
}