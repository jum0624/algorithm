package queue.boj_13335;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Queue<Integer> waitingTrucks = new ArrayDeque<>();
        Queue<Integer> bridge = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int weight = Integer.parseInt(st.nextToken());
            waitingTrucks.add(weight);
        }

        int current_weight = 0;
        int count = 0;
        int time = 0;

        // init
        Integer poll = waitingTrucks.poll();
        if (poll <= l) {
            bridge.add(poll);
            current_weight += poll;
            time += 1;
        }


        while (count != n) {
            Integer next_truck = waitingTrucks.peek();
            if (bridge.size() == w) {
                Integer delete_truck = bridge.poll();
                current_weight -= delete_truck;
                if (delete_truck != 0) {
                    count += 1;
                }
            }
            if (next_truck != null && l - current_weight >= next_truck) {
                bridge.add(waitingTrucks.poll());
                current_weight += next_truck;
            } else {
                bridge.add(0);
            }
            time += 1;
        }

        System.out.println(time);

    }

}
