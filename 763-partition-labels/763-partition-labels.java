class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int prev=-1;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        
        for(int i=0;i<n;i++)
              map.put(s.charAt(i),i);
        
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,map.get(s.charAt(i)));
            
        
        
        if(i==max)
        {
            ans.add(max-prev);
            prev=max;
        }
        
    }
        
        return ans;
}
}