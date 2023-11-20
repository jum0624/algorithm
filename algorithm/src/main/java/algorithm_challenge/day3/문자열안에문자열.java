package algorithm_challenge.day3;

public class 문자열안에문자열 {
    public int solution(String str1, String str2) {
        int answer = 2;
        int j = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str2.charAt(j) != str1.charAt(i)) {
                j = -1;
            }
            if (j == str2.length() - 1) {
                answer = 1;
                break;
            }
            j += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열안에문자열 sol = new 문자열안에문자열();
        System.out.println(sol.solution("ppprrrogrammers", "6CD"));
    }
}
