package proj3;

import java.util.Scanner;

class Student{
	public String name;
	public float Kor, Eng, Math, Java;
	
	public float getTotal() {
		return Kor+Eng+Math+Java;
	}
	public float getAverage() {
		return getTotal()/4;
	}
}


public class javaMain {
//set Ŭ������ �Է�
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Student st = new Student();
		System.out.println("�̸� �Է� : ");
		st.name = sc.next();
		System.out.println("���� �Է� : ");
		st.Kor = sc.nextFloat();
		st.Eng = sc.nextFloat();
		st.Math = sc.nextFloat();
		st.Java = sc.nextFloat();
		System.out.println("����� �̸��� " + st.name + " ����� ������ " + (int)st.getTotal() + " ����� ����� " + st.getAverage());
	}

}
