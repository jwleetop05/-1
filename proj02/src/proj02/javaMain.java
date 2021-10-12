package proj02;

public class javaMain {

	public static void main(String[] args) {
		System.out.println(plusA(1,10));
		System.out.println(plusA(10,1));
		System.out.println(Sumfac(1,10));
		System.out.println(factorial(3));
		System.out.println(SUM(3));
	}

	public static int plusA(int N,int M) {
		int sum = 0;
		if(N > M){
			int t = N;
			N = M;
			M = t;
		}
		for(int  i = N; i <= M; i++) {
			sum += i;
		}
		return sum;
	}
	public static int Sumfac(int n,int M) {
		if(n==M) {
			return M;
		}else {
			return n + Sumfac(n+1, M);
		}
	}
	public static int SUM(int n) {
		if(n==1) return 1;
		else return n + SUM(n-1);
	}

	public static int factorial(int n) {
		if(n==1) return 1;
		else return n * SUM(n-1);
	}

}
