package chapter04;

import java.util.Scanner;

public class A07_Code06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		// 배열 선언 - grades ->변수X, 참조변수0
		int[] grades;

		// 배열 할당
		grades = new int[num];

//				int[] grades = new int[5];
		for (int i = 0; i < grades.length; i++) {
			// grades[i] = (i + 1) * 100;
			grades[i] = sc.nextInt();

		}

		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		// 합을 구한다
		// 최대값을 구한다
		int sum = 0;
		int max = 0;// 초기값은 배열에서 가장 작은 값을 넣어야합니다.
		int min = 9999999;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
			if (grades[i] > max) {
				max = grades[i];
			}
		}
		for (int i = 0; i < grades.length; i++) {
			
			if (grades[i] < min) {
				min = grades[i];
			}
		}
		System.out.println("총 합 : " + sum);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
