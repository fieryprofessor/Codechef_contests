import java.util.*;
 class PepBidding {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-- > 0) {
             int n = sc.nextInt();
             int attA[] = new int[n];
             for (int i = 0; i < n; i++) {
                 attA[i] = sc.nextInt();
             }
             int defA[] = new int[n];
             for (int i = 0; i < n; i++) {
                 defA[i] = sc.nextInt();
             }
             int attP[] = new int[n];
             for (int i = 0; i < n; i++) {
                 attP[i] = sc.nextInt();
             }
             int defP[] = new int[n];
             for (int i = 0; i < n; i++) {
                 defP[i] = sc.nextInt();
             }
             int attackPowerA = 0;
             int defensePowerA = 0;
             int attackPowerP = 0;
             int defensePowerP = 0;
             for (int i = 0; i < n; i++) {
                 attackPowerA += attA[i];
             }
             for (int i = 0; i < n; i++) {
                 defensePowerA += defA[i];
             }
             for (int i = 0; i < n; i++) {
                 attackPowerP += attP[i];
             }
             for (int i = 0; i < n; i++) {
                 defensePowerP += defP[i];
             }
             if(attackPowerA>attackPowerP && defensePowerA>defensePowerP)
                 System.out.println("A");
                 else if(attackPowerA<attackPowerP && defensePowerA<defensePowerP)
                     System.out.println("P");
                 else
                 System.out.println("Draw");
         }
         sc.close();
    }
}
