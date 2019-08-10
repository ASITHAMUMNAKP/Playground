import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
       int r=in.nextInt();
       int c=in.nextInt();
      for(int i=0;i<r;i++)
      {
		for(int j=c;j>c-i;j--)
        {
          System.out.print(j);
        }
        for(int j=1;j<=c-i;j++)
        {
          System.out.print(r-i);
        }
        System.out.println();
      }
        
    }
}