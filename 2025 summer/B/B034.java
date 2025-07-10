import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int[] arr = new int[n + 2]; // 앞뒤 인덱스 접근을 위한 여유 공간
        Arrays.fill(arr, 1, n + 1, 1); // 모든 학생에게 1벌씩 체육복 할당

        // 도난당한 학생의 체육복 개수를 1 감소시킴
        for (int i : lost) {
            arr[i]--;
        }

        // 여벌 체육복이 있는 학생의 체육복 개수를 1 증가시킴
        for (int i : reserve) {
            arr[i]++;
        }

        // 체육복이 없는 학생을 순차적으로 확인하며 앞뒤 학생에게 빌릴 수 있는지 확인
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] == 0) {
                if (arr[i - 1] == 2) {
                    arr[i - 1]--;
                    arr[i]++;
                } else if (arr[i + 1] == 2) {
                    arr[i]++;
                    arr[i + 1]--;
                }
            }
        }

        // 체육복을 1벌 이상 가지고 있는 학생 수를 계산
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] >= 1) answer++;
        }

        return answer;
    }
}