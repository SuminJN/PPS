import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2846
public class C071 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int temp = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i - 1] < arr[i]) {
                temp += (arr[i] - arr[i - 1]);

                if (i == N - 1) max = Math.max(max, temp);
            } else {
                max = Math.max(max, temp);
                temp = 0;
            }
        }

        System.out.println(max);
    }
}
