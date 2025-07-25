class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int sum = count(i);

            if (sum > limit) answer += power;
            else answer += sum;
        }

        return answer;
    }

    private int count(int number) { //약수의 개수를 구하는 메서드
        int cnt = 0;

        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) cnt++;
            else if (number % i == 0) cnt += 2;
        }

        return cnt;
    }
}