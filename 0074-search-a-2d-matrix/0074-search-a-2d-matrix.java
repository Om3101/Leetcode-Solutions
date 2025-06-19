class Solution
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int value = matrix[mid / n][mid % n];   // divides the matrix as a flat array 
                                                    // dividing row as m/n and column as m%n
            if (value == target) return true;
            else if (value < target) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
}
