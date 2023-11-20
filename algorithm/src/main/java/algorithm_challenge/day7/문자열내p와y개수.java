package algorithm_challenge.day7;

public class 문자열내p와y개수 {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;

        String[] split = s.split("");
        for (String str : split
        ) {
            if (str.equals("p") || str.equals("P")) {
                countP += 1;
            } else if (str.equals("y") || str.equals("Y")) {
                countY += 1;
            }
        }

        if (countP == countY) {
            answer = true;
        } else {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {

    }
}
