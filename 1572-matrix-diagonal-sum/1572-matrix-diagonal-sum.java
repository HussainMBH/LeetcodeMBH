class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        int i = 0, j = 0;
        while(i<n){
            sum  = sum + mat[i][j];
            i++;
            j++;
        }
        i = 0;
        j = n-1;
        while(i<n){
            if(i!=j)
                sum = sum + mat[i][j];
            i++;
            j--;
        }
        return sum;
        
    }
}