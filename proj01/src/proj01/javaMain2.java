package proj01;

public class javaMain2 {
	public static void main(String[] args) {
		
		System.out.println(abc(5));
		for(int i = 1; i <= 10; i++) {
			if(abcd(i)==false) {
				System.out.println(i + " Ȧ��");
			}else {
				System.out.println(i + " ¦��");
			}
		}
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
