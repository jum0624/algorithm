package day13;

public class 문자열밀기 {
    public int solution(String A, String B) {
        int answer = 0;
        int count = 0;
        String s = A;
        String tmp = "";
        String change = "";

        int i = 0;
        while(!A.equals(B)) {
            if (i == A.length() - 1) {
                break;
            }
            tmp = s.substring(0, A.length() - 1);
            change = s.substring(A.length() - 1);
            change += tmp;
            s = change;
            count += 1;
            if (B.equals(change)) {
                answer = count;
                break;
            } else {
                answer = -1;
            }
            i += 1;
        }
        return answer;
    }
}
