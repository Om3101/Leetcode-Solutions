//xor of start and goal... results number of 1's will be the count for flipping.

class Solution
{
    public static int count1(int num)
    {
        int count = 0;
        while(num != 0) {
            count = count + (num & 1);
            num >>= 1;
        }
        return count;
    }

    public int minBitFlips(int start, int goal)
    {
        int xor = start ^ goal;

        return count1(xor);
    }
}