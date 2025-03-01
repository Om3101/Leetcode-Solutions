class Solution
{
    public int[] applyOperations(int[] nums)
    {
        int n = nums.length;
        
        for(int i=0; i<n-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }
         
        //placing non zero elements at correct position
        int idx = 0;
        for(int i=0; i<n; i++)
        {
            if(nums[i] != 0)     nums[idx++] = nums[i];
        }


        // fill remaining position with 0;
        while(idx<n) {
            nums[idx++] = 0;
        }

        return nums;
    }
}