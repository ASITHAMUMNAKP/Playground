import java.util.Scanner;
class Main
{ 
  public static int powe(int b,int e)
  {
    int p=1;
    while(e>0)
    {
      p=p*b;
      e--;
    }
    
return p;
  }
  
  public static void main(String args[])
  { 
    Scanner in = new Scanner(System.in);
    int n1=in.nextInt();
    int n2=in.nextInt();
   int j= powe(n1,n2);
    int k=j;
    System.out.println(k);
  }
  
 
  }
