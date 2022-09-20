class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(char task:tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }
        
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
        
        for(char task:map.keySet()){
            System.out.println(task+"  -->>  "+map.get(task));
            
            maxHeap.add(map.get(task));
        }
        
        int Result=0;
        while(!maxHeap.isEmpty()){
              List<Integer> temp=new ArrayList<>();
              
              for(int i=0;i<n+1;i++){
                  if(!maxHeap.isEmpty()){
                      System.out.println("Top ="+maxHeap.peek());
                      temp.add(maxHeap.poll());
                         }
              }
            
              for(int t:temp){
                  if(--t>0){
                      System.out.println("Value of T="+t);
                         maxHeap.add(t);
                      }
              }
            System.out.println("Length"+maxHeap.size());
            
            Result+=(!maxHeap.isEmpty())?(n+1):temp.size();
            
        }
        
        return Result;
        
        
    }
}