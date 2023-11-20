package algorithm_challenge.day7;

public class 숨어있는숫자의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split("[a-zA-Z]");
        for (String s : split
        ) {
            try {
                answer += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        숨어있는숫자의덧셈2 sol
                = new 숨어있는숫자의덧셈2();
        System.out.println(sol.solution("aAb1B2cC34oOp"));
    }
}
