import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      int l,s=0;
		Scanner in=new Scanner(System.in);
  
      int num = in.nextInt();
       l=num % 10;
      while(num>10)
      {
        num=num/10;
      }
   
        s=num+l;
      System.out.println(s);
            
	}
}