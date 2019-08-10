class MyModel1 {
     int model=1;
       int camera=2;
      public MyModel1()
      {
       System.out.println("Features of MyModel "+model);
       System.out.println("Camera mega pixels: "+camera);
      }
}
class MyModel2 extends MyModel1 {
      int cam=5;
       String lock="Fingerprint";
      int disp=5;
     public MyModel2()
     {
        System.out.println("Features of MyModel "+camera);
       System.out.println("Camera mega pixels: "+cam);
      System.out.println("Lock mechanism: "+lock);
       System.out.println("Display size: "+disp);

     }
}
class MyModel2T extends MyModel2 {
  int disp=6;
  public MyModel2T()
  {
        System.out.println("Features of MyModel 2T");
        System.out.println("Camera mega pixels: 16");
          System.out.println("Lock mechanism: "+lock);
            System.out.println("Display size: "+disp);
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
          MyModel2T a= new MyModel2T();
    }
}