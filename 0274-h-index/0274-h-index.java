class Solution{
    public int hIndex(int[] citations)
    {
        int n = citations.length;
        Arrays.sort(citations);
        
        int high = n-1;
        int low = 0;
        int count = 0;

        while(low<=high) {
            int mid = (low + high) /2;

            if(citations[mid] >= n-mid)
            {
                count  = n-mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return count;
    }
}