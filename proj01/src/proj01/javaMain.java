package proj01;

public class javaMain {

	public static void main(String[] args) {
		// Static ������ �޸𸮿� �ѹ� �Ҵ�Ǿ� ���α׷��� ����� �� �����Ǵ� ����
		sum();
		sum(10);
		sum(5,10);
		System.out.printf("%d~%d���� ���� : %d\n",1,100,Sum(1,100));
		System.out.println(abc(5));
		for(int i = 0; i <= 10; i++) {
			if(abcd(i)==false) {
				System.out.println(i + " Ȧ��");
			}else {
				System.out.println(i + " ¦��");
			}
		}
	}
	//�⺻ �Լ� : value X , ���� ������
		public static void sum() {
			int sum = 0;
			
			for(int i = 1; i <=10; i++) {
				sum += i;
			}
			System.out.println("1 ~ 10���� ���� : "+ sum);
		}
		//����(Paramerter) �� �ִ� �Լ�(mathod) ��
		public static void sum(int n) {
			int sum = 0;
			
			for(int i = 1; i <=n; i++) {
				sum += i;
			}
			System.out.printf("1 ~ %d���� ���� : %d\n",n,sum);
		}	

			public static void sum(int j,int n) {
				int sum = 0;
				
				for(int j1 = j; j1 <=n; j1++) {
					sum += j1;
				}
				System.out.printf("%d ~ %d���� ���� : %d\n",j,n,sum);
		
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
						return "¦��";
					}else {
						odd += n ;
						return "Ȧ��";
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
			

