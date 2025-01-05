import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1267
public class A022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sumY = 0; // 영식
        int sumM = 0; // 민식

        for (int i : arr) {
            sumY += ((i / 30) + 1) * 10;
            sumM += ((i / 60) + 1) * 15;
        }

        if (sumY < sumM) System.out.println("Y " + sumY);
        else if (sumY > sumM) System.out.println("M " + sumM);
        else System.out.println("Y M " + sumY);
    }
}
