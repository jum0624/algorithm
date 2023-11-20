package algorithm_challenge.day1;

public class 중복된숫자개수 {
    public int solution(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        중복된숫자개수 sol = new 중복된숫자개수();
        System.out.println(sol.solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
    }
}
