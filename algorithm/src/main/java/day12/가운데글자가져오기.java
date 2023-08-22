package day12;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int size = s.length() / 2;
        if (s.length() % 2 == 0) {
            answer += s.substring(size - 1, size + 1);
        } else {
            answer += s.substring(size, size + 1);
        }
        return answer;
    }
}
