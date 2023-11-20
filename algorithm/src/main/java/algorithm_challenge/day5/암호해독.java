package algorithm_challenge.day5;

public class 암호해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 0; i < cipher.length(); i++) {
            if ((i+1) % code == 0) {
                answer += cipher.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        암호해독 sol = new 암호해독();
        System.out.println(sol.solution("pfqallllabwaoclk", 2));
    }
}
