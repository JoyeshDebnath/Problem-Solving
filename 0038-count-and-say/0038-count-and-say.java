class Solution {
    public String countAndSay(int n) {
        
        String val="1";
        
        while(n-->1){
            val=formValue(val);
            System.out.println("Value ="+val);
            
        }
        
       return val; 
    }
    
    public String formValue(String v){
        
        // int counter=0;
        StringBuilder currVal=new StringBuilder(v);
        
        int ind=0;
        StringBuilder newVal=new StringBuilder();
        System.out.println("Value entered ="+currVal.toString());
        while(ind<currVal.length()){
           
            int counter=1;
         
            char curr=currVal.charAt(ind);
    System.out.println("counter="+counter);
            System.out.println("curr ch="+curr);
            
            while(ind+1<currVal.length() && currVal.charAt(ind)==currVal.charAt(ind+1)){
                counter++;
                ind++;
            }
            
            newVal.append(counter);
            newVal.append(curr);
            
            ind++;
                  
        }//traverse till last index .... 
        return newVal.toString();
    }//for the new value 
    
    
}