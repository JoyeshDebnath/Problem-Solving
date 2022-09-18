class Solution {
    public boolean checkIfExist(int[] A) {
        int N=A.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        //key=(A[i]*2)---------> val=index of A[i]
        
        for(int i=0;i<N;i++){
            int d=A[i]*2;
            map.putIfAbsent(d,i);
        }
        
        for(int j=0;j<N;j++){
            if(map.containsKey(A[j])==true && map.get(A[j])!=j)
                      return true;
        }
        return false;
    }
}