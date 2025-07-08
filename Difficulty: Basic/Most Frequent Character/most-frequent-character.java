
class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String s) {
        
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, j = 0;
        while(j < n){
            if(arr[i] == arr[j]) j ++;
            else{
                int freq = j - i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j - i;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }
        return ans;
    }
}