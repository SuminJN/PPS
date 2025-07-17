import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17213
public class C030 {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        dp = new int[30][10];

        System.out.println(comb(M-1, N-1));
    }

    static int comb(int n, int r) {
        if(dp[n][r] != 0) return dp[n][r];

        if(r == 0 || n == r) return dp[n][r] = 1;

        return dp[n][r] = comb(n-1, r-1) + comb(n-1, r);
    }
}
