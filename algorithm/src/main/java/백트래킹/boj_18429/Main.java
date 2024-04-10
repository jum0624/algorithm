package 백트래킹.boj_18429;

import java.io.*;
import java.util.*;

public class Main {
	static int[] day;
	static boolean[] visited;
	static int[] index;
	
	static int n;
	static int k;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());  // n일동안 n개의 서로다른 운동기구. 
		k = Integer.parseInt(st.nextToken());  // 하루동안 소모되는 칼로리
		
		day = new int[n + 1];
		visited = new boolean[n + 1];
		index = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
	
		for(int i=1;i<=n;i++) {
			day[i] = Integer.parseInt(st.nextToken());
		}
		
		cnt = 0;
		comb(1);
		
		System.out.print(cnt);
		
	}
	
	static void comb(int idx) {
		if(idx > n) {
			int power = 500;
			boolean isTrue = true;
			for(int i=1;i<=n;i++) {
				power += index[i];
				power -= k;
				if(power < 500) {
					isTrue = false;
				}
			}
			if(isTrue) cnt += 1;
			return;
		}
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				visited[i] = true;
				index[idx] = day[i];
				comb(idx + 1);
				visited[i] = false;
			}
		}
	}

}
