import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17212
public class B075 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = (N < 8) ? new int[8] : new int[N + 1];

        dp[1] = dp[2] = dp[5] = dp[7] = 1;
        dp[3] = dp[4] = dp[6] = 2;

        for (int i = 8; i <= N; i++) {
            dp[i] = Math.min(Math.min(Math.min(dp[i - 1], dp[i - 2]), dp[i - 5]), dp[i - 7]) + 1;
        }

        System.out.println(dp[N]);
    }
}
