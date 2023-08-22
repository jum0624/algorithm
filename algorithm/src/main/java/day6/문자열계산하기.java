package day6;

public class 문자열계산하기 {
    public int solution(String my_string) {
        int answer = 0;
        int number = 0;
        int cal = 1;
        String[] split = my_string.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0) {
                number = Integer.parseInt(split[i]);
                answer += number * cal;
            } else {
                if (split[i].equals("+")) {
                    cal = 1;
                } else {
                    cal = -1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열계산하기 sol = new 문자열계산하기();
        System.out.println(sol.solution("1 + 2 + 3 - 4"));
    }
}
