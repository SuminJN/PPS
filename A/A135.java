import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/14248
public class A135 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
            max = Math.max(max, map.get(str));
        }

        List<String> list = new ArrayList<>();
        for(String key : map.keySet()) {
            if(max == map.get(key)) {
                list.add(key);
            }
        }

        Collections.sort(list); // 여러개일 경우 사전순으로 정렬

        System.out.println(list.get(0));
    }
}
