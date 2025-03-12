class Solution
{
    public int maximumCount(int[] nums)
    {
        int n = nums.length;
        int left = 0, right = n-1;

        while(left<=right)
        {
            int mid = left + (right-left)/2;

            if(nums[mid]>0) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        
         // Now, 'left' is the index of the first positive number
         int pos = n - left;


         // finding last negative
         left = 0; right = n-1;
         
         while(left<=right)
         {
            int mid = left + (right-left) /2 ;

            if(nums[mid]<0) {
                left = mid+1;
            }
            else {
                right = mid - 1;
            }
         }
        
        // Now, 'right' is the index of the last negative number
         int neg = right+1;


         return Math.max(pos,neg);
        
    }
}