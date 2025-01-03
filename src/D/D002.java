package D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D002 {

    static int H, W, N, room;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T > 0) {
            st = new StringTokenizer(br.readLine());

            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            if (N % H == 0) {
                room = (100 * H) + (N / H);
            } else {
                room = (100 * (N % H)) + (N / H) + 1;
            }

            System.out.println(room);

            T--;
        }

    }
}
