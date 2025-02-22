class Solution
{
    public int[] asteroidCollision(int[] asteroids)
    {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids)
        {
            boolean destroyed = false; // Track if the asteroid should be removed

            while (!st.isEmpty() && st.peek() > 0 && a < 0)
            { 
                if (st.peek() < -a) { 
                    st.pop(); // Destroy the smaller asteroid
                } 
                else if (st.peek() == -a) {
                    st.pop(); // Both asteroids are destroyed
                    destroyed = true;
                    break;
                } 
                else { 
                    destroyed = true;
                    break; // The new asteroid is destroyed
                }
            }
            if (!destroyed) {
                st.push(a);
            }
        }

        // Convert stack to array
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
