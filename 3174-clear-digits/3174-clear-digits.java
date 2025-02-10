class Solution {
    public String clearDigits(String s)
    {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                sb.setLength(sb.length()- 1);
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}