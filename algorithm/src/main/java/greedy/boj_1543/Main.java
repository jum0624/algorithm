package greedy.boj_1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String find = br.readLine();

        String[] s_split = s.split("");
        String[] find_split = find.split("");

        int i = 0;
        int result = 0;
        while (i < s_split.length) {
            boolean isTrue = true;
            int start_i= i;
            for (int j = 0; j < find_split.length; j++) {
                if (start_i >= s_split.length ||!s_split[start_i].equals(find_split[j])) {
                    isTrue = false;
                }
                start_i += 1;
            }
            if (isTrue) {
                result += 1;
                i = start_i;
            }
            if (!isTrue) {
                i += 1;
            }
        }

        System.out.println(result);
    }
}
