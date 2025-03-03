/* intuition is to maintain 3 diff lists for <,=,> elements
    and fill the values in them and then merge all the 3
    as we cannot do inplace partitioning as*/


class Solution
{
    public int[] pivotArray(int[] nums, int pivot)
    {
       ArrayList<Integer> a1 = new ArrayList<>();
       ArrayList<Integer> a2 = new ArrayList<>();
       ArrayList<Integer> a3 = new ArrayList<>();

       for(int num: nums)
       {
          if(num<pivot)    a1.add(num);

          else if (num==pivot)  a2.add(num);

          else  a3.add(num);
       }

        //merge

        int i=0;
        for(int num:a1)     nums[i++] = num;
        for(int num:a2)     nums[i++] = num;
        for(int num:a3)     nums[i++] = num;

        return nums;
    }
}