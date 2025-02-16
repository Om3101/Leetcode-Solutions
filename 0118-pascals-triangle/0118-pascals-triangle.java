class Solution
{
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> triangle = new ArrayList<>();
        // Base case: numRows = 0
        if (numRows == 0) {
            return triangle;
        }
        
        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        // Generating subsequent rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            
            // First element of the row is always 1
            newRow.add(1);
            
            // Generating the rest of the elements in the row
            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Last element of the row is always 1
            newRow.add(1);
            
            triangle.add(newRow);
        }
        
        return triangle;
      
    }
}
