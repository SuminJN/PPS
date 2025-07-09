import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

// https://www.acmicpc.net/problem/2251
public class B013 {

    static int[] size;
    static boolean[][] visited;
    static Set<Integer> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        size = new int[3];
        for (int i = 0; i < 3; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        int sum = size[0] + size[1] + size[2];
        visited = new boolean[sum][sum];
        set = new TreeSet<>(); // 기본 오름차순

        DFS(0, 0, size[2]);

        for (int i : set) {
            System.out.print(i + " ");
        }
    }

    static void DFS(int a, int b, int c) {
        if (visited[a][b]) return;

        if (a == 0) set.add(c);

        visited[a][b] = true;

        if (a != 0) {
            // 0 -> 1
            if (size[1] >= a + b) DFS(0, a + b, c);
            else DFS(a + b - size[1], size[1], c);

            // 0 -> 2
            if (size[2] >= a + c) DFS(0, b, a + c);
            else DFS(a + c - size[2], b, size[2]);
        }

        if (b != 0) {
            // 1 -> 0
            if (size[0] >= a + b) DFS(a + b, 0, c);
            else DFS(size[0], a + b - size[0], c);

            // 1 -> 2
            if (size[2] >= b + c) DFS(a, 0, b + c);
            else DFS(a, b + c - size[2], size[2]);
        }

        if (c != 0) {
            // 2 -> 0
            if (size[0] >= a + c) DFS(a + c, b, 0);
            else DFS(size[0], b, a + c - size[0]);

            // 2 -> 1
            if (size[1] >= b + c) DFS(a, b + c, 0);
            else DFS(a, size[1], b + c - size[1]);
        }
    }
}
