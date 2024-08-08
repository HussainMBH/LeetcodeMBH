class Solution {
    public int countSeniors(String[] details) {
        return (int)Arrays.stream(details).filter(str -> Integer.parseInt(str.substring(11,13)) > 60).count();
    }
}