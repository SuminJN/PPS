import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int flag = 0;

        Arrays.sort(people);

        for (int i = people.length - 1; i >= flag; i--) {
            if(people[i] + people[flag] <= limit) {
                flag++;
                answer++;
            } else {
                answer++;
            }
        }

        return answer;
    }
}