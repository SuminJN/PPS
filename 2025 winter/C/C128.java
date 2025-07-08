import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    dp[i][j] 의미: 길이가 i인 수의 각 자리 숫자의 합을 3으로 나눴을 때의 나머지가 j
    각 자리의 숫자의 합이 3이면서 마지막 자리의 수가 5라면 15의 배수이다
 */
// https://www.acmicpc.net/problem/20500
public class C128 {

    static final long MOD = 1000000007L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N+1][3];

        if(N == 1) {
            System.out.println(0);
            return;
        }

        dp[2][0] = 1; // 15
        dp[2][1] = 1; // 55

        for(int i = 3; i <= N; i++) {
            dp[i][0] = (dp[i-1][1] + dp[i-1][2]) % MOD;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD;
            dp[i][2] = (dp[i-1][1] + dp[i-1][0]) % MOD;
        }

        System.out.println(dp[N][0]);
    }
}