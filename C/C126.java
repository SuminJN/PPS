import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1780
public class C126 {

    static int N;
    static int[][] map;
    static int a = 0, b = 0, c = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        map = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(1, 1, N);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static void divide(int y, int x, int size) {
        if (check(y, x, size)) return;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divide(y + i * (size / 3), x + j * (size / 3), size / 3);
            }
        }
    }

    static boolean check(int y, int x, int size) {
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (map[i][j] != map[y][x]) return false;
            }
        }

        if (map[y][x] == -1) a++;
        else if (map[y][x] == 0) b++;
        else c++;

        return true;
    }
}
