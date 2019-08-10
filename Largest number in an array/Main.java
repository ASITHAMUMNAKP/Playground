import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
      int idx;
        // Get the array elements
        for(idx = 0; idx < arr_size ; idx++)
        {
            arr[idx] = in.nextInt();
        }
      int max=arr[0];
       for(idx = 0; idx < arr_size ; idx++)
        {
            if(max<arr[idx])
            {
              max=arr[idx];
            }

        }
      System.out.println(max);
    }
}