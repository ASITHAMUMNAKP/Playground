import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();  
     int f,s;
       f=n;
      while(n>=100)
      {
        n=n/10;
      }
      f=n;
      s=f%10;
      
    System.out.println(s);
    }
}