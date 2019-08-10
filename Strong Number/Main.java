import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in =new Scanner(System.in);
          int n=in.nextInt();
      int i,p,r,s,t;
      t=n;
      s=0;
      while(n!=0)
      {
        r=n%10;
		p=1;        
      for(i=1;i<=r;i++)
      {
		
        
          p=p*i;
        
      }
      s=s+p;
      n=n/10;
      }
      if(s==t)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
	
	}
}