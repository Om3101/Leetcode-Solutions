// when we get 0 then flip the number and the next two numbers..

class Solution
{
    public int minOperations(int[] nums)
    {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n-2; i++)
        {
            if(nums[i] == 0)
            {
                nums[i] = nums[i] == 0 ? 1 : 0;
                nums[i + 1] = nums[i + 1] == 0 ? 1 : 0;
                nums[i + 2] = nums[i + 2] == 0 ? 1 : 0;
                count++;
            }
        }
        //check if all elements are 1
        for(int i=0; i<n; i++)
        {
            if (nums[i] == 0)  return -1;
        }

        return count;
    }
}