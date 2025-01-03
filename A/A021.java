import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2010
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 1;

        for (int i = 0; i < N; i++) {
            answer += Integer.parseInt(br.readLine());
        }

        answer -= N;

        System.out.println(answer);
    }
}
