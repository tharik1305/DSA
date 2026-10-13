import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int s=Integer.MAX_VALUE;
	    for(int i:a){
	        if(i<s){
	            s=i;
	        }
	    }
	    System.out.print(s+" ");
	}
}
