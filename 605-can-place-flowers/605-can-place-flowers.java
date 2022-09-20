class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int N) {
        int i=0;
        int planted=0;
        
        while(i<flowerbed.length){
            if(i>=flowerbed.length)
                  break;
            
            if(flowerbed[i]==1){
                System.out.println("Index Position ="+i +"   Flower status="+flowerbed[i]);
                i+=2;
                  System.out.println("Index Position Changed To ="+i );
                continue;
            }
            else{
                   // System.out.println("Index Position ="+i +"   Flower status="+flowerbed[i]);
                if(i<flowerbed.length  && (i==(flowerbed.length-1) || flowerbed[i+1]==0)){
                      System.out.println("Index Position ="+i +"   Flower status="+flowerbed[i]);
                    planted++;
                    i+=2;
                   System.out.println("Index Position Changed To ="+i );
                }else{
                    i++;
                }
            }
        }
        return (planted>=N);
    }
}