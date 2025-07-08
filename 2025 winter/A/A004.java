import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/12910?language=java
class A004 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        list.sort(Comparator.naturalOrder());

        int[] answer = null;

        if (list.isEmpty()) {
            answer = new int[]{-1};
        } else {
            answer = list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        return answer;
    }
}