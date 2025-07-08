import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://www.acmicpc.net/problem/2002 B117
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String in = br.readLine();

            map.put(in, i);
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            String out = br.readLine();

            for (String str : map.keySet()) {
                if (map.get(out) > map.get(str)) {
                    count++;
                    break;
                }
            }

            map.remove(out);
        }

        System.out.println(count);
    }
}
