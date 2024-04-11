import java.util.*;

class ProductCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            if (checker(array)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }

    @SuppressWarnings("unused")
    public static boolean checker(int[] array) {
        int twocounter = 0;
        int onecounter = 0;
        for (int i : array) {
            if (i == 2)
                twocounter++;
            else if (i == 1)
                onecounter++;
            else
                return false;
        }
        if (twocounter % 8 == 0)
            return true;
        else
            return false;
    }
    
}