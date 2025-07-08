import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14248
public class B015 {

    static int N, count;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        visited = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = Integer.parseInt(br.readLine());

        DFS(start);

        System.out.println(count);
    }

    static void DFS(int now) {
        if (visited[now]) return;

        visited[now] = true;
        count++;

        // 왼쪽으로 점프 가능하다면
        if (now - arr[now] > 0) {
            DFS(now - arr[now]);
        }

        // 오른쪽으로 점프 가능하다면
        if (now + arr[now] <= N) {
            DFS(now + arr[now]);
        }
    }
}
