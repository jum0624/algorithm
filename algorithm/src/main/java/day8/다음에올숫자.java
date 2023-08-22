package day8;

public class 다음에올숫자 {
    public int solution(int[] common) {
        int answer = 0;
        int k = common[1] - common[0];
        int l = -9999;
        if (common[1] != 0 && common[0] != 0) {
            l = common[1] / common[0];
        }


        for (int i = 1; i < common.length - 1; i++) {
            if (common[i + 1] - common[i] == k) {
                answer = common[i + 1] + k;
            } else if (common[i + 1] /common[i] == l) {
                answer = common[i + 1] * l;
            }
        }

        return answer;
    }
}
