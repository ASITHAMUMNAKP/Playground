import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in= new Scanner(System.in);
          int n=in.nextInt();
         for(int i=2;i<=n;i++)
         {
           int is=1;
           for(int j=2;j<=i/2;j++)
           {
             if(i%j==0)
             {
               is=0;
               break;
             }
           }
           if(is==1)
           {
             System.out.println(i);
           }
           
         }
             
	}
}