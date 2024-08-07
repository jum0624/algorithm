package hash.boj_11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                String substring = str.substring(j, j + i);
                if (!map.containsKey(substring)) {
                    map.put(substring, 0);
                }
                Integer count = map.get(substring);
                map.put(substring, ++count);
            }
        }

        long count = map.values().stream().count();
        System.out.println(count);
    }
}
