class Solution {
    public int countPrimes(int n) {
        if(n<=2)
              return 0;
        
        return countPrimesUtil(n);
    }
    
    int countPrimesUtil(int n)
    {
        boolean Prime[]=new boolean[n+1];
        Arrays.fill(Prime,true);
        int ans=0;
        
        for(int i=2;i<n;i++){
            if(Prime[i]==true)
                  ans++;
            
            for(int j=2;j*i<n;j++)
            {
                 Prime[i*j]=false;
            }
        }
        
        return ans;
    }//count the primes 
}