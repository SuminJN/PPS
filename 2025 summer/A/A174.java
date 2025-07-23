import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        LinkedList<Integer> temp = new LinkedList<>();

        // temp.add(score[0]);
        // answer[0] = score[0];
        temp.add(0);

        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < temp.size(); j++) {
                if(score[i] >= temp.get(j)) {
                    temp.add(j, score[i]);
                    break;
                }
            }

            if(temp.size() > k) {
                answer[i] = temp.get(k-1);
            } else {
                answer[i] = temp.get(i);
            }
        }

        return answer;
    }
}