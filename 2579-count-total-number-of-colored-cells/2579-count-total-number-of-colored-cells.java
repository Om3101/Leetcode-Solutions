/* intuition : n = 1 -> 1;
               n = 2 -> 5;
               n = 3 -> 13;
               n = 4 -> 25;

            so as we can see the differnce between two consecutive ans are multiple of 4 */

class Solution
{
    public long coloredCells(int n)
    {
        long count = 1;
        for(int i=1; i<n; i++)
        {
            count = count + 4 * i;
        }
        return count;
    }
}
