package proj01;

public class javaMain {

	public static void main(String[] args) {
		// Static 변수는 메모리에 한번 할당되어 프로그램이 종료될 때 해제되는 변수
		sum();
		sum(10);
		sum(5,10);
		System.out.printf("%d~%d까지 덧셈 : %d\n",1,100,Sum(1,100));
		System.out.println(abc(5));
		for(int i = 0; i <= 10; i++) {
			if(abcd(i)==false) {
				System.out.println(i + " 홀수");
			}else {
				System.out.println(i + " 짝수");
			}
		}
	}
	//기본 함수 : value X , 인자 ㅇ벗음
		public static void sum() {
			int sum = 0;
			
			for(int i = 1; i <=10; i++) {
				sum += i;
			}
			System.out.println("1 ~ 10까지 덧셈 : "+ sum);
		}
		//인자(Paramerter) 가 있는 함수(mathod) 형
		public static void sum(int n) {
			int sum = 0;
			
			for(int i = 1; i <=n; i++) {
				sum += i;
			}
			System.out.printf("1 ~ %d까지 덧셈 : %d\n",n,sum);
		}	

			public static void sum(int j,int n) {
				int sum = 0;
				
				for(int j1 = j; j1 <=n; j1++) {
					sum += j1;
				}
				System.out.printf("%d ~ %d까지 덧셈 : %d\n",j,n,sum);
		
	}
			public static int Sum(int j,int n) {
				int sum = 0;
				
				for(int j1 = j; j1 <=n; j1++) {
					sum += j1;
				}
				return sum;
	}
			public static String abc(int n) {
				int odd = 0;
				int Even = 0;
					if(n % 2 == 0) {
						Even += n;
						return "짝수";
					}else {
						odd += n ;
						return "홀수";
					}
					
				}
			
			public static boolean abcd(int n) {
					if(n % 2 == 0) {
						return true;
					}else {
						return false;
					}
					
				}
			}
			

