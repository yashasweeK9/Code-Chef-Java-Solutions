import java.util.Scanner;
class HOWMANY
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);		
        int N = sc.nextInt();
        sc.close();
	    int digit = 0;
	    for(int i=N;i>0;i/=10)
	        digit++;
	    System.out.println((digit>3)?"More than 3 digits":(digit==0)? 1:digit);
	    
	}
	
}
