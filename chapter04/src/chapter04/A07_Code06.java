package chapter04;

import java.util.Scanner;

public class A07_Code06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		// �迭 ���� - grades ->����X, ��������0
		int[] grades;

		// �迭 �Ҵ�
		grades = new int[num];

//				int[] grades = new int[5];
		for (int i = 0; i < grades.length; i++) {
			// grades[i] = (i + 1) * 100;
			grades[i] = sc.nextInt();

		}

		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		// ���� ���Ѵ�
		// �ִ밪�� ���Ѵ�
		int sum = 0;
		int max = 0;// �ʱⰪ�� �迭���� ���� ���� ���� �־���մϴ�.
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
		System.out.println("�� �� : " + sum);
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);
	}

}
