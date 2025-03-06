// intuition:  Hashmap can do both the things find repeating as well as missing

class Solution
{
    public int[] findMissingAndRepeatedValues(int[][] grid)
    {
        int n = grid.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        // filing elements in Hashmap
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                int num = grid[i][j];
                hm.put(num, hm.getOrDefault(num,0) +1);
            }
        }

        int missing = 0;
        int repeat = 0;

        //checking missing and repeated values in hashmap
        for(int i=1; i<=n*n; i++)
        {
            if(!hm.containsKey(i))
            {
                missing = i;
            }
            else if(hm.get(i) == 2) 
            {
                repeat = i;
            }
        }

        return new int[]{repeat,missing};
    }
}
