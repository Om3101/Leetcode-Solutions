
/* no. of subsets = 2^n  ==> 1 << n
 list<list>> because subsets itself will be list 
        which will be added together into a bigger list*/

class Solution
{
    public List<List<Integer>> subsets(int[] nums)
    {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        //loop all subset
        for(int i=0; i< (1<<n); i++)
        {
            ArrayList<Integer> list = new ArrayList<>();

            //loop each bit
            for(int j=0; j<n; j++)  {
                if((i & (1 << j)) !=0 )    //means bit is set.
                {
                    list.add(nums[j]);
                }
            }

            ans.add(list);
        }
        return ans;
    }
}