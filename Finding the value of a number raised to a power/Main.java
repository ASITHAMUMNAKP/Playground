import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int r=1;
      int b=in.nextInt();
      int e=in.nextInt();
      while(e!=0)
      {
        r=r*b;
        e--;
        
      }
		System.out.println(r);
    }
}