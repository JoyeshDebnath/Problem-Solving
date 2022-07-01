class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);//sort in descending order based on number of units
        int boxes=0;
        
        for(int[] box:boxTypes)
        {
              if(truckSize>=box[0])
              {
                    boxes+=box[0]*box[1];
                    truckSize-=box[0];
                    
              }
            else {
                boxes+=truckSize*box[1];
                return boxes;
            }
        }
        
        return boxes;
    }
}