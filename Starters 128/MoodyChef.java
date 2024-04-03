
import java.util.*;
 class MoodyChef {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-- > 0) {
             int n = sc.nextInt();
             int l = sc.nextInt();
             int r = sc.nextInt();
             int arr[] = new int[n];
             for (int i = 0; i < n; i++) {
                 arr[i] = sc.nextInt();
             }
             int happiness = 0;
             int min = 0;
             int max = 0;

             for (int i = 0; i < n; i++) {
                 if (arr[i] >= l && arr[i] <= r)
                     happiness++;
                 else
                     happiness--;

                 if (happiness <= min)
                     min = happiness;

                 if (happiness >= max)
                     max = happiness;
             }
             System.out.println(max + " " + min);
         }
         sc.close();
    }
}
