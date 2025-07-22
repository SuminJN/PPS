class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int m = 1; m <= yellow; m++) {
            if(yellow % m == 0) {
                int n = yellow / m;

                if(m >= n && brown == (m+n)*2+4) {
                    answer[0] = m + 2;
                    answer[1] = n + 2;
                }
            }
        }

        return answer;
    }
}