package chapter04;

import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.print("�迭�� ���� �Է��ϼ��� : ");
		int[] data = new int[num];

		for (int i = 0; i < num; i++) {
			data[i] = sc.nextInt();
		}

//				for(int i = 0; i < num; i++) {
//					System.out.print(data[i]+" ,");
//				}
		// �̵�
		// 1. ������ ���� ��� �����Ѵ�.
	
		System.out.print("��� ������ �̵��ұ��?");
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
