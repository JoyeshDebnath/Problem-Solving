class Solution {
    public String breakPalindrome(String palindrome) {
        int freqA=0;
        // char str[]=palindrome.toCharArray();
        StringBuilder sb=new StringBuilder(palindrome);
        for(int i=0;i<sb.length();i++)
        {
            char c=sb.charAt(i);
            if(c=='a')
                 freqA++;
        }
        //when 1 character onlu -->> no way to replace 
        if(sb.length()==1)
              return "";
        //if nos of a is all or 1 lesser than n (ie length of the str is odd ) aabaa  in this case last character is b 
       if(freqA==sb.length() || freqA==sb.length()-1){
             sb.replace(sb.length()-1,sb.length(),"b");
             return sb.toString();
       }
        
         int i=0;
        while(i<sb.length() && sb.charAt(i)=='a')
        {
            
            i++;
        }
        System.out.println(i);
        sb.replace (i,i+1,"a");
        
        return sb.toString();
    }
}