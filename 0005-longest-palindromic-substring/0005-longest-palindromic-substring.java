class Solution {
    private int helper(int l, int r, String s) {
        if (l > r || s == null) return 0;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;
    }

    public String longestPalindrome(String s) {
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int same = helper(i, i, s);
            int diff = helper(i, i + 1, s);
            int l = Math.max(same, diff);

            if (l > end - start) {
                start = i - (l - 1) / 2;
                end = i + l / 2;
            }
        }

        return s.substring(start, end + 1);
    }
}