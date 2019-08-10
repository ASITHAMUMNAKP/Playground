import java.util.*;
class Main {
	public static void main (String[] args) {
		 int f,l,s=0;
		Scanner in=new Scanner(System.in);
  
      int num = in.nextInt();
      f=num/10;
       l=num % 10;
      int sum=f+l;
      System.out.println(sum);
	}
}