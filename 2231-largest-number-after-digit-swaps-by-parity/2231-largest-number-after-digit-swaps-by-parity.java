class Solution {
    
    char[] getDigits(int num){
        String str=Integer.toString(num);
        return str.toCharArray();
    }
    
    public int largestInteger(int num) {
        char[] digits=getDigits(num);
        PriorityQueue<Character> ODDS=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Character> EVENS=new PriorityQueue<>(Collections.reverseOrder());
        
        for(char d:digits){
            if(d%2==0)
                EVENS.add(d);
            else 
                ODDS.add(d);
        }
      int index=0;
      int n=digits.length;
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]%2==0)
            {
                digits[i]=EVENS.poll();
            }
            else{
                 digits[i]=ODDS.poll();
            }
        }//
        String temp=new String(digits);
        return Integer.parseInt(temp);
    }
}