class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        System.arraycopy(digits, 0, result, 0, digits.length);
        boolean inc = true;
        for (int i = result.length - 1; i >= 0; i--) {
            if (inc) {
                result[i]++;
                if (result[i] > 9) {
                    result[i] = 0;
                    inc = true;
                } else {
                    inc = false;
                }
            } else {
                return result;
            }
        }

        if (inc) {
            int[] result2 = new int[digits.length + 1];
            result2[0] = 1;
            return result2;
        } else {
            return result;
        }

    }
}