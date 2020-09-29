import java.util.*;
class ATM2
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String A[] = new String[T];
		for(int cases=0;cases<T;cases++) {
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    String ans = "";
		    for(int i=0;i<N;i++) {
		       int element = sc.nextInt();
		       if(K-element>-1) {
		           ans+="1";
		           K -= element;
		       }
		       else {
		           ans+="0";
		       }
		    }
		    A[cases]=ans;
        }
        sc.close();

        for(String val:A) {
            System.out.println(val);
        }
	}
}
