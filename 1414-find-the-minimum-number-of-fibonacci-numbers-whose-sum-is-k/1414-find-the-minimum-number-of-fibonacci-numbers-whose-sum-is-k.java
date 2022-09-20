class Solution {
    List<Integer> fibo=new ArrayList<>();
    public void generateFibo(int K){
             int a=1;
             int b=1;
            fibo.add(a);
            fibo.add(b);
        while(b<=K){
           int c=a+b;
           fibo.add(c);
           a=b;
           b=c;
        }
        
        for(int fib:fibo){
            System.out.print(fib+"    ");
        }
        System.out.println();
        
}//generate all fibonacci numbers upto k 
    
    public int findMinFibonacciNumbers(int k) {
        
        int target=k;
        generateFibo(k);
        int steps=0;
        int ind=fibo.size()-1;
        System.out.println("steps.."+steps+"  index="+ind);
        while(ind>=0 && target!=0){
            int diff=target-fibo.get(ind);
            System.out.println("The diff="+diff+"   the target="+target+"   the index="+ind);
            if(diff<0)//-ve 
            {
                ind--;
                continue;
            }else {
                //+ve 
                target=diff;
                ind--;
                steps++;
            }
        }
        
        return steps;
    }
}