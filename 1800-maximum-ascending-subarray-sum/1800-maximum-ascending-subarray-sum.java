class Solution
{
    public int maxAscendingSum(int[] nums)
    {
        int temp = nums[0], sum = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] > nums[i-1]) {
                temp = temp + nums[i];
            }
            else {
                temp = nums[i];
            }
            sum = Math.max(temp,sum);
        }
        return sum;
    }
}