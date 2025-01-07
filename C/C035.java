import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3000
public class C035 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];
        int[] X = new int[100001];
        int[] Y = new int[100001];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());

            X[A[i]]++;
            Y[B[i]]++;
        }

        long count = 0;

        for(int i = 0; i < N; i++) {
            count += (long) (X[A[i]] - 1) * (Y[B[i]] - 1);
        }

        System.out.println(count);
    }
}
