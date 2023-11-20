package algorithm_challenge.day6;

public class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int num : arr
        ) {
            answer += num;
        }
        return answer / arr.length;
    }

    public static void main(String[] args) {
        평균구하기 sol = new 평균구하기();
        System.out.println(sol.solution(new int[]{1,2,3,4}));
    }
}
