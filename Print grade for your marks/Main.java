import java.util.Scanner;
class Main {
	public static void main (String[] args) {
     Scanner in = new Scanner(System.in);
      int mark=in.nextInt();
      if(mark>=85)
        System.out.println("A");
      if(mark==75)
        System.out.println("B");
      if(mark==65)
        System.out.println("C");
     if(mark==55)
        System.out.println("D");
      
      if(mark==45)
        System.out.println("E");
      if(mark<45)
        System.out.println("Fail");
      
    }
}