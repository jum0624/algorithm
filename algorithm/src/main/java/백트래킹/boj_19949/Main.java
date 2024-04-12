package 백트래킹.boj_19949;

import java.io.*;
import java.util.*;

public class Main {
	
	static int[] answer = new int[10];
	static int[] quiz = new int[10];
	static int result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<10; i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		
		result = 0;
		dfs(0);
		
		System.out.println(result);
		
	}
	
	static void dfs(int idx) {
		if(idx == 10) {
			int cnt = 0;
			for(int i=0;i<10;i++) {
				if(answer[i] == quiz[i]) cnt += 1;
			}
			if(cnt >= 5) result += 1;
			return;
		}
		
		
		for(int j=1;j<=5;j++) {
			if(idx >= 2 && quiz[idx - 1] == j && quiz[idx - 2] == j) {
				continue;
			}
			quiz[idx] = j;
			dfs(idx + 1);
		}
			
	}
		
	

}
