class Seed{
    int plantTime;
    int growTime;
    Seed(int plantTime,int growTime){
        this.plantTime=plantTime;
        this.growTime=growTime;
    }
}//



class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        Seed Plant[]=new Seed[plantTime.length];
        for(int i=0;i<plantTime.length;i++){
            Plant[i]=new Seed(plantTime[i],growTime[i]);
        }
        
        Arrays.sort(Plant,(a,b)->b.growTime-a.growTime);
        
        int time=0;
        int max=0;
        
        for(Seed s:Plant){
            int p=s.plantTime;
            int g=s.growTime;
            
            time+=p;
            max=Math.max(max,time+g);
        }
        return max;
    }
}