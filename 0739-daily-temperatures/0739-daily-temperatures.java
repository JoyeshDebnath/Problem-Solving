class Pair {
    int temp;
    int index;

    Pair(int temp, int index) {
        this.temp = temp;
        this.index = index;
    }
} //Pair

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Pair> st = new Stack<>();

        int Ans[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int currTemp = temperatures[i];

            while (!st.isEmpty() && st.peek().temp <= currTemp) {
                st.pop();
            }

            Ans[i] = (st.isEmpty()) ? 0 : Math.abs(st.peek().index - i);
            st.push(new Pair(temperatures[i], i));
        }
        return Ans;
    }
}
