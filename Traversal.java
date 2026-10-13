import java.util.*;
	public class Traversal {
	  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter n: ");
      int a= sc.nextInt();
      int[] n=new int[a];
      for(int i=0;i<a;i++){
        n[i]= sc.nextInt();}
      for(int i : n){
	        System.out.print(i+" ");}
	  }
	  
	}
