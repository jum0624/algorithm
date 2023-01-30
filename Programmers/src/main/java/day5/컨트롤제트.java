package day5;

public class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;
        int save = 0;
        String[] split = s.split(" ");
        for (String number : split
        ) {
            if (!number.equals("Z")) {
                int num = Integer.parseInt(number);
                answer += num;
                save = Integer.parseInt(number);
            } else {
                answer -= save;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        컨트롤제트 sol = new 컨트롤제트();
        System.out.println(sol.solution("10 Z 20 Z 1"));
    }
}
