import java.util.*;

class Solution {
    public int solution(String[][] clothes) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String[] cloth : clothes) {
            if(map.containsKey(cloth[1])) {
                map.put(cloth[1], map.get(cloth[1]) + 1);
            } else {
                map.put(cloth[1], 1);
            }
        }

        if(map.size() == 1) return map.get(clothes[0][1]);

        return map.values().stream().reduce(1, (a, b) -> a * (b + 1)) - 1;
    }
}