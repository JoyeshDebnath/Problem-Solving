class Solution {
    public int triangularSum(int[] A) {
        List<Integer> list=new ArrayList<>();
        for(int a:A){
            list.add(a);

        }
        
        while(list.size()>1){
            // System.out.println("List size="+list.size());
            
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<list.size()-1;i++)
            {
                temp.add((list.get(i)+list.get(i+1))%10);
            }
       
            
            list=new ArrayList<>();
            list=temp;
             
            
            
        }
        return list.get(0);
        
    }
}