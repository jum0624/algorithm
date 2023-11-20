package algorithm_challenge.day3;

public class 점의위치구하기 {
    public int solution(int[] dot) {
        if (dot[0] >= 0 && dot[1] >= 0) {
            return 1;
        } else if (dot[0] < 0 && dot[1] >= 0) {
            return 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        } else if (dot[0] >= 0 && dot[1] < 0) {
            return 4;
        }
        return 0;
    }

    public static void main(String[] args) {
        점의위치구하기 sol = new 점의위치구하기();
        System.out.println(sol.solution(new int[]{-7,4}));
    }
}
