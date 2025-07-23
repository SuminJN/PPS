import java.util.*;

class Solution {
    public String solution(int[] food) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<food.length; i++) {
            for(int j=1; j<=food[i]/2; j++) {
                arr.add(i);
            }
        }

        arr.add(0);

        for(int i=food.length-1; i>0; i--) {
            for(int j=1; j<=food[i]/2; j++) {
                arr.add(i);
            }
        }

        String answer = arr.toString().replaceAll("[^0-9]","");

        return answer;
    }
}