package queue.boj_2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static class Ballroon {
        int index;
        int number;

        public Ballroon(int index, int number) {
            this.index = index;
            this.number = number;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        Deque<Ballroon> list = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(st.nextToken());
            list.add(new Ballroon(i, number));
        }

        Ballroon next = list.poll();
        sb.append(next.index + " ");
        while (!list.isEmpty()) {
            int cnt = next.number;
            if (cnt >= 0) {
                for (int i = 0; i < cnt; i++) {
                    list.addLast(list.poll());
                }
                next = list.pollLast();
            } else {
                for (int i = 0; i < Math.abs(cnt); i++) {
                    list.addFirst(list.pollLast());
                }
                next = list.pollFirst();
            }
            sb.append(next.index + " ");
        }

        System.out.println(sb);

    }
}
