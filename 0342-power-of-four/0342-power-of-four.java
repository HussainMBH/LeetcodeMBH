class Solution {
    public boolean isPowerOfFour(int n) {
       int num = 1073741824;
       if(n<=0){
           return false; // not consider to 0 or - value
       }
        else if(n == 1){
            return true; // 0 power of 4 = 1
        }
        else if(num%n == 0 &&(n%10 == 4 || n%10 ==6)){
            return true;
        }
        else{
            return false;
        }
    }
}
