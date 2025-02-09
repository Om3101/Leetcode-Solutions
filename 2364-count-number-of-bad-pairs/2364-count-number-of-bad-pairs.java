class Solution
{
    public long countBadPairs(int[] nums)
    {
        int n = nums.length;

        for(int i=0; i<n; i++) 
        {
            nums[i] = nums[i] - i;
        }

            HashMap<Integer,Integer> hm = new HashMap<>();
            long ans = 0;
            hm.put(nums[0],1);

            for(int j=1; j<n; j++) {
                int totalBefore = j;
                int get = hm.getOrDefault(nums[j],0);
                ans = ans + (totalBefore-get);
                hm.put(nums[j],get+1);
            }
        
        return ans;
    }
}