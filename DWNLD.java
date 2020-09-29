import java.util.Scanner;
class DWNLD
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A[] = new int[T];
		for(int cases=0;cases<T;++cases) {
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int sum = 0;
		    for(int i=0;i<N;++i) {
		        int Ti = sc.nextInt();
		        int Di = sc.nextInt();
                if(Ti-K<=0) {
                    K = K - Ti;
                    Ti=0;
                }
                else {
                    Ti = Ti - K;
                    K = 0;
                }
                sum+=(Ti*Di);
		    }
		    A[cases]=sum;
		}
		sc.close();
		for(int val:A) {
		    System.out.println(val);
		}
		
	}
}
