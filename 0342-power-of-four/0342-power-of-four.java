class Solution {
    public boolean isPowerOfFour(int n) {
       int num = 1073741824;
        if(n<=0){
            return false; // because not consider to - number and 0
        }
        if(n == 1){
            return true; //because 4^0 = 1
        }
        if(num%n == 0 && (n%10 == 4 || n%10 ==6)){
            return true;
        }
        else{
            return false;
        }
    }
}