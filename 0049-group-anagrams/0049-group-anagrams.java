class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map=new HashMap<>();
         List<List<String>> AnsList=new ArrayList<>();
        for(String str:strs){
            
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(map.containsKey(st)==false)
            {
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(st,list);
            }
            else{
                List<String> temp=map.get(st);
                temp.add(str);
            }
        }//iteratev over the strings
        
        
        for(String key:map.keySet()){
            List<String> subList=new ArrayList<>();
            for(String s:map.get(key))
               subList.add(s);
            
            
            AnsList.add(subList);
        }
       
        
        return AnsList;
    }
}