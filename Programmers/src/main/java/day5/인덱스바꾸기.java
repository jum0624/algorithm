package day5;

public class 인덱스바꾸기 {

    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] split = my_string.split("");
        char c1 = my_string.charAt(num2);
        char c2 = my_string.charAt(num1);
        for (int i = 0; i < split.length; i++) {
            if (i == num1) {
                answer += c1;
            } else if (i == num2) {
                answer += c2;
            } else {
                answer += split[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        인덱스바꾸기 sol = new 인덱스바꾸기();
        System.out.println(sol.solution("hello", 1, 2));

    }
}
