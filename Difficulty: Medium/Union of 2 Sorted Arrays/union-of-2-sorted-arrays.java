// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       ArrayList<Integer> temp = new ArrayList<>();
       int n = a.length;
       int m = b.length;
       
       int i = 0, j = 0;
       while(i < n && j < m){
           
           //  skip duplicate elements in  a[] 
           if(i > 0 && a[i-1] == a[i]){
               i ++;
               continue;
           }    
          // skip duplicate elements in b[] 
          if(j > 0 && b[j-1] == b[j]){
              j ++;
              continue;
          }
          //add elements in temp of a[] if i < j
          if(a[i] < b[j]){
              temp.add(a[i]);
              i ++;
          }
          //add ele in temp if i > j of b[]
          else if(a[i] > b[j]){
              temp.add(b[j]);
              j ++;
          }
          // else increment of i and j both 
          else {
              temp.add(a[i]);
              i ++;
              j ++;
          }
       }
       //for a[]
       while(i < n){
           if(i > 0 && a[i-1] == a[i]){
               i ++;
               continue;
           }
           temp.add(a[i]);
           i ++;
       }
       // for b[]
       while(j < m){
           if(j > 0 && b[j - 1] == b[j]){
               j ++;
               continue;
           }
           temp.add(b[j]);
           j ++;
       }
       return temp;
    }
}
