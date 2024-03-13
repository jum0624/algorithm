package hash.boj_1351;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static long n;
    static long p;
    static long q;
    static Map<Long, Long> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        n = Long.parseLong(strs[0]);
        p = Long.parseLong(strs[1]);
        q = Long.parseLong(strs[2]);

        map = new HashMap<>();
        map.put(0L, 1L);
        System.out.println(info(n));
    }

    public static Long info(long n) {
        if (map.containsKey(n)) return map.get(n);
        long a = info((long) Math.floor(n / p));
        long b = info((long) Math.floor(n / q));
        map.put(n, a + b);
        return a + b;
    }
}
