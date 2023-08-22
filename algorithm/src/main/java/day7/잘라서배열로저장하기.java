package day7;

import java.util.ArrayList;

public class 잘라서배열로저장하기 {
    public ArrayList<String> solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();
        int length = my_str.split("").length;
        int k = n;
        int i = 0;
        while (i < length) {
            if (k >= length) {
                k = length;
            }
            String substring = my_str.substring(i, k);
            answer.add(substring);
            i += n;
            k += n;
        }
        return answer;
    }

}
