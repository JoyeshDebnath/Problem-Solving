class Pair{
    String word;
    int freq;
    Pair(String word,int freq){
        
        this.word=word;
        this.freq=freq;
    }
}



class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
              if(a.freq==b.freq)
                     return a.word.compareTo(b.word);
             else 
                 return b.freq-a.freq;
        });
        
        Map<String, Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        for(String word:map.keySet()){
            int freq=map.get(word);
            Pair p=new Pair(word,freq);
            pq.add(p);
        }
        
        List<String> Ans=new ArrayList<>();
        while(!pq.isEmpty() && k-->0){
            Pair rem=pq.poll();
            Ans.add(rem.word);
        }
        return Ans;
        
    }
}