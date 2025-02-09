//Sieve of Eratosthenes

class Solution
{
    public int countPrimes(int n)
    {
        if (n <= 2) {
            return 0;  
        }

        //boolean array to track prime numbers
        boolean[] isPrime = new boolean[n];
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }

         // Sieve of Eratosthenes to mark non-prime numbers
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as false (non-prime)
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

         // Count the no of primes less than n
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
