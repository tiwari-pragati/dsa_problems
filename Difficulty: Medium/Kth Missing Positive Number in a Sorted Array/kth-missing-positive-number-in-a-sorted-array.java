class Solution {
    public int kthMissing(int[] arr, int k) {
        int hi = arr.length - 1, lo = 0;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            int CorrectNo = mid + 1;
            int missing = arr[mid] - CorrectNo;
            if(missing >= k) hi = mid - 1;
            else lo = mid + 1;
        }
        return hi+1+k;
    }
}