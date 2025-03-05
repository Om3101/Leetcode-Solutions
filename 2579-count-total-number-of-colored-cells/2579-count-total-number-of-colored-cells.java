// reln between total no of colored cells and time elapsed in min
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