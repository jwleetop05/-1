package chapter04;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int j = sc.nextInt();
		//현재 시간을 알려줌
		long beforeTime = System.currentTimeMillis();
		int cnt = 0;
		for (int n = 2; n <= 100000; n++) {
			// 소수확인
			boolean isPrime = true;
			for (int i = 2; i * i <= n && isPrime; i++) {
				if (n % i == 0) {
					isPrime = false;
				}
			}
			// 소수 출력
			if (isPrime) {
				System.out.println(++
						cnt +  ":" + n);
			}
		}
		long afterTime = System.currentTimeMillis();
		float secDiffTime = (afterTime - beforeTime)/10;
		System.out.printf("시간차이(m) : %.3f ",(float)secDiffTime);
		sc.close();
	}

}
