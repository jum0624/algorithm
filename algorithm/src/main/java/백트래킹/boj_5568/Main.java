package 백트래킹.boj_5568;

import java.util.*;
import java.io.*;

public class Main {
	
	static int[] index;
	static boolean[] visited;
	static int[] choice;
	
	static int result;
	
	static int n;
	static int k;
	static HashSet<Integer> set;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		index = new int[n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		choice = new int[k];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			index[i] = Integer.parseInt(st.nextToken());
		}
		
		set = new HashSet<>();
		comb(0);
		System.out.println(set.size());
		
	}
	
	static void comb(int idx) {
		if(idx >= k) {
			result = 0;
			for(int num:choice) {
				if(num >= 10) {
					result *= 10;
				}
				result = result + num;
				result *= 10;
			}
			result /= 10;
			System.out.println(result);
			set.add(result);
			return;
		}
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				visited[i] = true;
				choice[idx] = index[i];
				comb(idx + 1);
				visited[i] = false;
			}
		}
	}
}
