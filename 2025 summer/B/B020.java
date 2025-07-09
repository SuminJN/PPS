import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// https://www.acmicpc.net/problem/2210
public class B020 {

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    static int[][] map;
    static Set<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new int[5][5];

        for (int i = 0; i < 5; i++) {
            String[] a = br.readLine().split(" ");

            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(a[j]);
            }
        }

        set = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, "");
            }
        }

        System.out.println(set.size());
    }

    static void dfs(int y, int x, String temp) {
        if (temp.length() == 6) {
            set.add(temp);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny >= 0 && nx >= 0 && ny < 5 && nx < 5) {
                dfs(ny, nx, temp + map[ny][nx]);
            }
        }
    }
}
