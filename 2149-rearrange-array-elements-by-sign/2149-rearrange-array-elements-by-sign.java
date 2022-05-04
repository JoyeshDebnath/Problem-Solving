class Solution {

    public int find_first_positive(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) return i;
        }
        return 0;
    }

    public int find_first_negetive(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) return i;
        }
        return 0;
    }

    public int[] rearrangeArray(int[] nums) {
        int pos = find_first_positive(nums); //find the 1st occurance of positive
        int neg = find_first_negetive(nums); //find the 1st negetive occurance ..

        int index = 0;
        int Ans[] = new int[nums.length];

        while (index < nums.length) {
            Ans[index++] = nums[pos];
            Ans[index++] = nums[neg];
            pos++;
            neg++;
            while (pos < nums.length && nums[pos] < 0) pos++;

            while (neg < nums.length && nums[neg] > 0) neg++;
        } //iterate
        return Ans;
    }
}
