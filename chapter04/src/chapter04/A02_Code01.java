package chapter04;

public class A02_Code01 {
	//(���� ����)
	public static int num = 10;
	
	public static void main(String[] args) {
		//local variable(���� ����)
		int anothernum = 5;
		int num = 2;
		System.out.println(num + anothernum);
		System.out.println("num : " + num);
		System.out.println("anothernum : " + anothernum);
		System.out.println("num : " + A02_Code01.num);
	}

}
