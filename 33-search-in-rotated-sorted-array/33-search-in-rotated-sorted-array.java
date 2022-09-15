class Solution {

    public int search(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
       if(A.length==1 ){
           if(A[0]==target)
                  return 0;
           else
                return -1;
       }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target == A[mid]) return mid;
            if (target == A[start]) return start;
            if (target == A[end]) return end;
            //not in sequence ....
            if (A[mid] > A[end]) {
                if (target > A[mid] || target < A[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            } //
            else {
                //in sequence ////
                if (target > A[mid] && target < A[end]) start = mid + 1; else end = mid;
            }
        }

        return -1;
    }
}
