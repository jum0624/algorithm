package hash.boj_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), 0);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (map.containsKey(str)) {
                Integer count = map.get(str);
                map.put(str, ++count);
            }
        }

        int result = 0;
        for (String key : map.keySet()
        ) {
            result += map.get(key);
        }

        System.out.println(result);
    }
}
