package hash.boj_13414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<String> queue = new LinkedHashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken()); // 수강가능 인원
        int ready = Integer.parseInt(st.nextToken());  // 대기 인원
        for (int i = 0; i < ready; i++) {
            st = new StringTokenizer(br.readLine());
            String newOne = st.nextToken();
            if (queue.contains(newOne)) {
                queue.remove(newOne);
            }
            queue.add(newOne);
        }

        for (int i = 0; i < count; i++) {
            Iterator<String> iter = queue.iterator();
            if (iter.hasNext()) {
                String key = iter.next();
                System.out.println(key);
                queue.remove(key);
            }
        }

    }
}
