import java.util.*;
public class gcd {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter value");
        int value1= (int)a.nextInt();
        System.out.println("Enter value 2 ");
        int value2= (int)a.nextInt();
        int remainder=value1%value2;
        while(remainder!=0){
            value1=value2;
            value2=remainder;
            remainder=value1%value2;
        }System.out.println(value2);
    }
    
}
