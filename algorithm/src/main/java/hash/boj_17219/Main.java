package hash.boj_17219;

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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());  // search count
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String siteUrl = st.nextToken();
            String password = st.nextToken();
            map.put(siteUrl, password);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String search = st.nextToken();
            System.out.println(map.get(search));
        }
    }
}
