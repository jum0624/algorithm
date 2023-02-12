package day6;

public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = 0;

        String numStr = "-" + num;
        // System.out.println(numStr);
        String kStr = String.valueOf(k);

        answer = numStr.indexOf(kStr);

        return answer;
    }

    public static void main(String[] args) {
        숫자찾기 sol = new 숫자찾기();
        System.out.println(sol.solution(123456, 6));
    }
}
