import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13164
public class C122 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sumArr = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            sumArr[i] = arr[i + 1] - arr[i]; // 앞 뒤의 차이를 저장
        }

        Arrays.sort(sumArr);

        int answer = 0;

        for (int i = 0; i < N - K; i++) {
            answer += sumArr[i];
        }

        System.out.println(answer);
    }
}