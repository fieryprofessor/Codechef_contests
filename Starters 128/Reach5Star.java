
import java.util.*;
 class Reach5Star {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int y = sc.nextInt();
         int curr_rating = x + y;
         if (curr_rating >= 2000)
             System.out.println("Yes");
         else
             System.out.println("No");
         sc.close();
     }
}
