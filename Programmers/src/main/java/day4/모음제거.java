package day4;

public class 모음제거 {
    public String solution(String my_string) {
        String answer = my_string;
        String filterString = "aeiou";
        String[] split = filterString.split("");
        for (String s:split) {
            answer = answer.replaceAll(s, "");
        }
        return answer;
    }

    public static void main(String[] args) {
        모음제거 sol = new 모음제거();
        System.out.println(sol.solution("nice to meet you"));
    }

}
