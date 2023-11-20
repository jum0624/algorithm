package algorithm_challenge.day19.나머지_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] nums;
    static long[] sums;
    static long[] remains;
    static long[] count;
    static long result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        nums = new long[n];
        sums = new long[n];
        remains = new long[n];
        count = new long[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                remains[i] = nums[i] % m;
            }
            else {
                remains[i] = (remains[i - 1] + nums[i]) % m;
            }
        }

        for (int i = 0; i < n; i++) {
            count[(int)remains[i]] += 1;
            if (remains[i] == 0) {
                result += 1;
            }
        }

        for (long k : count
        ) {
            result += ((k * (k - 1)) / 2);
        }

        System.out.print(result);

    }
}
