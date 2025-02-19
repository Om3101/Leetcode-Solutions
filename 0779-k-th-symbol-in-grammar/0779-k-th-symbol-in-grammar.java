/*intuiton -> each row is double of the previous row.
            The row length grow exponentially as 2^(n-1).

            k is in the first half, it is same as the kth element of previous row

            k is in the second half, it is complement of the corresponding element of previous row */
class Solution
{
    public int kthGrammar(int n, int k)
    {
         if (n == 1)  return 0;

        int mid = (int) Math.pow(2, n - 2); 
        
        if (k <= mid) {                    // k in first half
            return kthGrammar(n - 1, k);
        } 
        
        else {                             // k in second half
            return 1 - kthGrammar(n - 1, k - mid);
        }
    }
}