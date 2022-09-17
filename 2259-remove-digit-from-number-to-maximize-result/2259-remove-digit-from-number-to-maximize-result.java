class Solution {
    public String removeDigit(String number, char digit) {
       
        return RemoveD(number,digit);
    }
    
    	public  String RemoveD(String number,char digit){
		// long Ans=0L;
            String Ans="";
            List<String> combinations=new ArrayList<>();
            
		for(int i=0;i<number.length();i++){
			char x=number.charAt(i);
			if(x==digit){
				String newNum=number.substring(0,i)+number.substring(i+1);
			    // Ans=Math.max(Ans,Long.parseLong(newNum));
			    combinations.add(newNum);
            }
		}
            Collections.sort(combinations);
            Ans=combinations.get(combinations.size()-1);
		System.out.println("The maximum possible number after removing the digit="+Ans);
	    return Ans;
        }
}