class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];  // Temporary array for result
        int left = 0, right = 0;    

        // First pass: Place elements smaller than pivot
        for (int num : nums) {
            if (num < pivot) result[left++] = num;
        }

        // Second pass: Place elements equal to pivot
        for (int num : nums) {
            if (num == pivot) result[left++] = num;
        }

        // Third pass: Place elements greater than pivot
        for (int num : nums) {
            if (num > pivot) result[left++] = num;
        }

        return result; // Return the rearranged array
    }
}
