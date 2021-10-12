package chapter04;

import java.util.Scanner;

public class A04_Code03 {

	public static void main(String[] args) {
		String str = "Hello,world";
		String input = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please type a string : ");
		input = sc.next();
		// 주소값 비교(==)와 값 비교(equals)
		while (true) {
			if (str.equals(input)) {
				System.out.println("String match! :-)");
				break;
			} else {
				System.out.println("String do not match! :=(");
			}
		}
	}

}
