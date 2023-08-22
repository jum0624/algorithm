package day2;

public class 특정문자제거하기 {

    public String solution(String my_string, String letter) {
        String answer = "";
        String str = my_string.replace(letter, "");
        answer = str;
        return answer;
    }

    public static void main(String[] args) {
        특정문자제거하기 sol = new 특정문자제거하기();
        System.out.println(sol.solution("abcdef", "e"));
    }
}
