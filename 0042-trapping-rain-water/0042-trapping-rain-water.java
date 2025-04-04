// using 2 pointers

class Solution
{
    public int trap(int[] height)
    {
        int lmax = 0, rmax = 0;
        int l = 0, r = height.length - 1;
        int total = 0;

        while (l <= r)
        { 
            if (height[l] <= height[r]) { 
                if (height[l] >= lmax)
                {
                    lmax = height[l]; // Update left max if current height is greater
                } 
                else {
                    total += lmax - height[l]; // Trapping water at the left side
                }
                l++; 
            } 
            else {
                if (height[r] >= rmax) {
                    rmax = height[r]; // Update right max if current height is greater
                } else {
                    total += rmax - height[r]; // Trapping water at the right side
                }
                r--; 
            }
        }
        return total;
    }
}
