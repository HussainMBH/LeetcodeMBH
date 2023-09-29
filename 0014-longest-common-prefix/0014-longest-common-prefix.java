class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Sort the array of strings lexicographically
        Arrays.sort(strs);

        // Take the first and last string from the sorted array
        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int idx = 0; // Index for traversing the characters of the strings

        // Compare the characters at the same index in both strings
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++; // Move to the next character if they are equal
            } else {
                break; // Exit the loop if characters are not equal
            }
        }

        // Return the common prefix substring
        return s1.substring(0, idx);
        
    }
}