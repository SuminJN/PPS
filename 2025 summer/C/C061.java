import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25391
public class C061 {

    static class Score {
        int a;
        int b;

        public Score(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        PriorityQueue<Score> pq_b = new PriorityQueue<>((o1, o2) -> o2.b - o1.b);

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            pq_b.add(new Score(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        long answer = 0;

        for (int i = 0; i < K; i++) {
            answer += pq_b.remove().a;
        }

        PriorityQueue<Score> pq_a = new PriorityQueue<>((o1, o2) -> o2.a - o1.a);

        while (!pq_b.isEmpty()) {
            pq_a.add(pq_b.remove());
        }

        for (int i = 0; i < M; i++) {
            answer += pq_a.remove().a;
        }

        System.out.println(answer);
    }
}
