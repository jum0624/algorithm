package greedy.boj_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static Time[] list;
    static class Time {
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        list = new Time[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[i] = new Time(start, end);
        }

        // 회의 종료 시간 순으로 정렬
        Arrays.sort(list, new Comparator <Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.end == o2.end) {  // 시작시간이 빠른 예약이 앞으로 정렬
                    return o1.start - o2.start;
                }
                return o1.end - o2.end;
            }
        });

        int count = 1;
        int prev_end = list[0].end;
        // 리스트를 탐색하며, 종료 시간을 기준으로 가장 빠른 예약 찾기
        for (int i = 1; i < n; i++) {
            if (prev_end <= list[i].start) {
                prev_end = list[i].end;
                count += 1;
            }
        }

        System.out.println(count);
    }
}
