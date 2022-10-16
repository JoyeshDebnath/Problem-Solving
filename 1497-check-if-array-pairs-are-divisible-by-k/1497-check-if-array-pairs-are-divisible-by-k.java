class Solution {
    public boolean canArrange(int[] A, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            int rem=A[i]%k;
            if(rem<0)
                  rem+=k;
            
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        
        for(int rem:map.keySet()){
            int freq=map.get(rem);
            
            //case 1 : if the remainder is zero 
            if(rem==0){
                if(freq%2!=0)
                    return false;
            }
            //case 2 : if the reminder is n/2
            // else if(rem*2==k)
            // {
            //      if(map.get(rem)%2!=0)
            //          return false;
            // }
            else {
                int leftPartRem=k-rem;
                if(map.containsKey(leftPartRem)==false || map.get(leftPartRem)!=freq)
                    return false;
            }
        }
        return true;
        
    }
}