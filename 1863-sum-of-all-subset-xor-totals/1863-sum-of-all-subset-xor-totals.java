class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }

     public int solve(int nums[],int i,int curr){
         if(i==nums.length)
                return curr;
         
         return solve(nums,i+1,curr^nums[i])+solve(nums,i+1,curr);
     }
}