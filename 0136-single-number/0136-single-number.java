// xor all the elements. similar elements xor will be 0.
//  that woould result in remaining of the only single element.

class Solution
{
    public int singleNumber(int[] nums)
    {
        int result = 0;

        for (int i = 0; i<nums.length;i++)
        {
            result = result ^ nums[i];
        }
        return result;
    }
}
