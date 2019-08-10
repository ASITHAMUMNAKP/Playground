import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l,f;
      l = n % 10;
      f=n;
      while(n>=10)
      {
        n=n/10;
      }
      f=n;
      int s= f+l;
      System.out.println(s);
      
      
	}
}