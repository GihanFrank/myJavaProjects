import java.util.*;

public class trymethod2 
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        var startValue = (int) a.nextInt();
        System.out.println("Enter your Number: ");
        var endValue = (int) a.nextInt();
        var result=numberCounter(startValue, endValue);
       System.out.println(result) ;
    }
    public static int numberCounter(int start, int end)
    {
        if(start<end)
        {
           return end+numberCounter(start, end-1);
        }else{
            return end;
        }
        

    }

}
