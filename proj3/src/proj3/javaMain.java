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
//set 클래스에 입력
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Student st = new Student();
		System.out.println("이름 입력 : ");
		st.name = sc.next();
		System.out.println("성적 입력 : ");
		st.Kor = sc.nextFloat();
		st.Eng = sc.nextFloat();
		st.Math = sc.nextFloat();
		st.Java = sc.nextFloat();
		System.out.println("당신의 이름은 " + st.name + " 당신의 점수는 " + (int)st.getTotal() + " 당신의 평균은 " + st.getAverage());
	}

}
