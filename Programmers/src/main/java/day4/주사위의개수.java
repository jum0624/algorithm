package day4;

public class 주사위의개수 {

    public int solution(int[] box, int n) {
        int answer = 1;

        for (int size:box) {
            int k = size / n;
            answer *= k;
        }
        return answer;
    }

    public static void main(String[] args) {
        주사위의개수 sol = new 주사위의개수();
        System.out.println(sol.solution(new int[]{1,1,1}, 1));
        
    }
}
