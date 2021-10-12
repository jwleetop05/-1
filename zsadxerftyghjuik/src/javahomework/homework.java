package javahomework;

public class homework {

	public static void main(String[] args) {
		 sadf(1);

	}
	public static void sadf(int a) {
		if(a>10) {
			return;
		} else {
			System.out.println(a);
			sadf(a+1);
		}
		
	}

}
