package 분할정복.boj_17829;

import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] map;
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		n = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int result = func(0,0,n/2);
		
		System.out.print(result);
		
	}
	
	static int func(int x, int y, int k) {
		int[] index = new int[4];
		if(k == 1) {
			index[0] = map[x][y];
			index[1] = map[x + k][y];
			index[2] = map[x][y + k];
			index[3] = map[x + k][y + k];
			
			Arrays.sort(index);
			
			return index[2];
		}
		else {
			index[0] = func(x, y, k/2);
			index[1] = func(x + k , y, k/2);
			index[2] = func(x, y + k, k/2);
			index[3] = func(x + k, y + k, k/2);
			
			Arrays.sort(index);
			return index[2];
		}
	}

}
