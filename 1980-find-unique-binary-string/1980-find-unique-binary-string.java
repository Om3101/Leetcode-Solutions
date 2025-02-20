/*  most optimal intution -> check the nth character
        at nth number string and return its complement.
        
        for ex :  1st term 1st character is 0 then write 1 
                  2nd term 2nd character is 1 then write 0    and so on.*/

class Solution
{
    public String findDifferentBinaryString(String[] nums)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<nums.length; i++)
        {
            char c = nums[i].charAt(i);

            if(c == '0'){
                sb.append("1");
            }
            else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}