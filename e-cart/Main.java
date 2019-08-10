import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String product=in.next();
    int price=in.nextInt();
    int quantity=in.nextInt();
    int r=price*quantity;
    System.out.println("Total Price is : "+(r));
  }
}