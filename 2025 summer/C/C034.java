import java.io.*;

public class Main {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[5001];
        dp[3] = dp[5] = 1;
        dp[1] = dp[2] = dp[4] = 9999;

        func(n);

        if (dp[n] >= 9999) System.out.println(-1);
        else System.out.println(dp[n]);
    }

    private static int func(int n) {
        if(n < 0) return 9999;

        if (dp[n] != 0) return dp[n];

        return dp[n] = Math.min(func(n - 3) + 1, func(n - 5) + 1);
    }
}