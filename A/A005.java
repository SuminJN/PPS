public class A005 {

    // 시간 꽤 걸린 문제

    public static void main(String[] args) {

        String skill = "CBD";
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution(skill, skill_trees));
    }

    static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String str : skill_trees) {

            String temp = "";

            for (char c : str.toCharArray()) {
                if (skill.contains(String.valueOf(c))) {
                    temp += c;
                }
            }

            if (skill.indexOf(temp) == 0) answer++;
        }

        return answer;
    }
}
