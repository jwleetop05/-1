package proj01;

public class javaMain2 {
	public static void main(String[] args) {
		
		System.out.println(abc(5));
		for(int i = 1; i <= 10; i++) {
			if(abcd(i)==false) {
				System.out.println(i + " È¦¼ö");
			}else {
				System.out.println(i + " Â¦¼ö");
			}
		}
	}
		
		public static String abc(int n) {
			int odd = 0;
			int Even = 0;
				if(n % 2 == 0) {
					Even += n;
					return "Â¦¼ö";
				}else {
					odd += n ;
					return "È¦¼ö";
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
