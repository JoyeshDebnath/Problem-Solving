class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String str1="";
        String str2="";
        for(String wrd:word1)
        {
            str1+=wrd;    
        }
        
        for(String wrd:word2){
            str2+=wrd;
        }
        
        return (str1.equals(str2));
        
    }
}