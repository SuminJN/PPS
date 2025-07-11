import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2806
public class B040 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[][] dp = new int[N][2];

        dp[0][0] = (str.charAt(0) == 'A') ? 0 : 1;
        dp[0][1] = (str.charAt(0) == 'B') ? 0 : 1;

        for (int i = 1; i < N; i++) {
            if (str.charAt(i) == 'A') {
                dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1] + 1);
                dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1] + 1);
            } else {
                dp[i][0] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1] + 1);
                dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);
            }
        }

        int answer = Math.min(dp[N - 1][0], dp[N - 1][1] + 1);

        System.out.println(answer);
    }
}
