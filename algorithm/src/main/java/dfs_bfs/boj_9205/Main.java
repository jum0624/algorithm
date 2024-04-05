package boj_9205;

import java.io.*;
import java.util.*;

public class Main {
	static boolean[] visited;
	static Point[] point;
	static int dest_index;
	static boolean isArrived;
	
	public static class Point {
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		for(int test_case=1;test_case<=n;test_case++) {
			st = new StringTokenizer(br.readLine());
			int store = Integer.parseInt(st.nextToken());
			
			isArrived = false;
			dest_index = 2 + store;
			
			point = new Point[3 + store];  // 1: 집, 2~(n-1) : 편의점, n: 락페스티벌
			visited = new boolean[3 + store];
			
			for(int i=1;i<=store+2;i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				point[i] = new Point(x,y);
			}
			
			Queue<Point> queue = new ArrayDeque<>();
			queue.add(point[1]);
			visited[1] = true;
			Point target_point = point[dest_index];
			int target_x = target_point.x;
			int target_y = target_point.y;
			
			while(!queue.isEmpty()) {
				Point state = queue.poll();
				if(state.x == target_x && state.y == target_y) {
					isArrived = true;
					break;
				}
				for(int i=2;i<=dest_index;i++) {
					Point next = point[i];
					int distinect;
					distinect = Math.abs(next.x - state.x) + Math.abs(next.y - state.y);
					if(distinect <= 1000 && !visited[i]) {
						queue.add(point[i]);
						visited[i] = true;
					}
					
				}
			}
			
			if(isArrived) {
				System.out.println("happy");
			}
			else {
				System.out.println("sad");
			}
		}
	}

}