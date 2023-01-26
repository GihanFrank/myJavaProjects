import java.util.*;

public class trymethod4 {
    public static void main(String[] args) {
        int[] array01 = { 1, 2, 5, 4, 5, 6, 7 };
        printarray(array01);
        // changearray(array01);
        // printarray(array01);
        searchArray(array01, 5);
    }

    public static void printarray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
            //
        }
        System.out.println();
    }

    public static void changearray(int[] p) {
        for (int i = 0; i < p.length; i++) {
            Scanner ax = new Scanner(System.in);
            System.out.println("Enter a Number");
            p[i] = (int) ax.nextInt();
        }
    }

    public static void searchArray(int[] p, int x) {
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (x == p[i]) {
                count++;

                System.out.println("Search result = " + i);
            }
            
        }System.out.println("count = " + count);
    }

}
