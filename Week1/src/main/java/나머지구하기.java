public class 나머지구하기 {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }

    public static void main(String[] args) {
        나머지구하기 sol = new 나머지구하기();
        int result = sol.solution(6, 4);
        System.out.println(result);
    }
}


