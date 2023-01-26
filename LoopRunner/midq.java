import java.util.*;
public class midq {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        System.out.println("Enter a number");
        double x=a.nextDouble();
        int count=0;
        for(int i=0;i<x && x>=5;i++){
            x=x/5;
            count++;
        }
System.out.println("loop ran "+ count+" times");
    }
    
}
