import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2799
public class C023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] type = new int[5];

        String[] input = new String[N * 5 + 1];

        for (int i = 0; i < N * 5 + 1; i++) {
            input[i] = br.readLine();
        }

        for (int i = 1; i < M * 5 + 1; i += 5) {
            int count = 0;

            for (int j = 1; j < N * 5 + 1; j++) {
                if (j % 5 == 0) {
                    type[count]++;
                    count = 0;
                } else {
                    if (input[j].charAt(i) == '*') count++;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(type[i] + " ");
        }
    }
}
