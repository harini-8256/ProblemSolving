package DynamicProgramming;
import java.util.Scanner;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        // int first = 1;
        // int second = 2;
        // for (int i = 3; i <= n; i++) {
        //     int third = first + second;
        //     first = second;
        //     second = third;
        // }
        if (n <= 2) return n;

        int[] dp = new int[n + 1]; 
        dp[0] = 1; 
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
        System.out.println(climbStairs(n));
    }
}
