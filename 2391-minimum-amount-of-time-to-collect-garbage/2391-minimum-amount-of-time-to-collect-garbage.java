class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int GLast=0;
        int PLast=0;
        int MLast=0;
        int GCount=0;
        int PCount=0;
        int MCount=0;
        
        int Ans=0;
        
        int travelCum[]=new int[travel.length+1];
        
        Arrays.fill(travelCum,0);
        
        for(int i=0;i<travel.length;i++){
            travelCum[i+1]=travelCum[i]+travel[i];
        }
        
        
        for(int i=0;i<garbage.length;i++){
            String garbageTypes=garbage[i];
            for(char ch:garbageTypes.toCharArray()){
                if(ch=='M'){
                     MCount++;
                    MLast=i;
                }
                
                else if(ch=='G'){
                       GCount++;
                       GLast=i;
                }
                
                else{ 
                    PCount++;
                    PLast=i;
        }
            }
        }//iterate over garbages ... 
        
        
        Ans=(travelCum[GLast]+GCount)+(travelCum[PLast]+PCount)+(travelCum[MLast]+MCount);
        return Ans;
    }
}