
class Solution
{
    public double findMaxAverage(int[] nums, int k)
    {
        int n = nums.length;
        int sum  = 0;

        //find first k sum
        for(int i=0; i<k; i++) {
            sum = sum + nums[i];
        }
        
        int Maxsum = sum;

        for(int i=k; i<n; i++) {
            sum = sum - nums[i-k];     // remove leaving element
            sum = sum + nums[i];   // add entering element

            Maxsum = Math.max(Maxsum,sum);
        }

        return (double)Maxsum / k;
    }
}