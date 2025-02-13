class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int y = 1;
        for(int x = 1; x < nums.length; x++)
        {
            if(nums[x] != nums[x-1])
            {
                nums[y] = nums[x];
                y++;
            }
        }
        return y;
    }
}