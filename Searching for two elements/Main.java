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
        // Get the searching element 1
        int search_elem_1 = in.nextInt();
        // Get the search element 2
        int search_elem_2 = in.nextInt();
        // Initialize two varibles to store the given elements index
        int elem1 = -1;
        int elem2 = -1;
        // scan each element in an array
        // If element 1 and element 2 found, then store the index value 
        // Otherwise it will search till it reaches the arr_size - 1
        for(idx = 0; idx < arr_size ; idx++)
        {
            if(search_elem_1 == arr[idx])
            {
                elem1 = 1;
              break;
            }
        }
           if(elem1==1)
             {
               System.out.println(idx);
              } 
          else
          {
            System.out.println(-1);
          }
        
          for(idx = 0; idx < arr_size ; idx++)
               {
                  if(search_elem_2 == arr[idx])
                     {
                        elem2 = 1;
                        break;
                   }
            
                 }
      
      if(elem2==1)
      {
        
        System.out.println(idx);
      }  
      else
          {
            System.out.println(-1);
          }
    }
    }