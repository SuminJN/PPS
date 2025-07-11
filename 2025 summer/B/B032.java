import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9237
public class B032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            arr[i] += (i + 1);
        }

        int answer = 0;

        for (int i : arr) {
            answer = Math.max(answer, i);
        }

        System.out.println(answer + 1);
    }
}
