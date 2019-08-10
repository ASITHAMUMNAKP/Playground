import java.util.Scanner;

class Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("Base Salary: "+basesalary);
  }
}
class CSE extends Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("CSE Faculty: "+(basesalary+3000));
  }
}
class IT extends CSE
{
  public void salary(int basesalary)
  {
    System.out.println("IT Faculty: "+(basesalary+5000));
  }
} 
class ECE extends IT
{
  public void salary(int basesalary)
  {
    System.out.println("ECE Faculty: "+(basesalary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
     int ba=in.nextInt();
     Faculty a=new Faculty();
       a.salary(ba);
     CSE b=new CSE();
       b.salary(ba);
      IT c=new IT();
       c.salary(ba);
     
    ECE obj = new ECE();
    obj.salary(ba);
  }
}