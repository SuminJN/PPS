import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2231
public class C004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 0; i < N; i++) {
            int num = i;
            int sum = i;

            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if(sum == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
