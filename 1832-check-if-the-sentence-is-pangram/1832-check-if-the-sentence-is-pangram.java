class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean letters[]=new boolean[26];
        int counter=0;
        char[] S=sentence.toCharArray();
        
        for(char ch:S){
            if(letters[ch-'a']==false)
            {
                counter++;
                letters[ch-'a']=true;
            }
           else 
               continue;
        }
        
        if(counter>=26)
            return true;//panagram 
        
        return false;
    }
}