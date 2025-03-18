class Solution
{
    public int longestNiceSubarray(int[] nums)
    {
        int n = nums.length;
        int count = 1;
        int current = nums[0];
        int start = 0;

        for (int i = 1; i < n; i++)
        {
            while ((current & nums[i]) != 0)
            {
                current = current ^ nums[start];
                start++;
            }

            current |= nums[i];
            count = Math.max(count, i - start + 1);
        }

        return count;
    }
}
