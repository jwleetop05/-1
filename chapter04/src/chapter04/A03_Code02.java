package chapter04;

import java.util.Scanner;

public class A03_Code02 {

	public static void main(String[] args) {
		int number = 123;

		// ���� Ű���� �Է¹޴� ó��
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter an integer : ");
			int input = sc.nextInt();
			if (input == number) {
				System.out.println("Numbers match! :-)");
				break;
			} else {
				System.out.println("Numbers do not match! :-(");
			}
		}
		sc.close();
	}

}
