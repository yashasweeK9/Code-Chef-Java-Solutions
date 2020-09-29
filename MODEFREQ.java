import java.util.*;
class MODEFREQ
{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int ans[] = new int[T];
	    for(int cases=0;cases<T;cases++) {
	        int N = sc.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            int arr[] = new int[N];
            int LilIndex = N-1;
	        for(int i=0;i<N;i++) {
	            int element = sc.nextInt();
	            hm.put(element,hm.getOrDefault(element,0)+1);
	        }

	        for(Map.Entry<Integer,Integer> entry: hm.entrySet()) {
                arr[entry.getValue()-1] = arr[entry.getValue()-1]+1;
            }

            for(int i=N-1;i>=0;i--) {
                if(arr[i]>=arr[LilIndex])
                LilIndex = i;
            }

            ans[cases] = LilIndex;
        }
        sc.close();
        
        for(int val:ans) {
            System.out.println(val+1);
        }
	}
}
