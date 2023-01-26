package boolencheck;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Word ");
        String a = s.nextLine();

        char[] charA=new char[a.length()];
charA=a.toCharArray();
        for(int i=0;i<charA.length;i++){
            char[] k =new char[charA.length];
            k[i]=charA[charA.length-i-1];
            System.out.print(k[i]);

            
            
        }
    }
}
