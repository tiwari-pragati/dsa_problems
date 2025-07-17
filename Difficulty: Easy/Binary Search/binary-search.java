class Solution {
    public int binarysearch(int[] arr, int k) {
        
        int lo = 0, hi = arr.length - 1, idx = -1;
        
        while(lo <= hi){
            int mid = (lo + hi)/2;
            
            if(arr[mid] > k) hi = mid - 1;
            
            else if(arr[mid] < k) lo = mid + 1;
            
            else{ // arr[mid] == k
            idx = mid;
            hi = mid - 1;
            }
        }
        return idx;
    }
}