import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in =new Scanner(System.in);
          int n=in.nextInt();
      int t,r,s=0,c=0;
      t=n;
      while(n!=0)
      {
		r=n%10;
        c=r*r*r;
        s=s+c;
        n=n/10;
      }
      if(s==t)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
      
        
	}
}