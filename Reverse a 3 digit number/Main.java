import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    int f,m,l;
    f=n/100;
    m=((n/10)%10);
    l=n%10;
    int r;
    r=(l*100)+(m*10)+f;
    System.out.println(r);
    
  }
}