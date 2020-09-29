import java.util.Scanner;
class PPSUM
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A[] = new int[T];
        for(int cases=0;cases<T;++cases) {
            int D = sc.nextInt();
            int N = sc.nextInt();
            A[cases] = sum(D,N); 
        }
        sc.close();
        
        for(int val:A) {
            System.out.println(val);
        }
	}
	
	public static int sum(int D, int N) {
	    int ans = 0;
	    for(int i=0;i<D;i++)
	    {
	        ans=(N*(N+1))/2;
	        N = ans;
	    }
	    return ans;
	}
}
