class Solution {
    public int lengthOfLastWord(String s) {
        s = s.stripTrailing(); // remove front and back side space and assign in same variable
        int length = 0;
        
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                return length;
                
            }
            length++;
        }
        return length;
    }
}