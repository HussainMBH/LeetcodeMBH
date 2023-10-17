class Solution {
    public boolean hasAlternatingBits(int n) {
        int xor = n^(n>>1);
        if(((xor + 1) & xor) ==0){
            return true;
        }
        else{
            return false;
        }
    }
}