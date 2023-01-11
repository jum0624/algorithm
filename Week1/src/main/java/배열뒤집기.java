import java.util.Arrays;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0, j = num_list.length-1; i < num_list.length; i++, j--) {
            answer[j] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        배열뒤집기 sol = new 배열뒤집기();
        int[] result = {1,2,3,4};
        System.out.println(Arrays.toString(sol.solution(result)));
    }
}
