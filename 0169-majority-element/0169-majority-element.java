class Solution
{
    public int majorityElement(int[] nums)
    {
        int key = nums[0];   //consider 1st is majority 
        int count = 1;

        for(int i=1; i<nums.length; i++)
        {
            if(count == 0)
            {
                key = nums[i];
                count = 1;
            }
            else if (nums[i] == key)
            {
                count++;
            }
            else {
                count --;
            }
        }
        return key;
    }
}