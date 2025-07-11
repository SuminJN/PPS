import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15729
public class B037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                arr[i + 1] = (arr[i + 1] == 1) ? 0 : 1;
                arr[i + 2] = (arr[i + 2] == 1) ? 0 : 1;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
