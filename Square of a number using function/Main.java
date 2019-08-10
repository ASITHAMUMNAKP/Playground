import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
      int s=num*num;
      return s;
  }
	public static void main (String[] args)
    {
     Scanner in= new Scanner(System.in);
     int n=in.nextInt();
      int sq=square(n);
      int j=sq;
      System.out.println(j);
	   
	} 
}