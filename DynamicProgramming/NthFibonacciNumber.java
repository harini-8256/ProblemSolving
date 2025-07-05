package DynamicProgramming;

import java.util.Scanner;

public class NthFibonacciNumber {

    // Function to compute nth Fibonacci number using DP
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];  // Array to store Fibonacci values
        dp[0] = 0;
        dp[1] = 1;

        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));
    }
}
