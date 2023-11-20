package algorithm_challenge.day1;

public class 문자열뒤집기 {

    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        String[] split = my_string.split("");
        for (int i = my_string.length() - 1; i >= 0; i--) {
            sb.append(split[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        문자열뒤집기 sol = new 문자열뒤집기();
        System.out.println(sol.solution("jaron"));
    }
}
