class Solution {
    static int count;
    public int towerOfHanoi(int n, int from, int to, int aux) {
    count = 0;
    hanoi(n, 'A', 'B', 'C');   
    return count;
    }
    private static void hanoi(int n , char a, char b, char c) {
        if(n == 0) return;
        hanoi(n-1,a,c,b);
        count ++;
        hanoi(n-1,b,a,c);
    }
}
