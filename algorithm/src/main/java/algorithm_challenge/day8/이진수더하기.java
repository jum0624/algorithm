package algorithm_challenge.day8;

class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        String answer = "";

        int i = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        answer += Integer.toBinaryString(i);

        return answer;
    }

    public static void main(String[] args) {
        이진수더하기 sol = new 이진수더하기();
        System.out.println(sol.solution("1111111111", "1"));
    }
}