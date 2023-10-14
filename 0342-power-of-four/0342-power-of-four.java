class Solution {
    public boolean isPowerOfFour(int n) {
       int num = 1073741824;
        if(n<=0){
            return false; // not consider to - integer
        }
        else if(n == 1){
            return true; // 4^0 = 1
        }
        else if(num%n ==0 &&(n%10==4 || n%10==6)){
            return true;
        }
        else{
            return false;
        }
    }
}