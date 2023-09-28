class Solution {
    public int reverse(int x) {
        int rev = 0;
        int inrev;
        while(x!=0){
            inrev = x%10; //getting reminder 96
            x = x/10; 
            rev = (rev*10) + inrev;
            
            if((rev<(-214748364) && x!=0) || (rev > 214748364 && x!=0))
	             {
	                 return 0;
	             } 
        }
        return rev;        
    }
}