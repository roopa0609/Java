public class break_ex {
   
public static void main(String[] args)
{
// Outer for loop.
   for(int i = 1; i <= 3; i++)
   {
  // Inner for loop.
     for(int j = 0; j <= 3; j++) {
           3        0      
        if(i == 2 && j == 2)
           break; // Using break statement inside for loop.
         System.out.println(i+" "+j);
     }   
   }
 }
}

}
