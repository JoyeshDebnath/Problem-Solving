class Solution {
    public int maximumGroups(int[] grades) {
               Arrays.sort(grades);
        int sum=0;
        int k=1;
        int ce=0;
        int cs=0;
        int i=0;
        int grp=0;
        while(i<grades.length){
            int p=k;
            cs=0;
            ce=0;
            while(i<grades.length && p-->0){
                cs+=grades[i];
                i++;
                ce++;
            }
            if(p>0)
                   break;//not enough elemenets left 
            //while current sum is lesser than or equal to the prev sum 
            //continue to take more elements then 
            while(i<grades.length && cs<=sum){
                cs+=grades[i];
                i++;
                ce++;
            }
            //if there are no elements left  and the
            //current sum is still lesser than or equal to the prev sum then break as it will merged into the prev grp 
            if(cs<=sum)
                break;
            
            sum=cs;
            k=ce+1;//one more to be taken nest time ideally 
            grp++;
            
        }//lopp
        
        return grp;
        
    }
}