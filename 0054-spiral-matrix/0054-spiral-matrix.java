class Solution
{
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<>(); 
        int n = matrix.length; 
        int m = matrix[0].length; 
        
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {

            //  left to right
            for (int i = left; i <= right; i++)
                ans.add(matrix[top][i]);
                 top++;

            //  top to bottom.
            for (int i = top; i <= bottom; i++)
                ans.add(matrix[i][right]);
                right--;

            // right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(matrix[bottom][i]);
                bottom--;
            }

            // bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(matrix[i][left]);
                left++;
            }
        }
        return ans;
    }
}    