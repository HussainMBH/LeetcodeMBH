class Solution {
    public boolean isPalindrome(int x) {
        //if come - x system will return false. because can't get palindrome coreectly
        if(x<0){
            return false;
        }
        
        int number = x;
        int reverse = 0;
        while(number>0){
            reverse = reverse *10 + number %10;
            number = number / 10;
        }
        return x== reverse;
    }
}