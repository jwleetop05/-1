package chapter04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Code11 {

	public static void main(String[] args) throws IOException {
		// 1.입력장치
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int n = sc.nextInt();
		int n = Integer.parseInt(br.readLine());프레스티지
		int[] data = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), "/");
		for (int i = 0; i < n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		sc.close();

		int count = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] == data[j]) {
					count++;
					System.out.printf("%d번째 쌍(%d,%d)\n", count, data[i], data[j]);
				}
			}
		}
		System.out.printf("%d 쌍", count);
	}

}
