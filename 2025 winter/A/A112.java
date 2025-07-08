import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1049 A112
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int minPackage = Integer.MAX_VALUE;
        int minOne = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            minPackage = Math.min(minPackage, Integer.parseInt(st.nextToken()));
            minOne = Math.min(minOne, Integer.parseInt(st.nextToken()));
        }

        int answer = 0;

        if (minOne * 6 <= minPackage) { // 줄 하나를 여섯개 사는 것이 패키지 하나 사는 것 보다 더 싸다면
            answer = minOne * N;
        } else {
            answer = (N / 6) * minPackage;
            answer += Math.min((N % 6) * minOne, minPackage); // 남은 줄 처리
        }

        System.out.println(answer);
    }
}
