package day2;

public class 문자반복출력하기 {

    public StringBuffer solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        String[] split = my_string.split("");
        for (int i = 0; i < split.length; i++) {
            String token = split[i];
            for (int j = 0; j < n; j++) {
                sb.append(token);
            }
        }

        return sb;
    }

    public static void main(String[] args) {
        문자반복출력하기 sol = new 문자반복출력하기();
        System.out.println(sol.solution("Hello", 3));
    }
}
