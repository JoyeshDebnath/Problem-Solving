class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int Me=piles.length-2;
        int Alice=piles.length-1;
        int Bob=0;
        int MyScore=0;
        while(Bob<Me){
            System.out.println("ME="+piles[Me]);
            MyScore+=piles[Me];
            Me-=2;
            Alice-=2;
            Bob++;
        }
        return MyScore;
    }
}