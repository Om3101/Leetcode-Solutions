class Solution
{
    public String longestPalindrome(String s)
    {
        int n = s.length();

        if (s == null || n < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < n; i++) {
            int len1 = expand(s, i, i); // Odd length palindrome
            int len2 = expand(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
