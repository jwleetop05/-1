package chapter04;

import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("배열의 값를 입력하세요 : ");
		int[] data = new int[num];

		for (int i = 0; i < num; i++) {
			data[i] = sc.nextInt();
		}

//				for(int i = 0; i < num; i++) {
//					System.out.print(data[i]+" ,");
//				}
		// 이동
		// 1. 마지막 값을 어디간 저장한다.
	
		System.out.print("몇번 옆으로 이동할까요?");
		int count = sc.nextInt();
		for (int j = count; j > 0; j--) {
			int tmp = data[num - 1];
			for (int i = num - 2; i >= 0; i--) {
				data[i + 1] = data[i];
			}
			data[0] = tmp;
		}
		for (int i = 0; i < num; i++) {
			System.out.print(data[i] + " ");
		}
		sc.close();
	}

}
