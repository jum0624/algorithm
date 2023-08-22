package day5;

public class 대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            int ascii = c;
            if (97 <= ascii && ascii <= 122) {
                ascii -= 32;
                answer += (char) ascii;
            } else if (65 <= ascii && ascii <= 90) {
                ascii += 32;
                answer += (char) ascii;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        대문자와소문자 sol = new 대문자와소문자();
        String result = sol.solution("abCdEfghIJ");
        System.out.println(result);
    }
}
