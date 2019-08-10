import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
     int n=in.nextInt();
    int i,m=3;
    for(i=1;i<=n;i++)
    {
		System.out.print(i);
        if((i%m==0)&&(m!=n))
        {
        	System.out.print(",");
        }
    }
  }
}