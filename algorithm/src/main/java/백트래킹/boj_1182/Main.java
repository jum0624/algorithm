package 백트래킹.boj_1182;

import java.util.*;
import java.io.*;

public class Main {
	
	static int[] an;
	static int n;
	static int s;
	static int[] index;
	static boolean[] visited;
	
	static int result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		an = new int[n];
		visited = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			an[i] = Integer.parseInt(st.nextToken());
		}
		
		result = 0;
		
		for(int i=1;i<=n;i++) {
			index = new int[i];
			comb(0, 0);
		}
		
		System.out.print(result);
	}
	
	static void comb(int idx, int cnt) {
		if(cnt == index.length) {
			int sum = 0;
			for(int i=0;i<index.length;i++) {
				sum += index[i];
			}
			if(sum == s) result += 1;
			return;
		}
		for(int i=idx;i<n;i++) {
			index[cnt] = an[i];
			comb(i + 1, cnt + 1);
		}
	}

}
