

class Solution {
    String modify(String s) {
        
            char ch = s.charAt(0);
            
            if(Character.isLowerCase(ch)){
                
              s = s.toLowerCase();
            }
            else{
               s = s.toUpperCase();
            }
        return s;
    }
}