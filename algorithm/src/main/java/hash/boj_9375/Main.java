package hash.boj_9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int test_case = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= test_case; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String category = st.nextToken();
                Integer count = 0;
                if (map.containsKey(category)) {
                    count = map.get(category);
                }
                map.put(category, count + 1);
            }

            int result = 1;
            for (String category : map.keySet()
            ) {
                result *= (map.get(category) + 1);
            }
            System.out.println(result - 1);
        }
    }
}
