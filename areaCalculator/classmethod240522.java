import java.util.*;

public class classmethod240522 {
    public static void main(String[] args) {

        // methods///////////function///////////////////////////
        //////// methods go with class, java maily have classes so we call them
        // methods/////////////////////////
        /////////////////////////
        /////////////////////
        // }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Width");
        int width = s.nextInt();
        System.out.println("Enter height");
        int height = s.nextInt();
        System.out.println(area(width, height));
        System.out.println(area(50, 100));
    }

    public static int area(int a, int b) {
        int ab = a * b;
        return ab;

    }

}
