import java.util.*;

class FootballTraining {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>y)
            System.out.println("Freekick");
            else
                System.out.println("Penalty");
            sc.close();
    }
}