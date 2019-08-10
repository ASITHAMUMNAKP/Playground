import java.util.Scanner;
class Main{  
  public static int sum(int num)
  {
      int s=0;
    while(num>0)
    {
      s=s+num;
      num--;
    }
      return s;
  }
	public static void main (String[] args)
    {
     Scanner in= new Scanner(System.in);
     int n=in.nextInt();
      int sq=sum(n);
      int j=sq;
      System.out.println(j);

	}
}