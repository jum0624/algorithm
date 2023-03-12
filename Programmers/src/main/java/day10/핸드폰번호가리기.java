package day10;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        String[] split = phone_number.split("");
        for (int i = 0; i < split.length; i++) {
            if (i < split.length - 4) {
                split[i] = "*";
            }
            answer += split[i];
        }
        return answer;
    }
}
