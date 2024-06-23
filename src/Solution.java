class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;  // Return early if no further carry is needed
            }
            digits[i] = 0;  // Set current digit to 0 if it's 9
        }

        // If all digits were 9, create a new array with an extra digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;  // Set the first digit to 1, rest are 0 by default
        return newNumber;
    }
}
