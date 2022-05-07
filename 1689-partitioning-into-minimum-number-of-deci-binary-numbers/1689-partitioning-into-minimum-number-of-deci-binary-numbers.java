class Solution {

    public int minPartitions(String n) {
        int Ans = Integer.MIN_VALUE;
        for (char digit:n.toCharArray()) {
            
            int d = digit-'0';
            Ans = Math.max(Ans, d);
        }
        return Ans;
    }
}
