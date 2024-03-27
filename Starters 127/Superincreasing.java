import java.util.*;
 class Superincreasing {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t != 0) {
             int n = sc.nextInt();
             int k = sc.nextInt();
             int x = sc.nextInt();
             int arr[] = new int[n];
             arr[k - 1] = x;
             int sum = 0, elegiver = 1;
             boolean check = true;
             int i = 0;

             while (i < (k - 1)) {
                 arr[i] = elegiver;
                 elegiver *= 2;
                 if (i > 0) {
                     for (int j = 0; j < i; j++) {
                         sum += arr[j];
                     }
                     if (sum > x) {
                         check = false;
                         break;
                     }
                 }
                 sum=0;
                 i++;
             }
             for (int j = 0; j < k-1; j++) {
                 sum += arr[j];
             }
             if (sum >= x)
                 check = false;

             if (check)
                 System.out.println("Yes");
             else
                 System.out.println("No");
             t--;
         }
         sc.close();
    }
}
