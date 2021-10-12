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
		String name[] = { "ÀÌÀç¿ø", "¹ÚÈñ¼º", "ÁÖÁö¼º", "ÀÌ¼±È£", "ÀÌ»ó¹Î", "ÃÖ¹Î±â", "À±¼®ÈÆ", "Á¶ÀÇÇö", "±èÁØÃ¶", "ÀÌÇÏÁ¤" };
		int score[][] = { { 100, 50, 100, 100 }, { 100, 100, 50, 100 }, { 70, 40, 30, 70 }, { 60, 0, 80, 70 },
				{ 70, 70, 70, 70 }, { 60, 75, 40, 73 }, { 100, 100, 100, 100 }, { 60, 57, 49, 80 }, { 100, 95, 87, 90 },
				{ 24, 50, 27, 50 } };
		System.out.printf("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¨¦¡¦¡¦¡¦¡¦¡¦¡¦¨¦¡¦¡¦¡¦¡¦¡¦¡¦¨¦¡¦¡¦¡¦¡¦¡¦¡¦¨¦¡¦¡¦¡¦¡¦¡¦¡¦¨¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¨¦¡¦¡¦¡¦¡¦¡¦¡¦¨¦¡¦¡¦¡¦¡¦¡¦¤\n");
		System.out.println("¦¢ ¹ø È£ ¦¢ ÀÌ ¸§ ¦¢ ±¹ ¾î ¦¢ ¿µ ¾î ¦¢ ¼ö ÇÐ ¦¢ J A V A ¦¢ ÃÑ Á¡ ¦¢ Æò ±Õ ¦¢");
		System.out.printf("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦«¦¡¦¡¦¡¦¡¦¡¦¡¦«¦¡¦¡¦¡¦¡¦¡¦¡¦«¦¡¦¡¦¡¦¡¦¡¦¡¦«¦¡¦¡¦¡¦¡¦¡¦¡¦«¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦«¦¡¦¡¦¡¦¡¦¡¦¡¦«¦¡¦¡¦¡¦¡¦¡¦©"
				+ ""
				+ ""
				+ "\n");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("¦¢ %2d ¦¢ %2s ¦¢ %3d ¦¢ %3d ¦¢ %3d ¦¢ %3d ¦¢ %3d ¦¢ %2.3f ¦¢\n",i+1,name[i],score[i][0],score[i][1],score[i][2],score[i][3],a.getsum(score[i]),a.getavg(score[i]));
		}
		System.out.printf("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦ª¦¡¦¡¦¡¦¡¦¡¦¡¦ª¦¡¦¡¦¡¦¡¦¡¦¡¦ª¦¡¦¡¦¡¦¡¦¡¦¡¦ª¦¡¦¡¦¡¦¡¦¡¦¡¦ª¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦ª¦¡¦¡¦¡¦¡¦¡¦¡¦ª¦¡¦¡¦¡¦¡¦¡¦¥\n");
	}

}
