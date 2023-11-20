package algorithm_challenge.day2;

public class 가위바위보 {
    public String solution(String rsp) {
        String answer = "";
        String[] split = rsp.split("");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("0")) {
                answer += "5";
            } else if (split[i].equals("2")) {
                answer += "0";
            } else {
                answer += "2";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가위바위보 sol = new 가위바위보();
        System.out.println(sol.solution("205"));
    }
}
