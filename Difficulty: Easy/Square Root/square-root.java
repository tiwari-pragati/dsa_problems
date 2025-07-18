class Solution {
    int floorSqrt(int n) {
        // root of any number is from 1 to that number
        int root = 0;
        for(int i = 1; i <= n; i ++){
          
            if(i * i > n) break;
              root = i;
        }
        return root;
    }
}