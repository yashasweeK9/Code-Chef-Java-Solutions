import java.util.*;
class BIT2A
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    int ans[][] = new int[T][];
	    for(int cases=0;cases<T;cases++) {
	        int size = sc.nextInt();
	        int arr[] = new int [size];
	        for(int i=0;i<size;i++) {
	           arr[i]=sc.nextInt();
	        }
	        ans[cases]=new int[size];
	        for(int i=0;i<size;i++) {
	            if(arr[i]<arr[size-1])
	                ans[cases][i]=(size-1-i);
	           else
	            ans[cases][i]=0;
	        }
	    }
	    sc.close();
	    for(int[] val:ans) {
	        for(int ele:val) {
	            System.out.print(ele+" ");
	        }
	        System.out.println();
	    }
    }
}
