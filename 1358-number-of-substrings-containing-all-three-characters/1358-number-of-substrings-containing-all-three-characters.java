class Solution
{
    public int numberOfSubstrings(String s)
    {
        int count = 0;
        int[] lastSeen = {-1, -1, -1}; // Stores last seen indices of 'a', 'b', 'c'
        int n = s.length();

        for (int i = 0; i < n; i++)
        {
            lastSeen[s.charAt(i) - 'a'] = i; // Update last seen index

            // Check if all three characters have been seen
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                count += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
            }
        }

        return count;
    }
}
