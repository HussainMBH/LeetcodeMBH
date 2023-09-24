class Solution {
    public String modifyString(String s) {
        char[] ar = s.toCharArray();
        for(int i=0; i<ar.length; i++){
            if(ar[i] == '?'){
                char prev = (i-1 >= 0) ? ar[i-1] : '\0';
                char next = (i+1 < ar.length) ? ar[i+1] : '\0';
                for(char j='a'; j<='z'; j++){
                    if(j != prev && j != next){
                        ar[i]=j;
                        break;
                    }
                }
            }
        }

        return String.valueOf(ar);
    }
}