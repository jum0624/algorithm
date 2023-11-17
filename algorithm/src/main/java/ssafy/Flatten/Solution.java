package ssafy.Flatten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	static List<Integer> map;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case <= 10;test_case++) {
			map = new ArrayList<>();
			int dump = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int count = 0; count < 100; count ++) {
				int high = Integer.parseInt(st.nextToken());
				map.add(high);
			}
			for(int i = 0; i<dump ; i++) {
				int min = 999;
				int max = 0;
				for(int num : map) {
					min = Math.min(num, min);
					max = Math.max(num, max);
				}
				int min_index = map.indexOf(min);
				int max_index = map.indexOf(max);
				map.set(min_index, min+1);
				map.set(max_index, max-1);
			}
			int result_min = 0;
			int result_max = 0;
			for(int num : map) {
				result_min = map.stream().mapToInt(v -> v).min().orElse(0);
				result_max = map.stream().mapToInt(v -> v).max().orElse(0);
			}
			System.out.printf("#%d %d\n", test_case, result_max - result_min);
		}
		
	}

}
