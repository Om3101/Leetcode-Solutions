class Solution
{
    public int maxAscendingSum(int[] nums)
    {
        int n = nums.length;
        int temp = nums[0], max = nums[0];

        for(int i=1; i<n; i++)
        {
            if(nums[i] > nums[i-1]) {
                temp = temp + nums[i];
            }
            else {
                temp = nums[i];
            }
            max = Math.max(temp,max);
        }
        return max;
    }
}