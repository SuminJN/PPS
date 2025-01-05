import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17210
public class A029 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        boolean door = br.readLine().equals("0");

        if (N >= 6) { // 6 이상은 탈출 불가능
            System.out.println("Love is open door");
        } else {
            for (int i = 1; i < N; i++) {
                if (door) {
                    System.out.println(1);
                    door = false;
                } else {
                    System.out.println(0);
                    door = true;
                }
            }
        }
    }
}
