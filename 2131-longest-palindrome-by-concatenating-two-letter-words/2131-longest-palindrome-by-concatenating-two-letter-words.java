class Solution {
    public int longestPalindrome(String[] words) {
        
        Map<String,Integer> map=new HashMap<>();
        
        for(String wrd:words)
               map.put(wrd,map.getOrDefault(wrd,0)+1);
        
        int Ans=0;
        boolean central=false;
        
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String word=entry.getKey();
            int wordCnt=entry.getValue();
            //if palindrome 
            if(word.charAt(0)==word.charAt(1)){
                if(wordCnt%2==0){
                    Ans+=wordCnt;
                }
                else{
                    Ans+=(wordCnt-1);
                    central=true;
                }
            }//if palindrome 
            
            else if(word.charAt(0)<word.charAt(1)){
                String rev=word.charAt(1)+""+word.charAt(0);
                if(map.containsKey(rev)){
                    Ans+=Math.min(wordCnt,map.get(rev))*2;
                    //ag  ga
                    
                }
            }
        }//iterate map
        if(central)
                Ans++;
        
        return Ans*2;
    }
}