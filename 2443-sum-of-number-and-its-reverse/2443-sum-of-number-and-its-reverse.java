class Solution {
    int getRev(int n){
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        return r;
    }
    public boolean sumOfNumberAndReverse(int num) {
    
        
       for(int i=0;i<=num;i++)
       {
           int rev=getRev(i);
           if((rev+i)==num)
               return true;
       }
        
        return false;
    }
}