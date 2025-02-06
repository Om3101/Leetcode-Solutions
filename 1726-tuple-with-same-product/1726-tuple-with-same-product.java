// nCx = (freq * (freq- 1/)2

class Solution {
    public int tupleSameProduct(int[] nums)
    {
        int n = nums.length, count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++)
            {
                int pdt = (nums[i]*nums[j]);
                int freq = hm.getOrDefault(pdt,0);

                count = count + freq * 8;
                hm.put(pdt,freq+1);
            }
        }
        return count;
    }
}