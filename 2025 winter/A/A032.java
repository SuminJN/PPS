import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2775
public class A032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());

            int[][] dp = new int[N+1][M+1];

            for(int i = 1; i <= M; i++) {
                dp[0][i] = i;
            }

            for(int i = 0; i <= N; i++) {
                dp[i][1] = 1;
            }

            for(int i = 1; i <= N; i++) {
                for(int j = 1; j <= M; j++) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }

            System.out.println(dp[N][M]);
        }
    }
}
