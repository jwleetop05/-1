class Student {
	public static int getsum(int[] a) {
		return a[0] + a[1] + a[2] + a[3];
	}
	public static double getavg(int[] a) {
		return getsum(a)/a.length;
	}
}

public class as {

	public static void main(String[] args) {
		Student a = new Student();
		String name[] = { "檜營錳", "夢�鬄�", "輿雖撩", "檜摹��", "檜鼻團", "譆團晦", "彌戮��", "褻曖⑷", "梯遽繹", "檜ж薑" };
		int score[][] = { { 100, 50, 100, 100 }, { 100, 100, 50, 100 }, { 70, 40, 30, 70 }, { 60, 0, 80, 70 },
				{ 70, 70, 70, 70 }, { 60, 75, 40, 73 }, { 100, 100, 100, 100 }, { 60, 57, 49, 80 }, { 100, 95, 87, 90 },
				{ 24, 50, 27, 50 } };
		System.out.printf("忙式式式式式式成式式式式式式成式式式式式式成式式式式式式成式式式式式式成式式式式式式式式式成式式式式式式成式式式式式忖\n");
		System.out.println("弛 廓 �� 弛 檜 葷 弛 措 橫 弛 艙 橫 弛 熱 з 弛 J A V A 弛 識 薄 弛 ゎ 敕 弛");
		System.out.printf("戍式式式式式式托式式式式式式托式式式式式式托式式式式式式托式式式式式式托式式式式式式式式式托式式式式式式托式式式式式扣"
				+ ""
				+ ""
				+ "\n");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("弛 %2d 弛 %2s 弛 %3d 弛 %3d 弛 %3d 弛 %3d 弛 %3d 弛 %2.3f 弛\n",i+1,name[i],score[i][0],score[i][1],score[i][2],score[i][3],a.getsum(score[i]),a.getavg(score[i]));
		}
		System.out.printf("戌式式式式式式扛式式式式式式扛式式式式式式扛式式式式式式扛式式式式式式扛式式式式式式式式式扛式式式式式式扛式式式式式戎\n");
	}

}
