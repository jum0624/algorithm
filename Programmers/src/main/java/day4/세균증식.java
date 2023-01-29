package day4;

public class 세균증식 {
    public int solution(int n, int t) {
        int answer = 0;
        int ant = n;
        for (int i = 1; i <= t ; i++) {
            ant *= 2;
        }
        answer = ant;
        return answer;
    }

    public static void main(String[] args) {
        세균증식 sol = new 세균증식();
        System.out.println(sol.solution(7, 15));
    }


}
