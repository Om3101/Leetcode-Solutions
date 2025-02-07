class Solution
{
    public int trailingZeroes(int n)
    {
        int count = 0;
        
        // Count factors of 5
        while (n >= 5)
        {
            n /= 5;
            count += n;
        }
        return count;
    }
}