import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14503
public class D012 {

    static final int[] dy = {-1, 0, 1, 0}; // 북 동 남 서
    static final int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int startY = Integer.parseInt(st.nextToken());
        int startX = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        } // 입력 끝

        int y = startY, x = startX;
        int count = 0;

        while (map[y][x] != 1) {

            if (map[y][x] == 0) { // 청소 가능
                count++;
                map[y][x] = -1;
            }

            for (int i = 0; i < 4; i++) {
                dir = (dir + 3) % 4;

                int ny = y + dy[dir];
                int nx = x + dx[dir];

                if (map[ny][nx] == 0) { // 청소되지 않은 빈칸 빌견
                    y = ny;
                    x = nx;
                    break;
                }

                if (i == 3) { // 4칸 모두 빈칸이 아니라면
                    y -= dy[dir];
                    x -= dx[dir];
                }
            }
        }

        System.out.println(count);
    }
}
