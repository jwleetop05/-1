package chapter04;

public class A06_Code05 {

	public static void main(String[] args) {
		//배열 선언 - grades ->변수X, 참조변수0
		int[] grades;
		
		//배열 할당
		grades = new int[5];
		
//		int[] grades = new int[5];
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
//		int i = 0;
//		while(i < grades.length) {
//			System.out.println(grades[i]);
//			i++;
//		}
		
	}

}
