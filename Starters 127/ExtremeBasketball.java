import java.util.*;
 class ExtremeBasketball {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t != 0) {
             int count = 0;
             int a = sc.nextInt();
             int b = sc.nextInt();
             int diff = b - a;
             if (diff <= -10) {
                 System.out.println(0);
             } else {
                 while (diff>-10) {
                     diff -= 3;
                     count++;
                 }
                 System.out.println(count);
             }
             t--;
         }
         sc.close();
    }
}
