class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int k = 1;      // for storing number of valid elements
        int count = 1;  // how many times no has appeared

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                count++;
            } 
            else {
                count = 1;
            } 

            if(count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }   
        return k;
    }
}