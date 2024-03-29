class Solution {
    public int[] nextGreaterElements(int[] nums) {
     
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            stack.push(nums[i]);
        }
        
        for(int i=nums.length-1;i>=0;i--)
        {
            int ele=nums[i];
            
            while(stack.isEmpty()==false && stack.peek()<=ele)
            {
                stack.pop();
            }
            
            nums[i]=(stack.size()==0)?-1:stack.peek();
            stack.push(ele);
            
        }
        
        return nums;
    }
}