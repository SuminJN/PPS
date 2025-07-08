import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/1755
public class A085 {

    static final String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    static class Word {
        int number;
        String str;

        public Word(int number, String str) {
            this.number = number;
            this.str = str;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        ArrayList<Word> arr = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            String temp = Integer.toString(i);
            char[] c = temp.toCharArray();
            temp = "";
            for (char value : c) {
                temp += numbers[value - '0'];
            }
            arr.add(new Word(i, temp));
        }

        arr.sort(Comparator.comparing(o -> o.str));

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i).number + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}
