class Solution {
    public boolean isPalindrome(int x)
    {
        int ans =0;
        int n = x;

        while(x>0)
        {
            int temp = x%10;
            x = x/10;

            ans = (ans*10 ) + temp;
        }
       if(ans == n){
        return true;
       }
       return false;
    }
}